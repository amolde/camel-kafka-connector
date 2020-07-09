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
package org.apache.camel.kafkaconnector.azurestoragequeue;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAzurestoragequeueSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_PATH_ACCOUNT_NAME_CONF = "camel.source.path.accountName";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_PATH_ACCOUNT_NAME_DOC = "Azure account name to be used for authentication with azure queue services";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_PATH_ACCOUNT_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_PATH_QUEUE_NAME_CONF = "camel.source.path.queueName";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_PATH_QUEUE_NAME_DOC = "The queue resource name";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_PATH_QUEUE_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_SERVICE_CLIENT_CONF = "camel.source.endpoint.serviceClient";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_SERVICE_CLIENT_DOC = "Service client to a storage account to interact with the queue service. This client does not hold any state about a particular storage account but is instead a convenient way of sending off appropriate requests to the resource on the service. This client contains all the operations for interacting with a queue account in Azure Storage. Operations allowed by the client are creating, listing, and deleting queues, retrieving and updating properties of the account, and retrieving statistics of the account.";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_SERVICE_CLIENT_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_MAX_MESSAGES_CONF = "camel.source.endpoint.maxMessages";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_MAX_MESSAGES_DOC = "Maximum number of messages to get, if there are less messages exist in the queue than requested all the messages will be returned. If left empty only 1 message will be retrieved, the allowed range is 1 to 32 messages.";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_MAX_MESSAGES_DEFAULT = "1";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_TIMEOUT_CONF = "camel.source.endpoint.timeout";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_TIMEOUT_DOC = "An optional timeout applied to the operation. If a response is not returned before the timeout concludes a RuntimeException will be thrown.";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_TIME_TO_LIVE_CONF = "camel.source.endpoint.timeToLive";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_TIME_TO_LIVE_DOC = "How long the message will stay alive in the queue. If unset the value will default to 7 days, if -1 is passed the message will not expire. The time to live must be -1 or any positive number. The format should be in this form: PnDTnHnMn.nS., e.g: PT20.345S -- parses as 20.345 seconds, P2D -- parses as 2 days However, in case you are using EndpointDsl/ComponentDsl, you can do something like Duration.ofSeconds() since these Java APIs are typesafe.";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_TIME_TO_LIVE_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_VISIBILITY_TIMEOUT_CONF = "camel.source.endpoint.visibilityTimeout";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_VISIBILITY_TIMEOUT_DOC = "The timeout period for how long the message is invisible in the queue. The timeout must be between 1 seconds and 7 days. The format should be in this form: PnDTnHnMn.nS., e.g: PT20.345S -- parses as 20.345 seconds, P2D -- parses as 2 days However, in case you are using EndpointDsl/ComponentDsl, you can do something like Duration.ofSeconds() since these Java APIs are typesafe.";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_VISIBILITY_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_ACCESS_KEY_CONF = "camel.source.endpoint.accessKey";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_ACCESS_KEY_DOC = "Access key for the associated azure account name to be used for authentication with azure queue services";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_CREDENTIALS_CONF = "camel.source.endpoint.credentials";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_CREDENTIALS_DOC = "StorageSharedKeyCredential can be injected to create the azure client, this holds the important authentication information";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_CREDENTIALS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_CONFIGURATION_CONF = "camel.component.azure-storage-queue.configuration";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_CONFIGURATION_DOC = "The component configurations";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_SERVICE_CLIENT_CONF = "camel.component.azure-storage-queue.serviceClient";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_SERVICE_CLIENT_DOC = "Service client to a storage account to interact with the queue service. This client does not hold any state about a particular storage account but is instead a convenient way of sending off appropriate requests to the resource on the service. This client contains all the operations for interacting with a queue account in Azure Storage. Operations allowed by the client are creating, listing, and deleting queues, retrieving and updating properties of the account, and retrieving statistics of the account.";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_SERVICE_CLIENT_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.azure-storage-queue.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.azure-storage-queue.basicPropertyBinding";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_MAX_MESSAGES_CONF = "camel.component.azure-storage-queue.maxMessages";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_MAX_MESSAGES_DOC = "Maximum number of messages to get, if there are less messages exist in the queue than requested all the messages will be returned. If left empty only 1 message will be retrieved, the allowed range is 1 to 32 messages.";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_MAX_MESSAGES_DEFAULT = "1";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_TIMEOUT_CONF = "camel.component.azure-storage-queue.timeout";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_TIMEOUT_DOC = "An optional timeout applied to the operation. If a response is not returned before the timeout concludes a RuntimeException will be thrown.";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_TIME_TO_LIVE_CONF = "camel.component.azure-storage-queue.timeToLive";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_TIME_TO_LIVE_DOC = "How long the message will stay alive in the queue. If unset the value will default to 7 days, if -1 is passed the message will not expire. The time to live must be -1 or any positive number. The format should be in this form: PnDTnHnMn.nS., e.g: PT20.345S -- parses as 20.345 seconds, P2D -- parses as 2 days However, in case you are using EndpointDsl/ComponentDsl, you can do something like Duration.ofSeconds() since these Java APIs are typesafe.";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_TIME_TO_LIVE_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_VISIBILITY_TIMEOUT_CONF = "camel.component.azure-storage-queue.visibilityTimeout";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_VISIBILITY_TIMEOUT_DOC = "The timeout period for how long the message is invisible in the queue. The timeout must be between 1 seconds and 7 days. The format should be in this form: PnDTnHnMn.nS., e.g: PT20.345S -- parses as 20.345 seconds, P2D -- parses as 2 days However, in case you are using EndpointDsl/ComponentDsl, you can do something like Duration.ofSeconds() since these Java APIs are typesafe.";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_VISIBILITY_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_ACCESS_KEY_CONF = "camel.component.azure-storage-queue.accessKey";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_ACCESS_KEY_DOC = "Access key for the associated azure account name to be used for authentication with azure queue services";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_CREDENTIALS_CONF = "camel.component.azure-storage-queue.credentials";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_CREDENTIALS_DOC = "StorageSharedKeyCredential can be injected to create the azure client, this holds the important authentication information";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_CREDENTIALS_DEFAULT = null;

    public CamelAzurestoragequeueSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAzurestoragequeueSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_PATH_ACCOUNT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUE_PATH_ACCOUNT_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_PATH_ACCOUNT_NAME_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_PATH_QUEUE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUE_PATH_QUEUE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_PATH_QUEUE_NAME_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_SERVICE_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_SERVICE_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_SERVICE_CLIENT_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_MAX_MESSAGES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_MAX_MESSAGES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_MAX_MESSAGES_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_TIME_TO_LIVE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_TIME_TO_LIVE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_TIME_TO_LIVE_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_VISIBILITY_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_VISIBILITY_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_VISIBILITY_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_CREDENTIALS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_CREDENTIALS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_ENDPOINT_CREDENTIALS_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_SERVICE_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_SERVICE_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_SERVICE_CLIENT_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_MAX_MESSAGES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_MAX_MESSAGES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_MAX_MESSAGES_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_TIME_TO_LIVE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_TIME_TO_LIVE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_TIME_TO_LIVE_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_VISIBILITY_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_VISIBILITY_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_VISIBILITY_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_CREDENTIALS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_CREDENTIALS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUE_COMPONENT_CREDENTIALS_DOC);
        return conf;
    }
}