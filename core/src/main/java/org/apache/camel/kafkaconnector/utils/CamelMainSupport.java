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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.Endpoint;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.ExpressionClause;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.main.BaseMainSupport;
import org.apache.camel.main.Main;
import org.apache.camel.main.MainListener;
import org.apache.camel.model.FilterDefinition;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.camel.model.RouteDefinition;
import org.apache.camel.model.SplitDefinition;
import org.apache.camel.spi.DataFormat;
import org.apache.camel.support.PropertyBindingSupport;
import org.apache.camel.util.OrderedProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CamelMainSupport {
    public static final String CAMEL_DATAFORMAT_PROPERTIES_PREFIX = "camel.dataformat.";
    private static Logger log = LoggerFactory.getLogger(CamelMainSupport.class);

    private Main camelMain;
    private CamelContext camel;

    private final ExecutorService exService = Executors.newSingleThreadExecutor();
    private final CountDownLatch startFinishedSignal = new CountDownLatch(1);

    public CamelMainSupport(Map<String, String> props, String fromUrl, String toUrl, String marshal, String unmarshal) throws Exception {
        this(props, fromUrl, toUrl, marshal, unmarshal, new DefaultCamelContext());
    }

    public CamelMainSupport(Map<String, String> props, String fromUrl, String toUrl, String marshal, String unmarshal, CamelContext camelContext) throws Exception {
        log.info("Properties received: [{}]", props);
        camel = camelContext;
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

        // reordering properties to place the one starting with "#class:" first
        Map<String, String> orderedProps = new LinkedHashMap<>();
        props.keySet().stream().filter(k -> props.get(k).startsWith("#class:"))
                .forEach(k -> orderedProps.put(k, props.get(k)));
        props.keySet().stream().filter(k -> !props.get(k).startsWith("#class:"))
                .forEach(k -> orderedProps.put(k, props.get(k)));

        Properties camelProperties = new OrderedProperties();
        log.info("OrderedProperties: [{}]", orderedProps);
        camelProperties.putAll(orderedProps);

        log.info("Setting initial properties in Camel context: [{}]", camelProperties);
        this.camel.getPropertiesComponent().setInitialProperties(camelProperties);

        log.info("fromUrl received: [{}]", fromUrl);
        // creating the actual route
        this.camel.addRoutes(new RouteBuilder() {
            private static final String CUSTOM_CAMEL_ROUTE_CONFIGURATION_LIST_CONF = "_camel.custom.route.configuration.list";
            private static final String FILTER_CONFIG_KEY = "_camel.filter.expression";
            private static final String TRANSFORM_CONFIG_KEY = "_camel.transform.expression";
            private static final String SPLITTER_CONFIG_KEY = "_camel.splitter.expression";

            private String getToUrl(String feature, int index) {
                String toUrl;
                switch(feature) {
                    case SPLITTER_CONFIG_KEY:
                        toUrl = "direct:splitter_";
                        break;
                    case TRANSFORM_CONFIG_KEY:
                        toUrl = "direct:transform_";
                        break;
                    case FILTER_CONFIG_KEY:
                        toUrl = "direct:filter_";
                        break;
                    default:
                        toUrl = "direct:" + feature + "_";
                }
                return toUrl + index;
            }

            private void addFeatureRouteDefinition(String feature, String fromUrl, String toUrl) {
                String featureExpression = props.get(feature);
                RouteDefinition rd = from(fromUrl);
                if(feature.startsWith(SPLITTER_CONFIG_KEY)) {
                    rd.split().simple(featureExpression).to(toUrl);
                    return;
                }
                if(feature.startsWith(TRANSFORM_CONFIG_KEY)) {
                    rd.transform().simple(featureExpression).to(toUrl);
                    return;
                }
                if(feature.startsWith(FILTER_CONFIG_KEY)) {
                    rd.filter().simple(featureExpression).to(toUrl);
                    return;
                }
                rd.to(toUrl);
                return;
            }

            private void configureCustomRoutes(RouteDefinition rd, String toUrl) {
                final String camelCustomConfigurations = props.get(CUSTOM_CAMEL_ROUTE_CONFIGURATION_LIST_CONF);
                if(camelCustomConfigurations != null && camelCustomConfigurations.length() > 0) {
                    // final List<String> camelRouteConfigurationList = Arrays.asList(SPLITTER_CONFIG_KEY, FILTER_CONFIG_KEY, TRANSFORM_CONFIG_KEY);
                    final List<String> camelRouteConfigurationList = Arrays.asList(camelCustomConfigurations.split("\\s*,\\s*"));
                    if(camelRouteConfigurationList != null && camelRouteConfigurationList.size() > 0) {
                        rd.to(getToUrl(camelRouteConfigurationList.get(0), 0));
                        for(int i = 0; i < camelRouteConfigurationList.size(); i++) {
                            String customRouteFromUrl = getToUrl(camelRouteConfigurationList.get(i), i);
                            String customRouteToUrl = toUrl;
                            int nextIndex = i + 1;
                            if(nextIndex < camelRouteConfigurationList.size()) {
                                toUrl = getToUrl(camelRouteConfigurationList.get(nextIndex), nextIndex);
                            }
                            addFeatureRouteDefinition(
                                camelRouteConfigurationList.get(i),
                                customRouteFromUrl,
                                customRouteToUrl
                            );
                        }
                        return;
                    }
                }
                rd.to(toUrl);
            }

            public void configure() {
                log.info("fromUrl value: [{}]", fromUrl);
                RouteDefinition rd = from(fromUrl);
                if (marshal != null && unmarshal != null) {
                    throw new UnsupportedOperationException("Uses of both marshal (i.e. " + marshal + ") and unmarshal (i.e. " + unmarshal + ") is not supported");
                } else if (marshal != null) {
                    log.info("Creating Camel route from({}).marshal().custom({}).to({})", fromUrl, marshal, toUrl);
                    camel.getRegistry().bind(marshal, lookupAndInstantiateDataformat(marshal));
                    rd.marshal().custom(marshal);
                } else if (unmarshal != null) {
                    log.info("Creating Camel route from({}).unmarshal().custom({}).to({})", fromUrl, unmarshal, toUrl);
                    camel.getRegistry().bind(unmarshal, lookupAndInstantiateDataformat(unmarshal));
                    rd.unmarshal().custom(unmarshal);
                } else {
                    log.info("Creating Camel route from({}).to({})", fromUrl, toUrl);
                }
                configureCustomRoutes(rd, toUrl);
            }
        });
    }

    public void start() throws Exception {
        log.info("Starting CamelContext");

        CamelContextStarter starter = new CamelContextStarter();
        exService.execute(starter);
        startFinishedSignal.await();

        if (starter.hasException()) {
            log.info("CamelContext failed to start", starter.getException());
            throw starter.getException();
        }

        log.info("CamelContext started");
    }

    public void stop() {
        log.info("Stopping CamelContext");

        camelMain.stop();
        exService.shutdown();

        log.info("CamelContext stopped");
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

    private DataFormat lookupAndInstantiateDataformat(String dataformatName) {
        DataFormat df = camel.resolveDataFormat(dataformatName);

        if (df == null) {
            df = camel.createDataFormat(dataformatName);

            final String prefix = CAMEL_DATAFORMAT_PROPERTIES_PREFIX + dataformatName + ".";
            final Properties props = camel.getPropertiesComponent().loadProperties(k -> k.startsWith(prefix));

            CamelContextAware.trySetCamelContext(df, camel);

            if (!props.isEmpty()) {
                PropertyBindingSupport.build().withCamelContext(camel).withOptionPrefix(prefix).withRemoveParameters(false).withProperties((Map) props).withTarget(df).bind();
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
            log.trace("Signaling CamelContext startup is finished (startFinishedSignal.countDown();) due to CamelMainFinishedListener been called");
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
    }

    private class CamelContextStarter implements Runnable {
        private Exception startException;

        @Override
        public void run() {
            try {
                camelMain.run();
            } catch (Exception e) {
                log.error("An exception has occurred before CamelContext startup has finished", e);
                startException = e;
                if (startFinishedSignal.getCount() > 0) {
                    log.trace("Signaling CamelContext startup is finished (startFinishedSignal.countDown();) due to an exception");
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
