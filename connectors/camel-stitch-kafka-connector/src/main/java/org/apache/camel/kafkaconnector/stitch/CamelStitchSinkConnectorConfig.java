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
package org.apache.camel.kafkaconnector.stitch;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelStitchSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_STITCH_PATH_TABLE_NAME_CONF = "camel.sink.path.tableName";
    public static final String CAMEL_SINK_STITCH_PATH_TABLE_NAME_DOC = "The name of the destination table the data is being pushed to. Table names must be unique in each destination schema, or loading issues will occur. Note: The number of characters in the table name should be within the destinations allowed limits or data will rejected.";
    public static final String CAMEL_SINK_STITCH_PATH_TABLE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_STITCH_ENDPOINT_KEY_NAMES_CONF = "camel.sink.endpoint.keyNames";
    public static final String CAMEL_SINK_STITCH_ENDPOINT_KEY_NAMES_DOC = "A collection of comma separated strings representing the Primary Key fields in the source table. Stitch use these Primary Keys to de-dupe data during loading If not provided, the table will be loaded in an append-only manner.";
    public static final String CAMEL_SINK_STITCH_ENDPOINT_KEY_NAMES_DEFAULT = null;
    public static final String CAMEL_SINK_STITCH_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_STITCH_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_STITCH_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_STITCH_ENDPOINT_REGION_CONF = "camel.sink.endpoint.region";
    public static final String CAMEL_SINK_STITCH_ENDPOINT_REGION_DOC = "Stitch account region, e.g: europe One of: [NORTH_AMERICA] [EUROPE]";
    public static final String CAMEL_SINK_STITCH_ENDPOINT_REGION_DEFAULT = "EUROPE";
    public static final String CAMEL_SINK_STITCH_ENDPOINT_STITCH_SCHEMA_CONF = "camel.sink.endpoint.stitchSchema";
    public static final String CAMEL_SINK_STITCH_ENDPOINT_STITCH_SCHEMA_DOC = "A schema that describes the record(s)";
    public static final String CAMEL_SINK_STITCH_ENDPOINT_STITCH_SCHEMA_DEFAULT = null;
    public static final String CAMEL_SINK_STITCH_ENDPOINT_CONNECTION_PROVIDER_CONF = "camel.sink.endpoint.connectionProvider";
    public static final String CAMEL_SINK_STITCH_ENDPOINT_CONNECTION_PROVIDER_DOC = "ConnectionProvider contain configuration for the HttpClient like Maximum connection limit .. etc, you can inject this ConnectionProvider and the StitchClient will initialize HttpClient with this ConnectionProvider";
    public static final String CAMEL_SINK_STITCH_ENDPOINT_CONNECTION_PROVIDER_DEFAULT = null;
    public static final String CAMEL_SINK_STITCH_ENDPOINT_HTTP_CLIENT_CONF = "camel.sink.endpoint.httpClient";
    public static final String CAMEL_SINK_STITCH_ENDPOINT_HTTP_CLIENT_DOC = "Reactor Netty HttpClient, you can injected it if you want to have custom HttpClient";
    public static final String CAMEL_SINK_STITCH_ENDPOINT_HTTP_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_STITCH_ENDPOINT_STITCH_CLIENT_CONF = "camel.sink.endpoint.stitchClient";
    public static final String CAMEL_SINK_STITCH_ENDPOINT_STITCH_CLIENT_DOC = "Set a custom StitchClient that implements org.apache.camel.component.stitch.client.StitchClient interface";
    public static final String CAMEL_SINK_STITCH_ENDPOINT_STITCH_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_STITCH_ENDPOINT_TOKEN_CONF = "camel.sink.endpoint.token";
    public static final String CAMEL_SINK_STITCH_ENDPOINT_TOKEN_DOC = "Stitch access token for the Stitch Import API";
    public static final String CAMEL_SINK_STITCH_ENDPOINT_TOKEN_DEFAULT = null;
    public static final String CAMEL_SINK_STITCH_COMPONENT_CONFIGURATION_CONF = "camel.component.stitch.configuration";
    public static final String CAMEL_SINK_STITCH_COMPONENT_CONFIGURATION_DOC = "The component configurations";
    public static final String CAMEL_SINK_STITCH_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_STITCH_COMPONENT_KEY_NAMES_CONF = "camel.component.stitch.keyNames";
    public static final String CAMEL_SINK_STITCH_COMPONENT_KEY_NAMES_DOC = "A collection of comma separated strings representing the Primary Key fields in the source table. Stitch use these Primary Keys to de-dupe data during loading If not provided, the table will be loaded in an append-only manner.";
    public static final String CAMEL_SINK_STITCH_COMPONENT_KEY_NAMES_DEFAULT = null;
    public static final String CAMEL_SINK_STITCH_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.stitch.lazyStartProducer";
    public static final String CAMEL_SINK_STITCH_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_STITCH_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_STITCH_COMPONENT_REGION_CONF = "camel.component.stitch.region";
    public static final String CAMEL_SINK_STITCH_COMPONENT_REGION_DOC = "Stitch account region, e.g: europe One of: [NORTH_AMERICA] [EUROPE]";
    public static final String CAMEL_SINK_STITCH_COMPONENT_REGION_DEFAULT = "EUROPE";
    public static final String CAMEL_SINK_STITCH_COMPONENT_STITCH_SCHEMA_CONF = "camel.component.stitch.stitchSchema";
    public static final String CAMEL_SINK_STITCH_COMPONENT_STITCH_SCHEMA_DOC = "A schema that describes the record(s)";
    public static final String CAMEL_SINK_STITCH_COMPONENT_STITCH_SCHEMA_DEFAULT = null;
    public static final String CAMEL_SINK_STITCH_COMPONENT_CONNECTION_PROVIDER_CONF = "camel.component.stitch.connectionProvider";
    public static final String CAMEL_SINK_STITCH_COMPONENT_CONNECTION_PROVIDER_DOC = "ConnectionProvider contain configuration for the HttpClient like Maximum connection limit .. etc, you can inject this ConnectionProvider and the StitchClient will initialize HttpClient with this ConnectionProvider";
    public static final String CAMEL_SINK_STITCH_COMPONENT_CONNECTION_PROVIDER_DEFAULT = null;
    public static final String CAMEL_SINK_STITCH_COMPONENT_HTTP_CLIENT_CONF = "camel.component.stitch.httpClient";
    public static final String CAMEL_SINK_STITCH_COMPONENT_HTTP_CLIENT_DOC = "Reactor Netty HttpClient, you can injected it if you want to have custom HttpClient";
    public static final String CAMEL_SINK_STITCH_COMPONENT_HTTP_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_STITCH_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.stitch.autowiredEnabled";
    public static final String CAMEL_SINK_STITCH_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_STITCH_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_STITCH_COMPONENT_STITCH_CLIENT_CONF = "camel.component.stitch.stitchClient";
    public static final String CAMEL_SINK_STITCH_COMPONENT_STITCH_CLIENT_DOC = "Set a custom StitchClient that implements org.apache.camel.component.stitch.client.StitchClient interface";
    public static final String CAMEL_SINK_STITCH_COMPONENT_STITCH_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_STITCH_COMPONENT_TOKEN_CONF = "camel.component.stitch.token";
    public static final String CAMEL_SINK_STITCH_COMPONENT_TOKEN_DOC = "Stitch access token for the Stitch Import API";
    public static final String CAMEL_SINK_STITCH_COMPONENT_TOKEN_DEFAULT = null;

    public CamelStitchSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelStitchSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_STITCH_PATH_TABLE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_STITCH_PATH_TABLE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_STITCH_PATH_TABLE_NAME_DOC);
        conf.define(CAMEL_SINK_STITCH_ENDPOINT_KEY_NAMES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_STITCH_ENDPOINT_KEY_NAMES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_STITCH_ENDPOINT_KEY_NAMES_DOC);
        conf.define(CAMEL_SINK_STITCH_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_STITCH_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_STITCH_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_STITCH_ENDPOINT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_STITCH_ENDPOINT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_STITCH_ENDPOINT_REGION_DOC);
        conf.define(CAMEL_SINK_STITCH_ENDPOINT_STITCH_SCHEMA_CONF, ConfigDef.Type.STRING, CAMEL_SINK_STITCH_ENDPOINT_STITCH_SCHEMA_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_STITCH_ENDPOINT_STITCH_SCHEMA_DOC);
        conf.define(CAMEL_SINK_STITCH_ENDPOINT_CONNECTION_PROVIDER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_STITCH_ENDPOINT_CONNECTION_PROVIDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_STITCH_ENDPOINT_CONNECTION_PROVIDER_DOC);
        conf.define(CAMEL_SINK_STITCH_ENDPOINT_HTTP_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_STITCH_ENDPOINT_HTTP_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_STITCH_ENDPOINT_HTTP_CLIENT_DOC);
        conf.define(CAMEL_SINK_STITCH_ENDPOINT_STITCH_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_STITCH_ENDPOINT_STITCH_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_STITCH_ENDPOINT_STITCH_CLIENT_DOC);
        conf.define(CAMEL_SINK_STITCH_ENDPOINT_TOKEN_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_STITCH_ENDPOINT_TOKEN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_STITCH_ENDPOINT_TOKEN_DOC);
        conf.define(CAMEL_SINK_STITCH_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_STITCH_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_STITCH_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_STITCH_COMPONENT_KEY_NAMES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_STITCH_COMPONENT_KEY_NAMES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_STITCH_COMPONENT_KEY_NAMES_DOC);
        conf.define(CAMEL_SINK_STITCH_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_STITCH_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_STITCH_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_STITCH_COMPONENT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_STITCH_COMPONENT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_STITCH_COMPONENT_REGION_DOC);
        conf.define(CAMEL_SINK_STITCH_COMPONENT_STITCH_SCHEMA_CONF, ConfigDef.Type.STRING, CAMEL_SINK_STITCH_COMPONENT_STITCH_SCHEMA_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_STITCH_COMPONENT_STITCH_SCHEMA_DOC);
        conf.define(CAMEL_SINK_STITCH_COMPONENT_CONNECTION_PROVIDER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_STITCH_COMPONENT_CONNECTION_PROVIDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_STITCH_COMPONENT_CONNECTION_PROVIDER_DOC);
        conf.define(CAMEL_SINK_STITCH_COMPONENT_HTTP_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_STITCH_COMPONENT_HTTP_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_STITCH_COMPONENT_HTTP_CLIENT_DOC);
        conf.define(CAMEL_SINK_STITCH_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_STITCH_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_STITCH_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_STITCH_COMPONENT_STITCH_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_STITCH_COMPONENT_STITCH_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_STITCH_COMPONENT_STITCH_CLIENT_DOC);
        conf.define(CAMEL_SINK_STITCH_COMPONENT_TOKEN_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_STITCH_COMPONENT_TOKEN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_STITCH_COMPONENT_TOKEN_DOC);
        return conf;
    }
}