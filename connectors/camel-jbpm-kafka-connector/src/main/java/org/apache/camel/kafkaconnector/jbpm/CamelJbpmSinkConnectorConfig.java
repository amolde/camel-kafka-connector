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
package org.apache.camel.kafkaconnector.jbpm;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelJbpmSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_JBPM_PATH_CONNECTION_URLCONF = "camel.sink.path.connectionURL";
    public static final String CAMEL_SINK_JBPM_PATH_CONNECTION_URLDOC = "The URL to the jBPM server.";
    public static final String CAMEL_SINK_JBPM_PATH_CONNECTION_URLDEFAULT = null;
    public static final String CAMEL_SINK_JBPM_PATH_EVENT_LISTENER_TYPE_CONF = "camel.sink.path.eventListenerType";
    public static final String CAMEL_SINK_JBPM_PATH_EVENT_LISTENER_TYPE_DOC = "Sets the event listener type to attach to";
    public static final String CAMEL_SINK_JBPM_PATH_EVENT_LISTENER_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_ATTACHMENT_ID_CONF = "camel.sink.endpoint.attachmentId";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_ATTACHMENT_ID_DOC = "attachId to use when retrieving attachments";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_ATTACHMENT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_CONTENT_ID_CONF = "camel.sink.endpoint.contentId";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_CONTENT_ID_DOC = "contentId to use when retrieving attachments";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_CONTENT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_DEPLOYMENT_ID_CONF = "camel.sink.endpoint.deploymentId";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_DEPLOYMENT_ID_DOC = "The id of the deployment";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_DEPLOYMENT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_EMITTER_SEND_ITEMS_CONF = "camel.sink.endpoint.emitterSendItems";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_EMITTER_SEND_ITEMS_DOC = "Sets if event produced by emitter should be sent as single items or complete collection";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_EMITTER_SEND_ITEMS_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_EVENT_CONF = "camel.sink.endpoint.event";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_EVENT_DOC = "the data associated with this event when signalEvent operation is performed";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_EVENT_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_EVENT_TYPE_CONF = "camel.sink.endpoint.eventType";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_EVENT_TYPE_DOC = "the type of event to use when signalEvent operation is performed";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_EVENT_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_IDENTIFIER_CONF = "camel.sink.endpoint.identifier";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_IDENTIFIER_DOC = "identifier the global identifier";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_IDENTIFIER_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_MAX_NUMBER_CONF = "camel.sink.endpoint.maxNumber";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_MAX_NUMBER_DOC = "the maximum number of rules that should be fired";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_MAX_NUMBER_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_PAGE_CONF = "camel.sink.endpoint.page";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_PAGE_DOC = "The page to use when retrieving user tasks";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_PAGE_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_PAGE_SIZE_CONF = "camel.sink.endpoint.pageSize";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_PAGE_SIZE_DOC = "The page size to use when retrieving user tasks";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_PAGE_SIZE_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_PROCESS_ID_CONF = "camel.sink.endpoint.processId";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_PROCESS_ID_DOC = "the id of the process that should be acted upon";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_PROCESS_ID_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_PROCESS_INSTANCE_ID_CONF = "camel.sink.endpoint.processInstanceId";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_PROCESS_INSTANCE_ID_DOC = "the id of the process instance";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_PROCESS_INSTANCE_ID_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_TARGET_USER_ID_CONF = "camel.sink.endpoint.targetUserId";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_TARGET_USER_ID_DOC = "The targetUserId used when delegating a task";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_TARGET_USER_ID_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_TASK_CONF = "camel.sink.endpoint.task";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_TASK_DOC = "The task instance to use with task operations";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_TASK_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_TASK_ID_CONF = "camel.sink.endpoint.taskId";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_TASK_ID_DOC = "the id of the task";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_TASK_ID_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_TIMEOUT_CONF = "camel.sink.endpoint.timeout";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_TIMEOUT_DOC = "A timeout value";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_USER_ID_CONF = "camel.sink.endpoint.userId";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_USER_ID_DOC = "userId to use with task operations";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_USER_ID_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_VALUE_CONF = "camel.sink.endpoint.value";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_VALUE_DOC = "the value to assign to the global identifier";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_VALUE_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_WORK_ITEM_ID_CONF = "camel.sink.endpoint.workItemId";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_WORK_ITEM_ID_DOC = "the id of the work item";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_WORK_ITEM_ID_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_JBPM_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_OPERATION_CONF = "camel.sink.endpoint.operation";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_OPERATION_DOC = "The operation to perform";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_OPERATION_DEFAULT = "startProcess";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_ENTITIES_CONF = "camel.sink.endpoint.entities";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_ENTITIES_DOC = "The potentialOwners when nominateTask operation is performed";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_ENTITIES_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_EXTRA_JAXB_CLASSES_CONF = "camel.sink.endpoint.extraJaxbClasses";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_EXTRA_JAXB_CLASSES_DOC = "To load additional classes when working with XML";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_EXTRA_JAXB_CLASSES_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_PARAMETERS_CONF = "camel.sink.endpoint.parameters";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_PARAMETERS_DOC = "the variables that should be set for various operations";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_STATUSES_CONF = "camel.sink.endpoint.statuses";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_STATUSES_DOC = "The list of status to use when filtering tasks";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_STATUSES_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_PASSWORD_CONF = "camel.sink.endpoint.password";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_PASSWORD_DOC = "Password for authentication";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_ENDPOINT_USER_NAME_CONF = "camel.sink.endpoint.userName";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_USER_NAME_DOC = "Username for authentication";
    public static final String CAMEL_SINK_JBPM_ENDPOINT_USER_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_JBPM_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.jbpm.lazyStartProducer";
    public static final String CAMEL_SINK_JBPM_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_JBPM_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_JBPM_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.jbpm.autowiredEnabled";
    public static final String CAMEL_SINK_JBPM_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_JBPM_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelJbpmSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelJbpmSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_JBPM_PATH_CONNECTION_URLCONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_PATH_CONNECTION_URLDEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_JBPM_PATH_CONNECTION_URLDOC);
        conf.define(CAMEL_SINK_JBPM_PATH_EVENT_LISTENER_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_PATH_EVENT_LISTENER_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_PATH_EVENT_LISTENER_TYPE_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_ATTACHMENT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_ATTACHMENT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_ATTACHMENT_ID_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_CONTENT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_CONTENT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_CONTENT_ID_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_DEPLOYMENT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_DEPLOYMENT_ID_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_JBPM_ENDPOINT_DEPLOYMENT_ID_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_EMITTER_SEND_ITEMS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_EMITTER_SEND_ITEMS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_EMITTER_SEND_ITEMS_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_EVENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_EVENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_EVENT_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_EVENT_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_EVENT_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_EVENT_TYPE_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_IDENTIFIER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_IDENTIFIER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_IDENTIFIER_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_MAX_NUMBER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_MAX_NUMBER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_MAX_NUMBER_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_PAGE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_PAGE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_PAGE_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_PAGE_SIZE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_PAGE_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_PAGE_SIZE_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_PROCESS_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_PROCESS_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_PROCESS_ID_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_PROCESS_INSTANCE_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_PROCESS_INSTANCE_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_PROCESS_INSTANCE_ID_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_TARGET_USER_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_TARGET_USER_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_TARGET_USER_ID_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_TASK_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_TASK_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_TASK_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_TASK_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_TASK_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_TASK_ID_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_USER_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_USER_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_USER_ID_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_VALUE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_VALUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_VALUE_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_WORK_ITEM_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_WORK_ITEM_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_WORK_ITEM_ID_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JBPM_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_OPERATION_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_ENTITIES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_ENTITIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_ENTITIES_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_EXTRA_JAXB_CLASSES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_EXTRA_JAXB_CLASSES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_EXTRA_JAXB_CLASSES_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_STATUSES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JBPM_ENDPOINT_STATUSES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_STATUSES_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_JBPM_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_JBPM_ENDPOINT_USER_NAME_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_JBPM_ENDPOINT_USER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_ENDPOINT_USER_NAME_DOC);
        conf.define(CAMEL_SINK_JBPM_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JBPM_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_JBPM_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JBPM_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JBPM_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}