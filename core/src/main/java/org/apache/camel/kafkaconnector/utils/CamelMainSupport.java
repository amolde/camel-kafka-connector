/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.utils;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.Endpoint;
import org.apache.camel.ExtendedCamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.catalog.RuntimeCamelCatalog;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.camel.main.BaseMainSupport;
import org.apache.camel.main.Main;
import org.apache.camel.main.MainListener;
import org.apache.camel.model.RouteDefinition;
import org.apache.camel.spi.DataFormat;
import org.apache.camel.support.PropertyBindingSupport;
import org.apache.camel.util.OrderedProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CamelMainSupport {
    public static final String CAMEL_DATAFORMAT_PROPERTIES_PREFIX = "camel.dataformat.";
    public static final String CAMEL_SPRING_CONTEXT_BEAN_ID = "camelContext";
    public static final String CAMEL_FIRST_CUSTOM_ROUTE_ID = "direct:customRoute00";
    public static final String CAMEL_LAST_CUSTOM_ROUTE_ID = "direct:customRoute99";
    public static final String CAMEL_ROUTES_DSL = "camel.routes.xml.dsl";
    private static Logger log = LoggerFactory.getLogger(CamelMainSupport.class);

    private Main camelMain;
    private CamelContext camel;

    private final ExecutorService exService = Executors.newSingleThreadExecutor();
    private final CountDownLatch startFinishedSignal = new CountDownLatch(1);

    private static String getCustomRoutesFile(Map<String, String> props) {
        String customRoutesFile = props.get(CAMEL_ROUTES_DSL);
        if(customRoutesFile != null && customRoutesFile.length() > 0) {
            return customRoutesFile;
        }
        return null;
    }

    private static boolean isSourceConnector(Map<String, String> props) {
        String camelSourceUrl = props.get(CamelSourceConnectorConfig.CAMEL_SOURCE_URL_CONF);
        return (camelSourceUrl != null && camelSourceUrl.length() > 0);
    }

    private static CamelContext getCamelContext(Map<String, String> props, CamelContext camelContext) {
        String customRoutesFile = getCustomRoutesFile(props);
        if(customRoutesFile != null) {
            AbstractApplicationContext ctx = new FileSystemXmlApplicationContext(customRoutesFile);
            CamelContext camelCtx = (CamelContext) ctx.getBean(CAMEL_SPRING_CONTEXT_BEAN_ID);
            camelCtx.stop();
            return camelCtx;
        }
        return camelContext == null ? new DefaultCamelContext() : camelContext;
    }

    public CamelMainSupport(Map<String, String> props, String fromUrl, String toUrl, String marshal, String unmarshal) throws Exception {
        this(props, fromUrl, toUrl, marshal, unmarshal, null);
    }

    public CamelMainSupport(Map<String, String> props, String fromUrl, String toUrl, String marshal, String unmarshal, CamelContext camelContext) throws Exception {
        camel = getCamelContext(props, camelContext);
        camelMain = new Main() {
            @Override
            protected ProducerTemplate findOrCreateCamelTemplate() {
                return camel.createProducerTemplate();
            }

            @Override
            protected CamelContext createCamelContext() {
                return camel;
            }
        };

        camelMain.addMainListener(new CamelMainFinishedListener());
        camelMain.configure().setAutoConfigurationLogSummary(false);

        // reordering properties to place the one starting with "#class:" first
        LinkedHashMap<String, String> orderedProps = new LinkedHashMap<>();
        props.keySet().stream()
                .filter(k -> props.get(k).startsWith("#class:"))
                .forEach(k -> orderedProps.put(k, props.get(k)));
        props.keySet().stream()
                .filter(k -> !props.get(k).startsWith("#class:"))
                .forEach(k -> orderedProps.put(k, props.get(k)));

        Properties camelProperties = new OrderedProperties();
        camelProperties.putAll(orderedProps);

        LOG.info("Setting initial properties in Camel context: [{}]", camelProperties);
        this.camel.getPropertiesComponent().setInitialProperties(camelProperties);

        // creating the actual route
        this.camel.addRoutes(new RouteBuilder() {
            private void setCustomRoute(RouteDefinition rd, String toUrl) {
                if(getCustomRoutesFile(props) != null) {
                    rd.to(CAMEL_FIRST_CUSTOM_ROUTE_ID);
                    if(isSourceConnector(props)) {
                        from(CAMEL_LAST_CUSTOM_ROUTE_ID).to(toUrl);
                    }
                    return;
                }
                rd.to(toUrl);
            }
            public void configure() {
                RouteDefinition rd = from(fromUrl);
                if (marshal != null && unmarshal != null) {
                    throw new UnsupportedOperationException("Uses of both marshal (i.e. " + marshal + ") and unmarshal (i.e. " + unmarshal + ") is not supported");
                } else if (marshal != null) {
                    LOG.info("Creating Camel route from({}).marshal().custom({}).to({})", fromUrl, marshal, toUrl);
                    camel.getRegistry().bind(marshal, lookupAndInstantiateDataformat(marshal));
                    rd.marshal().custom(marshal);
                } else if (unmarshal != null) {
                    LOG.info("Creating Camel route from({}).unmarshal().custom({}).to({})", fromUrl, unmarshal, toUrl);
                    camel.getRegistry().bind(unmarshal, lookupAndInstantiateDataformat(unmarshal));
                    rd.unmarshal().custom(unmarshal);
                } else {
                    LOG.info("Creating Camel route from({}).to({})", fromUrl, toUrl);
                }
                if (camel.getRegistry().lookupByName("aggregate") != null) {
                    AggregationStrategy s = (AggregationStrategy) camel.getRegistry().lookupByName("aggregate");
                    rd.aggregate(s).constant(true).completionSize(aggregationSize).completionTimeout(aggregationTimeout).toD(toUrl);
                } else {
                    rd.toD(toUrl);
                }
                setCustomRoute(rd, toUrl);
            }
        });
    }

    public void start() throws Exception {
        LOG.info("Starting CamelContext");

        CamelContextStarter starter = new CamelContextStarter();
        exService.execute(starter);
        startFinishedSignal.await();

        if (starter.hasException()) {
            LOG.info("CamelContext failed to start", starter.getException());
            throw starter.getException();
        }

        LOG.info("CamelContext started");
    }

    public void stop() {
        LOG.info("Stopping CamelContext");

        camelMain.stop();
        exService.shutdown();

        LOG.info("CamelContext stopped");
    }

    public ProducerTemplate createProducerTemplate() {
        return camel.createProducerTemplate();
    }

    public Endpoint getEndpoint(String uri) {
        return camel.getEndpoint(uri);
    }

    public Collection<Endpoint> getEndpoints() {
        return camel.getEndpoints();
    }

    public ConsumerTemplate createConsumerTemplate() {
        return camel.createConsumerTemplate();
    }

    public RuntimeCamelCatalog getRuntimeCamelCatalog() {
        return camel.adapt(ExtendedCamelContext.class).getRuntimeCamelCatalog();
    }

    private DataFormat lookupAndInstantiateDataformat(String dataformatName) {
        DataFormat df = camel.resolveDataFormat(dataformatName);

        if (df == null) {
            df = camel.createDataFormat(dataformatName);

            final String prefix = CAMEL_DATAFORMAT_PROPERTIES_PREFIX + dataformatName + ".";
            final Properties props = camel.getPropertiesComponent().loadProperties(k -> k.startsWith(prefix));

            CamelContextAware.trySetCamelContext(df, camel);

            if (!props.isEmpty()) {
                PropertyBindingSupport.build()
                        .withCamelContext(camel)
                        .withOptionPrefix(prefix)
                        .withRemoveParameters(false)
                        .withProperties((Map) props)
                        .withTarget(df)
                        .bind();
            }
        }

        //TODO: move it to the caller?
        if (df == null) {
            throw new UnsupportedOperationException("No DataFormat found with name " + dataformatName);
        }
        return df;
    }

    private class CamelMainFinishedListener implements MainListener {
        @Override
        public void configure(CamelContext context) {

        }

        @Override
        public void beforeStart(BaseMainSupport main) {

        }

        @Override
        public void afterStart(BaseMainSupport main) {
            LOG.trace("Signaling CamelContext startup is finished (startFinishedSignal.countDown();) due to CamelMainFinishedListener been called");
            startFinishedSignal.countDown();
        }

        @Override
        public void beforeStop(BaseMainSupport main) {

        }

        @Override
        public void afterStop(BaseMainSupport main) {

        }

        @Override
        public void beforeConfigure(BaseMainSupport main) {
        }

        @Override
        public void afterConfigure(BaseMainSupport main) {

        }

        @Override
        public void beforeInitialize(BaseMainSupport main) {

        }
    }

    private class CamelContextStarter implements Runnable {
        private Exception startException;

        @Override
        public void run() {
            try {
                camelMain.run();
            } catch (Exception e) {
                LOG.error("An exception has occurred before CamelContext startup has finished", e);
                startException = e;
                if (startFinishedSignal.getCount() > 0) {
                    LOG.trace("Signaling CamelContext startup is finished (startFinishedSignal.countDown();) due to an exception");
                    startFinishedSignal.countDown();
                }
            }
        }

        public boolean hasException() {
            return startException != null;
        }

        public Exception getException() {
            return startException;
        }
    }
}
