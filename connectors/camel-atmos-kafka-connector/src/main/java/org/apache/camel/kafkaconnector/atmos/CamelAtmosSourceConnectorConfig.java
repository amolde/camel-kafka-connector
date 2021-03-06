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
package org.apache.camel.kafkaconnector.atmos;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAtmosSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_ATMOS_PATH_NAME_CONF = "camel.source.path.name";
    public static final String CAMEL_SOURCE_ATMOS_PATH_NAME_DOC = "Atmos name";
    public static final String CAMEL_SOURCE_ATMOS_PATH_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATMOS_PATH_OPERATION_CONF = "camel.source.path.operation";
    public static final String CAMEL_SOURCE_ATMOS_PATH_OPERATION_DOC = "Operation to perform One of: [put] [del] [search] [get] [move]";
    public static final String CAMEL_SOURCE_ATMOS_PATH_OPERATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_LOCAL_PATH_CONF = "camel.source.endpoint.localPath";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_LOCAL_PATH_DOC = "Local path to put files";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_LOCAL_PATH_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_NEW_REMOTE_PATH_CONF = "camel.source.endpoint.newRemotePath";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_NEW_REMOTE_PATH_DOC = "New path on Atmos when moving files";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_NEW_REMOTE_PATH_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_QUERY_CONF = "camel.source.endpoint.query";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_QUERY_DOC = "Search query on Atmos";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_QUERY_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_REMOTE_PATH_CONF = "camel.source.endpoint.remotePath";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_REMOTE_PATH_DOC = "Where to put files on Atmos";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_REMOTE_PATH_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_ATMOS_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_URI_CONF = "camel.source.endpoint.uri";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_URI_DOC = "Atomos server uri";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_URI_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_FULL_TOKEN_ID_CONF = "camel.source.endpoint.fullTokenId";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_FULL_TOKEN_ID_DOC = "Atmos client fullTokenId";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_FULL_TOKEN_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_SECRET_KEY_CONF = "camel.source.endpoint.secretKey";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_SECRET_KEY_DOC = "The secret key to pass to the Atmos client (should be base64 encoded)";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_SSL_VALIDATION_CONF = "camel.source.endpoint.sslValidation";
    public static final String CAMEL_SOURCE_ATMOS_ENDPOINT_SSL_VALIDATION_DOC = "Atmos SSL validation";
    public static final Boolean CAMEL_SOURCE_ATMOS_ENDPOINT_SSL_VALIDATION_DEFAULT = false;
    public static final String CAMEL_SOURCE_ATMOS_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.atmos.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_ATMOS_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_ATMOS_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_ATMOS_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.atmos.autowiredEnabled";
    public static final String CAMEL_SOURCE_ATMOS_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SOURCE_ATMOS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SOURCE_ATMOS_COMPONENT_URI_CONF = "camel.component.atmos.uri";
    public static final String CAMEL_SOURCE_ATMOS_COMPONENT_URI_DOC = "The URI of the server for the Atmos client to connect to";
    public static final String CAMEL_SOURCE_ATMOS_COMPONENT_URI_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATMOS_COMPONENT_FULL_TOKEN_ID_CONF = "camel.component.atmos.fullTokenId";
    public static final String CAMEL_SOURCE_ATMOS_COMPONENT_FULL_TOKEN_ID_DOC = "The token id to pass to the Atmos client";
    public static final String CAMEL_SOURCE_ATMOS_COMPONENT_FULL_TOKEN_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATMOS_COMPONENT_SECRET_KEY_CONF = "camel.component.atmos.secretKey";
    public static final String CAMEL_SOURCE_ATMOS_COMPONENT_SECRET_KEY_DOC = "The secret key to pass to the Atmos client (should be base64 encoded)";
    public static final String CAMEL_SOURCE_ATMOS_COMPONENT_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATMOS_COMPONENT_SSL_VALIDATION_CONF = "camel.component.atmos.sslValidation";
    public static final String CAMEL_SOURCE_ATMOS_COMPONENT_SSL_VALIDATION_DOC = "Whether the Atmos client should perform SSL validation";
    public static final Boolean CAMEL_SOURCE_ATMOS_COMPONENT_SSL_VALIDATION_DEFAULT = false;

    public CamelAtmosSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAtmosSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_ATMOS_PATH_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATMOS_PATH_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATMOS_PATH_NAME_DOC);
        conf.define(CAMEL_SOURCE_ATMOS_PATH_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATMOS_PATH_OPERATION_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_ATMOS_PATH_OPERATION_DOC);
        conf.define(CAMEL_SOURCE_ATMOS_ENDPOINT_LOCAL_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATMOS_ENDPOINT_LOCAL_PATH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATMOS_ENDPOINT_LOCAL_PATH_DOC);
        conf.define(CAMEL_SOURCE_ATMOS_ENDPOINT_NEW_REMOTE_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATMOS_ENDPOINT_NEW_REMOTE_PATH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATMOS_ENDPOINT_NEW_REMOTE_PATH_DOC);
        conf.define(CAMEL_SOURCE_ATMOS_ENDPOINT_QUERY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATMOS_ENDPOINT_QUERY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATMOS_ENDPOINT_QUERY_DOC);
        conf.define(CAMEL_SOURCE_ATMOS_ENDPOINT_REMOTE_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATMOS_ENDPOINT_REMOTE_PATH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATMOS_ENDPOINT_REMOTE_PATH_DOC);
        conf.define(CAMEL_SOURCE_ATMOS_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ATMOS_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATMOS_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_ATMOS_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATMOS_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATMOS_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_ATMOS_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATMOS_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATMOS_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_ATMOS_ENDPOINT_URI_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATMOS_ENDPOINT_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATMOS_ENDPOINT_URI_DOC);
        conf.define(CAMEL_SOURCE_ATMOS_ENDPOINT_FULL_TOKEN_ID_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_ATMOS_ENDPOINT_FULL_TOKEN_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATMOS_ENDPOINT_FULL_TOKEN_ID_DOC);
        conf.define(CAMEL_SOURCE_ATMOS_ENDPOINT_SECRET_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_ATMOS_ENDPOINT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATMOS_ENDPOINT_SECRET_KEY_DOC);
        conf.define(CAMEL_SOURCE_ATMOS_ENDPOINT_SSL_VALIDATION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ATMOS_ENDPOINT_SSL_VALIDATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATMOS_ENDPOINT_SSL_VALIDATION_DOC);
        conf.define(CAMEL_SOURCE_ATMOS_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ATMOS_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATMOS_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_ATMOS_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ATMOS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATMOS_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_ATMOS_COMPONENT_URI_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATMOS_COMPONENT_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATMOS_COMPONENT_URI_DOC);
        conf.define(CAMEL_SOURCE_ATMOS_COMPONENT_FULL_TOKEN_ID_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_ATMOS_COMPONENT_FULL_TOKEN_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATMOS_COMPONENT_FULL_TOKEN_ID_DOC);
        conf.define(CAMEL_SOURCE_ATMOS_COMPONENT_SECRET_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_ATMOS_COMPONENT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATMOS_COMPONENT_SECRET_KEY_DOC);
        conf.define(CAMEL_SOURCE_ATMOS_COMPONENT_SSL_VALIDATION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ATMOS_COMPONENT_SSL_VALIDATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATMOS_COMPONENT_SSL_VALIDATION_DOC);
        return conf;
    }
}