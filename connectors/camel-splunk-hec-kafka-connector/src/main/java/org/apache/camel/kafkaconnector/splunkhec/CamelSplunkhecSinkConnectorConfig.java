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
package org.apache.camel.kafkaconnector.splunkhec;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelSplunkhecSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_SPLUNKHEC_PATH_SPLUNK_URLCONF = "camel.sink.path.splunkURL";
    public static final String CAMEL_SINK_SPLUNKHEC_PATH_SPLUNK_URLDOC = "Splunk Host URL";
    public static final String CAMEL_SINK_SPLUNKHEC_PATH_SPLUNK_URLDEFAULT = null;
    public static final String CAMEL_SINK_SPLUNKHEC_PATH_TOKEN_CONF = "camel.sink.path.token";
    public static final String CAMEL_SINK_SPLUNKHEC_PATH_TOKEN_DOC = "Splunk authorization token";
    public static final String CAMEL_SINK_SPLUNKHEC_PATH_TOKEN_DEFAULT = null;
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_BODY_ONLY_CONF = "camel.sink.endpoint.bodyOnly";
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_BODY_ONLY_DOC = "Send only the message body";
    public static final Boolean CAMEL_SINK_SPLUNKHEC_ENDPOINT_BODY_ONLY_DEFAULT = false;
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_HEADERS_ONLY_CONF = "camel.sink.endpoint.headersOnly";
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_HEADERS_ONLY_DOC = "Send only message headers";
    public static final Boolean CAMEL_SINK_SPLUNKHEC_ENDPOINT_HEADERS_ONLY_DEFAULT = false;
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_HOST_CONF = "camel.sink.endpoint.host";
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_HOST_DOC = "Splunk host.";
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_INDEX_CONF = "camel.sink.endpoint.index";
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_INDEX_DOC = "Splunk index to write to";
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_INDEX_DEFAULT = "camel";
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_SPLUNKHEC_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_SOURCE_CONF = "camel.sink.endpoint.source";
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_SOURCE_DOC = "Splunk source argument";
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_SOURCE_DEFAULT = "camel";
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_SOURCE_TYPE_CONF = "camel.sink.endpoint.sourceType";
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_SOURCE_TYPE_DOC = "Splunk sourcetype argument";
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_SOURCE_TYPE_DEFAULT = "camel";
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_HTTPS_CONF = "camel.sink.endpoint.https";
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_HTTPS_DOC = "Contact HEC over https.";
    public static final Boolean CAMEL_SINK_SPLUNKHEC_ENDPOINT_HTTPS_DEFAULT = true;
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_SKIP_TLS_VERIFY_CONF = "camel.sink.endpoint.skipTlsVerify";
    public static final String CAMEL_SINK_SPLUNKHEC_ENDPOINT_SKIP_TLS_VERIFY_DOC = "Splunk HEC TLS verification.";
    public static final Boolean CAMEL_SINK_SPLUNKHEC_ENDPOINT_SKIP_TLS_VERIFY_DEFAULT = false;
    public static final String CAMEL_SINK_SPLUNKHEC_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.splunk-hec.lazyStartProducer";
    public static final String CAMEL_SINK_SPLUNKHEC_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_SPLUNKHEC_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_SPLUNKHEC_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.splunk-hec.autowiredEnabled";
    public static final String CAMEL_SINK_SPLUNKHEC_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_SPLUNKHEC_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelSplunkhecSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelSplunkhecSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_SPLUNKHEC_PATH_SPLUNK_URLCONF, ConfigDef.Type.STRING, CAMEL_SINK_SPLUNKHEC_PATH_SPLUNK_URLDEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_SPLUNKHEC_PATH_SPLUNK_URLDOC);
        conf.define(CAMEL_SINK_SPLUNKHEC_PATH_TOKEN_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SPLUNKHEC_PATH_TOKEN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_SPLUNKHEC_PATH_TOKEN_DOC);
        conf.define(CAMEL_SINK_SPLUNKHEC_ENDPOINT_BODY_ONLY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SPLUNKHEC_ENDPOINT_BODY_ONLY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SPLUNKHEC_ENDPOINT_BODY_ONLY_DOC);
        conf.define(CAMEL_SINK_SPLUNKHEC_ENDPOINT_HEADERS_ONLY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SPLUNKHEC_ENDPOINT_HEADERS_ONLY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SPLUNKHEC_ENDPOINT_HEADERS_ONLY_DOC);
        conf.define(CAMEL_SINK_SPLUNKHEC_ENDPOINT_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SPLUNKHEC_ENDPOINT_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SPLUNKHEC_ENDPOINT_HOST_DOC);
        conf.define(CAMEL_SINK_SPLUNKHEC_ENDPOINT_INDEX_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SPLUNKHEC_ENDPOINT_INDEX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SPLUNKHEC_ENDPOINT_INDEX_DOC);
        conf.define(CAMEL_SINK_SPLUNKHEC_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SPLUNKHEC_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SPLUNKHEC_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_SPLUNKHEC_ENDPOINT_SOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SPLUNKHEC_ENDPOINT_SOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SPLUNKHEC_ENDPOINT_SOURCE_DOC);
        conf.define(CAMEL_SINK_SPLUNKHEC_ENDPOINT_SOURCE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SPLUNKHEC_ENDPOINT_SOURCE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SPLUNKHEC_ENDPOINT_SOURCE_TYPE_DOC);
        conf.define(CAMEL_SINK_SPLUNKHEC_ENDPOINT_HTTPS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SPLUNKHEC_ENDPOINT_HTTPS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SPLUNKHEC_ENDPOINT_HTTPS_DOC);
        conf.define(CAMEL_SINK_SPLUNKHEC_ENDPOINT_SKIP_TLS_VERIFY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SPLUNKHEC_ENDPOINT_SKIP_TLS_VERIFY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SPLUNKHEC_ENDPOINT_SKIP_TLS_VERIFY_DOC);
        conf.define(CAMEL_SINK_SPLUNKHEC_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SPLUNKHEC_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SPLUNKHEC_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_SPLUNKHEC_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SPLUNKHEC_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SPLUNKHEC_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}