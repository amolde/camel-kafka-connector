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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.kafkaconnector.CamelConnectorConfig;
import org.apache.camel.main.SimpleMain;
import org.apache.camel.model.RouteDefinition;
import org.apache.camel.processor.idempotent.kafka.KafkaIdempotentRepository;
import org.apache.camel.spi.IdempotentRepository;
import org.apache.camel.support.processor.idempotent.MemoryIdempotentRepository;
import org.apache.camel.support.service.ServiceHelper;
import org.apache.camel.util.ObjectHelper;
import org.apache.camel.util.SensitiveUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CamelKafkaConnectMain extends SimpleMain {
    public static final String CAMEL_ROUTES_DSL = "camel.routes.xml.dsl";
    public static final String CAMEL_SPRING_CONTEXT_BEAN_ID = "camelContext";
    public static final String CAMEL_FIRST_CUSTOM_ROUTE_ID = "direct:customRoute00";
    public static final String CAMEL_DATAFORMAT_PROPERTIES_PREFIX = "camel.dataformat.";
    private static final Logger LOG = LoggerFactory.getLogger(CamelKafkaConnectMain.class);

    protected volatile ConsumerTemplate consumerTemplate;
    protected volatile ProducerTemplate producerTemplate;

    public CamelKafkaConnectMain(CamelContext context) {
        super(context);
    }

    @Override
    protected void doStop() throws Exception {
        ServiceHelper.stopService(consumerTemplate);
        consumerTemplate = null;

        ServiceHelper.stopService(producerTemplate);
        producerTemplate = null;

        super.doStop();
    }

    public ProducerTemplate getProducerTemplate() {
        if (this.producerTemplate == null) {
            synchronized (this) {
                if (this.producerTemplate == null) {
                    this.producerTemplate = getCamelContext().createProducerTemplate();
                }
            }
        }

        return this.producerTemplate;
    }

    public ConsumerTemplate getConsumerTemplate() {
        if (this.consumerTemplate == null) {
            synchronized (this) {
                if (this.consumerTemplate == null) {
                    this.consumerTemplate = getCamelContext().createConsumerTemplate();
                }
            }
        }

        return this.consumerTemplate;
    }

    public static Builder builder(String from, String to) {
        return new Builder(from, to);
    }

    public static final class Builder {
        private final String from;
        private String to;
        private Map<String, String> props;
        private String marshallDataFormat;
        private String unmarshallDataFormat;
        private int aggregationSize;
        private long aggregationTimeout;
        private String errorHandler;
        private int maxRedeliveries;
        private long redeliveryDelay;
        private boolean idempotencyEnabled;
        private String expressionType;
        private String expressionHeader;
        private int memoryDimension;
        private String idempotentRepositoryType;
        private String idempotentRepositoryTopicName;
        private String idempotentRepositoryKafkaServers;
        private int idempotentRepositoryKafkaMaxCacheSize;
        private int idempotentRepositoryKafkaPollDuration;
        private String headersExcludePattern;

        public Builder(String from, String to) {
            this.from = from;
            this.to = to;
        }

        public Builder withProperties(Map<String, String> props) {
            this.props = new HashMap<>(props);
            if(getCustomRoutesFile(props) != null) {
                this.to = CAMEL_FIRST_CUSTOM_ROUTE_ID;
            }
            return this;
        }

        public Builder withMarshallDataFormat(String dataformatId) {
            this.marshallDataFormat = dataformatId;
            return this;
        }

        public Builder withUnmarshallDataFormat(String dataformatId) {
            this.unmarshallDataFormat = dataformatId;
            return this;
        }

        public Builder withAggregationSize(int aggregationSize) {
            this.aggregationSize = aggregationSize;
            return this;
        }

        public Builder withAggregationTimeout(long aggregationTimeout) {
            this.aggregationTimeout = aggregationTimeout;
            return this;
        }
        
        public Builder withErrorHandler(String errorHandler) {
            this.errorHandler = errorHandler;
            return this;
        }
        
        public Builder withMaxRedeliveries(int maxRedeliveries) {
            this.maxRedeliveries = maxRedeliveries;
            return this;
        }
        
        public Builder withRedeliveryDelay(long redeliveryDelay) {
            this.redeliveryDelay = redeliveryDelay;
            return this;
        }
        
        public Builder withIdempotencyEnabled(boolean idempotencyEnabled) {
            this.idempotencyEnabled = idempotencyEnabled;
            return this;
        }
        
        public Builder withExpressionType(String expressionType) {
            this.expressionType = expressionType;
            return this;
        }
        
        public Builder withExpressionHeader(String expressionHeader) {
            this.expressionHeader = expressionHeader;
            return this;
        }
        
        public Builder withMemoryDimension(int memoryDimension) {
            this.memoryDimension = memoryDimension;
            return this;
        }
        
        public Builder withIdempotentRepositoryType(String idempotentRepositoryType) {
            this.idempotentRepositoryType = idempotentRepositoryType;
            return this;
        }
        
        public Builder withIdempotentRepositoryTopicName(String idempotentRepositoryTopicName) {
            this.idempotentRepositoryTopicName = idempotentRepositoryTopicName;
            return this;
        }
        
        public Builder withIdempotentRepositoryKafkaServers(String idempotentRepositoryKafkaServers) {
            this.idempotentRepositoryKafkaServers = idempotentRepositoryKafkaServers;
            return this;
        }
        
        public Builder withIdempotentRepositoryKafkaMaxCacheSize(int idempotentRepositoryKafkaMaxCacheSize) {
            this.idempotentRepositoryKafkaMaxCacheSize = idempotentRepositoryKafkaMaxCacheSize;
            return this;
        }
        
        public Builder withIdempotentRepositoryKafkaPollDuration(int idempotentRepositoryKafkaPollDuration) {
            this.idempotentRepositoryKafkaPollDuration = idempotentRepositoryKafkaPollDuration;
            return this;
        }
        
        public Builder withHeadersExcludePattern(String headersExcludePattern) {
            this.headersExcludePattern = headersExcludePattern;
            return this;
        }

        private String filterSensitive(Map.Entry<Object, Object> entry) {

            if (SensitiveUtils.containsSensitive((String) entry.getKey())) {
                return entry.getKey() + "=xxxxxxx";
            }
            return entry.getKey() + "=" + entry.getValue();
        }

        private static String getCustomRoutesFile(Map<String, String> props) {
            String customRoutesFile = props.get(CAMEL_ROUTES_DSL);
            if(customRoutesFile != null && customRoutesFile.length() > 0) {
                return customRoutesFile;
            }
            return null;
        }
        
        private CamelContext getCustomCamelContext(CamelContext camelContext) {
            String customRoutesFile = getCustomRoutesFile(props);
            if(customRoutesFile != null) {
                AbstractApplicationContext ctx = new FileSystemXmlApplicationContext(customRoutesFile);
                CamelContext camelCtx = (CamelContext) ctx.getBean(CAMEL_SPRING_CONTEXT_BEAN_ID);
                return camelCtx;
            }
            return camelContext == null ? new DefaultCamelContext() : camelContext;
        }

        private static boolean isSourceConnector(Map<String, String> props) {
            String camelSourceUrl = props.get(CamelSourceConnectorConfig.CAMEL_SOURCE_URL_CONF);
            return (camelSourceUrl != null && camelSourceUrl.length() > 0);
        }
    
        public CamelKafkaConnectMain build(CamelContext camelContext) {
            CamelKafkaConnectMain camelMain = new CamelKafkaConnectMain(getCustomCamelContext(camelContext));
            camelMain.configure().setAutoConfigurationLogSummary(false);

            Properties camelProperties = new Properties();
            camelProperties.putAll(props);

            List<String> filteredProps = camelProperties.entrySet().stream().map(this::filterSensitive).collect(Collectors.toList());

            LOG.info("Setting initial properties in Camel context: [{}]", filteredProps);
            camelMain.setInitialProperties(camelProperties);
            
            // Instantianting the idempotent Repository here and inject it in registry to be referenced
            if (idempotencyEnabled) {
                IdempotentRepository idempotentRepo = null;
                switch (idempotentRepositoryType) {
                    case "memory":
                        idempotentRepo = MemoryIdempotentRepository.memoryIdempotentRepository(memoryDimension);
                        break;
                    case "kafka":
                        idempotentRepo = new KafkaIdempotentRepository(idempotentRepositoryTopicName, idempotentRepositoryKafkaServers, idempotentRepositoryKafkaMaxCacheSize, idempotentRepositoryKafkaPollDuration);
                        break;
                    default:
                        break;
                }
                camelMain.getCamelContext().getRegistry().bind("idempotentRepository", idempotentRepo);
            }

            //creating the actual route
            camelMain.configure().addRoutesBuilder(new RouteBuilder() {
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
                    //from
                    RouteDefinition rd = from(from);
                    LOG.info("Creating Camel route from({})", from);
                    
                    if (!ObjectHelper.isEmpty(errorHandler)) {
                        switch (errorHandler) {
                            case "no":
                                rd.errorHandler(noErrorHandler());
                                break;
                            case "default":
                                rd.errorHandler(defaultErrorHandler().maximumRedeliveries(maxRedeliveries).redeliveryDelay(redeliveryDelay));
                                break;
                            default:
                                break;
                        }
                    }

                    //dataformats
                    if (!ObjectHelper.isEmpty(marshallDataFormat)) {
                        LOG.info(".marshal({})", marshallDataFormat);
                        rd.marshal(marshallDataFormat);
                    }
                    if (!ObjectHelper.isEmpty(unmarshallDataFormat)) {
                        LOG.info(".unmarshal({})", unmarshallDataFormat);
                        rd.unmarshal(unmarshallDataFormat);
                    }
                    if (getContext().getRegistry().lookupByName("aggregate") != null) {
                        //aggregation
                        AggregationStrategy s = getContext().getRegistry().lookupByNameAndType(CamelConnectorConfig.CAMEL_CONNECTOR_AGGREGATE_NAME, AggregationStrategy.class);
                        if (idempotencyEnabled) {
                            switch (expressionType) {
                                case "body":
                                    LOG.info(".aggregate({}).constant(true).completionSize({}).completionTimeout({}).idempotentConsumer(body(), + "
                                           + "MemoryIdempotentRepository.memoryIdempotentRepository({}))", s, aggregationSize, aggregationTimeout, memoryDimension);
                                    LOG.info(".to({})", to);
                                    if (ObjectHelper.isEmpty(headersExcludePattern)) {
                                        rd.aggregate(s).constant(true).completionSize(aggregationSize).completionTimeout(aggregationTimeout).idempotentConsumer(body()).messageIdRepositoryRef("idempotentRepository").toD(to);
                                    } else {
                                        rd.aggregate(s).constant(true).completionSize(aggregationSize).completionTimeout(aggregationTimeout)
                                            .idempotentConsumer(body()).messageIdRepositoryRef("idempotentRepository").removeHeaders(headersExcludePattern).toD(to);
                                    }
                                    break;
                                case "header":
                                    LOG.info(".aggregate({}).constant(true).completionSize({}).completionTimeout({}).idempotentConsumer(header(expressionHeader), + "
                                           + "MemoryIdempotentRepository.memoryIdempotentRepository({}))", s, aggregationSize, aggregationTimeout, memoryDimension);
                                    LOG.info(".to({})", to);
                                    if (ObjectHelper.isEmpty(headersExcludePattern)) {
                                        rd.aggregate(s).constant(true).completionSize(aggregationSize).completionTimeout(aggregationTimeout)
                                            .idempotentConsumer(header(expressionHeader)).messageIdRepositoryRef("idempotentRepository").toD(to);
                                    } else {
                                        rd.aggregate(s).constant(true).completionSize(aggregationSize).completionTimeout(aggregationTimeout)
                                            .idempotentConsumer(header(expressionHeader)).messageIdRepositoryRef("idempotentRepository").removeHeaders(headersExcludePattern).toD(to);
                                    }
                                    break;
                                default:
                                    break;
                            }
                        } else {
                            LOG.info(".aggregate({}).constant(true).completionSize({}).completionTimeout({})", s, aggregationSize, aggregationTimeout);
                            LOG.info(".to({})", to);
                            if (ObjectHelper.isEmpty(headersExcludePattern)) {
                                rd.aggregate(s).constant(true).completionSize(aggregationSize).completionTimeout(aggregationTimeout).toD(to);
                            } else {
                                rd.aggregate(s).constant(true).completionSize(aggregationSize).completionTimeout(aggregationTimeout).removeHeaders(headersExcludePattern).toD(to);
                            }
                        }
                    } else {
                        if (idempotencyEnabled) {
                            switch (expressionType) {
                                case "body":
                                    LOG.info("idempotentConsumer(body(), MemoryIdempotentRepository.memoryIdempotentRepository({})).to({})", memoryDimension, to);
                                    if (ObjectHelper.isEmpty(headersExcludePattern)) {
                                        rd.idempotentConsumer(body()).messageIdRepositoryRef("idempotentRepository").toD(to);
                                    } else {
                                        rd.idempotentConsumer(body()).messageIdRepositoryRef("idempotentRepository").removeHeaders(headersExcludePattern).toD(to);
                                    }
                                    break;
                                case "header":
                                    LOG.info("idempotentConsumer(header(expressionHeader), MemoryIdempotentRepository.memoryIdempotentRepository({})).to({})", memoryDimension, to);
                                    if (ObjectHelper.isEmpty(headersExcludePattern)) {
                                        rd.idempotentConsumer(header(expressionHeader)).messageIdRepositoryRef("idempotentRepository").toD(to);
                                    } else {
                                        rd.idempotentConsumer(header(expressionHeader)).messageIdRepositoryRef("idempotentRepository").removeHeaders(headersExcludePattern).toD(to);
                                    }
                                    break;
                                default:
                                    break;
                            }
                        } else {
                            //to
                            LOG.info(".to({})", to);
                            if (ObjectHelper.isEmpty(headersExcludePattern)) {
                                rd.toD(to);
                            } else {
                                rd.removeHeaders(headersExcludePattern).toD(to);
                            }
                        }
                    }
                    setCustomRoute(rd, to);
                }
            });

            return camelMain;
        }
    }
}
