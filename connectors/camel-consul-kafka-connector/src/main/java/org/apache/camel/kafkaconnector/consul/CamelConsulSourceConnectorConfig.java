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
package org.apache.camel.kafkaconnector.consul;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelConsulSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_CONSUL_PATH_API_ENDPOINT_CONF = "camel.source.path.apiEndpoint";
    public static final String CAMEL_SOURCE_CONSUL_PATH_API_ENDPOINT_DOC = "The API endpoint";
    public static final String CAMEL_SOURCE_CONSUL_PATH_API_ENDPOINT_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_CONNECT_TIMEOUT_CONF = "camel.source.endpoint.connectTimeout";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_CONNECT_TIMEOUT_DOC = "Connect timeout for OkHttpClient";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_CONNECT_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_CONNECT_TIMEOUT_MILLIS_CONF = "camel.source.endpoint.connectTimeoutMillis";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_CONNECT_TIMEOUT_MILLIS_DOC = "Connect timeout for OkHttpClient. Deprecation note: Use connectTimeout instead";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_CONNECT_TIMEOUT_MILLIS_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_CONSUL_CLIENT_CONF = "camel.source.endpoint.consulClient";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_CONSUL_CLIENT_DOC = "Reference to a com.orbitz.consul.Consul in the registry.";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_CONSUL_CLIENT_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_KEY_CONF = "camel.source.endpoint.key";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_KEY_DOC = "The default key. Can be overridden by CamelConsulKey";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_PING_INSTANCE_CONF = "camel.source.endpoint.pingInstance";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_PING_INSTANCE_DOC = "Configure if the AgentClient should attempt a ping before returning the Consul instance";
    public static final Boolean CAMEL_SOURCE_CONSUL_ENDPOINT_PING_INSTANCE_DEFAULT = true;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_READ_TIMEOUT_CONF = "camel.source.endpoint.readTimeout";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_READ_TIMEOUT_DOC = "Read timeout for OkHttpClient";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_READ_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_READ_TIMEOUT_MILLIS_CONF = "camel.source.endpoint.readTimeoutMillis";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_READ_TIMEOUT_MILLIS_DOC = "Read timeout for OkHttpClient. Deprecation note: Use readTimeout instead";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_READ_TIMEOUT_MILLIS_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_TAGS_CONF = "camel.source.endpoint.tags";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_TAGS_DOC = "Set tags. You can separate multiple tags by comma.";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_TAGS_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_URL_CONF = "camel.source.endpoint.url";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_URL_DOC = "The Consul agent URL";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_URL_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_WRITE_TIMEOUT_CONF = "camel.source.endpoint.writeTimeout";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_WRITE_TIMEOUT_DOC = "Write timeout for OkHttpClient";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_WRITE_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_WRITE_TIMEOUT_MILLIS_CONF = "camel.source.endpoint.writeTimeoutMillis";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_WRITE_TIMEOUT_MILLIS_DOC = "Write timeout for OkHttpClient. Deprecation note: Use writeTimeout instead";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_WRITE_TIMEOUT_MILLIS_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_CONSUL_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_CONSISTENCY_MODE_CONF = "camel.source.endpoint.consistencyMode";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_CONSISTENCY_MODE_DOC = "The consistencyMode used for queries, default ConsistencyMode.DEFAULT One of: [DEFAULT] [STALE] [CONSISTENT]";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_CONSISTENCY_MODE_DEFAULT = "DEFAULT";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_DATACENTER_CONF = "camel.source.endpoint.datacenter";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_DATACENTER_DOC = "The data center";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_DATACENTER_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_NEAR_NODE_CONF = "camel.source.endpoint.nearNode";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_NEAR_NODE_DOC = "The near node to use for queries.";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_NEAR_NODE_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_NODE_META_CONF = "camel.source.endpoint.nodeMeta";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_NODE_META_DOC = "The note meta-data to use for queries.";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_NODE_META_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_ACL_TOKEN_CONF = "camel.source.endpoint.aclToken";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_ACL_TOKEN_DOC = "Sets the ACL token to be used with Consul";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_ACL_TOKEN_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_PASSWORD_CONF = "camel.source.endpoint.password";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_PASSWORD_DOC = "Sets the password to be used for basic authentication";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF = "camel.source.endpoint.sslContextParameters";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC = "SSL configuration using an org.apache.camel.support.jsse.SSLContextParameters instance.";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_USER_NAME_CONF = "camel.source.endpoint.userName";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_USER_NAME_DOC = "Sets the username to be used for basic authentication";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_USER_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_BLOCK_SECONDS_CONF = "camel.source.endpoint.blockSeconds";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_BLOCK_SECONDS_DOC = "The second to wait for a watch event, default 10 seconds";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_BLOCK_SECONDS_DEFAULT = "10";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_FIRST_INDEX_CONF = "camel.source.endpoint.firstIndex";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_FIRST_INDEX_DOC = "The first index for watch for, default 0";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_FIRST_INDEX_DEFAULT = "0";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_RECURSIVE_CONF = "camel.source.endpoint.recursive";
    public static final String CAMEL_SOURCE_CONSUL_ENDPOINT_RECURSIVE_DOC = "Recursively watch, default false";
    public static final Boolean CAMEL_SOURCE_CONSUL_ENDPOINT_RECURSIVE_DEFAULT = false;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_CONNECT_TIMEOUT_CONF = "camel.component.consul.connectTimeout";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_CONNECT_TIMEOUT_DOC = "Connect timeout for OkHttpClient";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_CONNECT_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_CONNECT_TIMEOUT_MILLIS_CONF = "camel.component.consul.connectTimeoutMillis";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_CONNECT_TIMEOUT_MILLIS_DOC = "Connect timeout for OkHttpClient. Deprecation note: Use connectTimeout instead";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_CONNECT_TIMEOUT_MILLIS_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_CONSUL_CLIENT_CONF = "camel.component.consul.consulClient";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_CONSUL_CLIENT_DOC = "Reference to a com.orbitz.consul.Consul in the registry.";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_CONSUL_CLIENT_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_KEY_CONF = "camel.component.consul.key";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_KEY_DOC = "The default key. Can be overridden by CamelConsulKey";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_PING_INSTANCE_CONF = "camel.component.consul.pingInstance";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_PING_INSTANCE_DOC = "Configure if the AgentClient should attempt a ping before returning the Consul instance";
    public static final Boolean CAMEL_SOURCE_CONSUL_COMPONENT_PING_INSTANCE_DEFAULT = true;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_READ_TIMEOUT_CONF = "camel.component.consul.readTimeout";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_READ_TIMEOUT_DOC = "Read timeout for OkHttpClient";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_READ_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_READ_TIMEOUT_MILLIS_CONF = "camel.component.consul.readTimeoutMillis";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_READ_TIMEOUT_MILLIS_DOC = "Read timeout for OkHttpClient. Deprecation note: Use readTimeout instead";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_READ_TIMEOUT_MILLIS_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_TAGS_CONF = "camel.component.consul.tags";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_TAGS_DOC = "Set tags. You can separate multiple tags by comma.";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_TAGS_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_URL_CONF = "camel.component.consul.url";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_URL_DOC = "The Consul agent URL";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_URL_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_WRITE_TIMEOUT_CONF = "camel.component.consul.writeTimeout";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_WRITE_TIMEOUT_DOC = "Write timeout for OkHttpClient";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_WRITE_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_WRITE_TIMEOUT_MILLIS_CONF = "camel.component.consul.writeTimeoutMillis";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_WRITE_TIMEOUT_MILLIS_DOC = "Write timeout for OkHttpClient. Deprecation note: Use writeTimeout instead";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_WRITE_TIMEOUT_MILLIS_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.consul.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_CONSUL_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.consul.autowiredEnabled";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SOURCE_CONSUL_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_CONFIGURATION_CONF = "camel.component.consul.configuration";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_CONFIGURATION_DOC = "Consul configuration";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_CONSISTENCY_MODE_CONF = "camel.component.consul.consistencyMode";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_CONSISTENCY_MODE_DOC = "The consistencyMode used for queries, default ConsistencyMode.DEFAULT One of: [DEFAULT] [STALE] [CONSISTENT]";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_CONSISTENCY_MODE_DEFAULT = "DEFAULT";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_DATACENTER_CONF = "camel.component.consul.datacenter";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_DATACENTER_DOC = "The data center";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_DATACENTER_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_NEAR_NODE_CONF = "camel.component.consul.nearNode";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_NEAR_NODE_DOC = "The near node to use for queries.";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_NEAR_NODE_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_NODE_META_CONF = "camel.component.consul.nodeMeta";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_NODE_META_DOC = "The note meta-data to use for queries.";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_NODE_META_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_ACL_TOKEN_CONF = "camel.component.consul.aclToken";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_ACL_TOKEN_DOC = "Sets the ACL token to be used with Consul";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_ACL_TOKEN_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_PASSWORD_CONF = "camel.component.consul.password";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_PASSWORD_DOC = "Sets the password to be used for basic authentication";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.consul.sslContextParameters";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC = "SSL configuration using an org.apache.camel.support.jsse.SSLContextParameters instance.";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.consul.useGlobalSslContextParameters";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC = "Enable usage of global SSL context parameters.";
    public static final Boolean CAMEL_SOURCE_CONSUL_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT = false;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_USER_NAME_CONF = "camel.component.consul.userName";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_USER_NAME_DOC = "Sets the username to be used for basic authentication";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_USER_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_BLOCK_SECONDS_CONF = "camel.component.consul.blockSeconds";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_BLOCK_SECONDS_DOC = "The second to wait for a watch event, default 10 seconds";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_BLOCK_SECONDS_DEFAULT = "10";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_FIRST_INDEX_CONF = "camel.component.consul.firstIndex";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_FIRST_INDEX_DOC = "The first index for watch for, default 0";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_FIRST_INDEX_DEFAULT = "0";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_RECURSIVE_CONF = "camel.component.consul.recursive";
    public static final String CAMEL_SOURCE_CONSUL_COMPONENT_RECURSIVE_DOC = "Recursively watch, default false";
    public static final Boolean CAMEL_SOURCE_CONSUL_COMPONENT_RECURSIVE_DEFAULT = false;

    public CamelConsulSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelConsulSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_CONSUL_PATH_API_ENDPOINT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_PATH_API_ENDPOINT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_CONSUL_PATH_API_ENDPOINT_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_CONNECT_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_CONNECT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_CONNECT_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_CONNECT_TIMEOUT_MILLIS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_CONNECT_TIMEOUT_MILLIS_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SOURCE_CONSUL_ENDPOINT_CONNECT_TIMEOUT_MILLIS_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_CONSUL_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_CONSUL_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_CONSUL_CLIENT_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_KEY_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_PING_INSTANCE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CONSUL_ENDPOINT_PING_INSTANCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_PING_INSTANCE_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_READ_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_READ_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_READ_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_READ_TIMEOUT_MILLIS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_READ_TIMEOUT_MILLIS_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SOURCE_CONSUL_ENDPOINT_READ_TIMEOUT_MILLIS_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_TAGS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_TAGS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_TAGS_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_URL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_URL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_URL_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_WRITE_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_WRITE_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_WRITE_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_WRITE_TIMEOUT_MILLIS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_WRITE_TIMEOUT_MILLIS_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SOURCE_CONSUL_ENDPOINT_WRITE_TIMEOUT_MILLIS_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CONSUL_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_CONSISTENCY_MODE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_CONSISTENCY_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_CONSISTENCY_MODE_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_DATACENTER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_DATACENTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_DATACENTER_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_NEAR_NODE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_NEAR_NODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_NEAR_NODE_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_NODE_META_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_NODE_META_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_NODE_META_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_ACL_TOKEN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_ACL_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_ACL_TOKEN_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_USER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_USER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_USER_NAME_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_BLOCK_SECONDS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_BLOCK_SECONDS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_BLOCK_SECONDS_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_FIRST_INDEX_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_ENDPOINT_FIRST_INDEX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_FIRST_INDEX_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_ENDPOINT_RECURSIVE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CONSUL_ENDPOINT_RECURSIVE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_ENDPOINT_RECURSIVE_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_CONNECT_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_CONNECT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_CONNECT_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_CONNECT_TIMEOUT_MILLIS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_CONNECT_TIMEOUT_MILLIS_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SOURCE_CONSUL_COMPONENT_CONNECT_TIMEOUT_MILLIS_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_CONSUL_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_CONSUL_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_CONSUL_CLIENT_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_KEY_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_PING_INSTANCE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CONSUL_COMPONENT_PING_INSTANCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_PING_INSTANCE_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_READ_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_READ_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_READ_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_READ_TIMEOUT_MILLIS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_READ_TIMEOUT_MILLIS_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SOURCE_CONSUL_COMPONENT_READ_TIMEOUT_MILLIS_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_TAGS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_TAGS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_TAGS_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_URL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_URL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_URL_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_WRITE_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_WRITE_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_WRITE_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_WRITE_TIMEOUT_MILLIS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_WRITE_TIMEOUT_MILLIS_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SOURCE_CONSUL_COMPONENT_WRITE_TIMEOUT_MILLIS_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CONSUL_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CONSUL_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_CONSISTENCY_MODE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_CONSISTENCY_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_CONSISTENCY_MODE_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_DATACENTER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_DATACENTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_DATACENTER_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_NEAR_NODE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_NEAR_NODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_NEAR_NODE_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_NODE_META_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_NODE_META_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_NODE_META_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_ACL_TOKEN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_ACL_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_ACL_TOKEN_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CONSUL_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_USER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_USER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_USER_NAME_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_BLOCK_SECONDS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_BLOCK_SECONDS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_BLOCK_SECONDS_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_FIRST_INDEX_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CONSUL_COMPONENT_FIRST_INDEX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_FIRST_INDEX_DOC);
        conf.define(CAMEL_SOURCE_CONSUL_COMPONENT_RECURSIVE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_CONSUL_COMPONENT_RECURSIVE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CONSUL_COMPONENT_RECURSIVE_DOC);
        return conf;
    }
}