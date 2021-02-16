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
package org.apache.camel.kafkaconnector.awsswf;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAwsswfSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_AWSSWF_PATH_TYPE_CONF = "camel.sink.path.type";
    public static final String CAMEL_SINK_AWSSWF_PATH_TYPE_DOC = "Activity or workflow One of: [activity] [workflow]";
    public static final String CAMEL_SINK_AWSSWF_PATH_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_AMAZON_SWCLIENT_CONF = "camel.sink.endpoint.amazonSWClient";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_AMAZON_SWCLIENT_DOC = "To use the given AmazonSimpleWorkflowClient as client";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_AMAZON_SWCLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_DATA_CONVERTER_CONF = "camel.sink.endpoint.dataConverter";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_DATA_CONVERTER_DOC = "An instance of com.amazonaws.services.simpleworkflow.flow.DataConverter to use for serializing/deserializing the data.";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_DATA_CONVERTER_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_DOMAIN_NAME_CONF = "camel.sink.endpoint.domainName";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_DOMAIN_NAME_DOC = "The workflow domain to use.";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_DOMAIN_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_EVENT_NAME_CONF = "camel.sink.endpoint.eventName";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_EVENT_NAME_DOC = "The workflow or activity event name to use.";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_EVENT_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_REGION_CONF = "camel.sink.endpoint.region";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_REGION_DOC = "Amazon AWS Region. When using this parameter, the configuration will expect the capitalized name of the region (for example AP_EAST_1) You'll need to use the name Regions.EU_WEST_1.name()";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_REGION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_VERSION_CONF = "camel.sink.endpoint.version";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_VERSION_DOC = "The workflow or activity event version to use.";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_VERSION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AWSSWF_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_ACTIVITY_SCHEDULING_OPTIONS_CONF = "camel.sink.endpoint.activitySchedulingOptions";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_ACTIVITY_SCHEDULING_OPTIONS_DOC = "Activity scheduling options";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_ACTIVITY_SCHEDULING_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_CLIENT_CONFIGURATION_PARAMETERS_CONF = "camel.sink.endpoint.clientConfigurationParameters";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_CLIENT_CONFIGURATION_PARAMETERS_DOC = "To configure the ClientConfiguration using the key/values from the Map.";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_CLIENT_CONFIGURATION_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_START_WORKFLOW_OPTIONS_PARAMETERS_CONF = "camel.sink.endpoint.startWorkflowOptionsParameters";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_START_WORKFLOW_OPTIONS_PARAMETERS_DOC = "To configure the StartWorkflowOptions using the key/values from the Map.";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_START_WORKFLOW_OPTIONS_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_SWCLIENT_PARAMETERS_CONF = "camel.sink.endpoint.sWClientParameters";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_SWCLIENT_PARAMETERS_DOC = "To configure the AmazonSimpleWorkflowClient using the key/values from the Map.";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_SWCLIENT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_ACCESS_KEY_CONF = "camel.sink.endpoint.accessKey";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_ACCESS_KEY_DOC = "Amazon AWS Access Key.";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_SECRET_KEY_CONF = "camel.sink.endpoint.secretKey";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_SECRET_KEY_DOC = "Amazon AWS Secret Key.";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_CHILD_POLICY_CONF = "camel.sink.endpoint.childPolicy";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_CHILD_POLICY_DOC = "The policy to use on child workflows when terminating a workflow.";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_CHILD_POLICY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_EXECUTION_START_TO_CLOSE_TIMEOUT_CONF = "camel.sink.endpoint.executionStartToCloseTimeout";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_EXECUTION_START_TO_CLOSE_TIMEOUT_DOC = "Set the execution start to close timeout.";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_EXECUTION_START_TO_CLOSE_TIMEOUT_DEFAULT = "3600";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_OPERATION_CONF = "camel.sink.endpoint.operation";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_OPERATION_DOC = "Workflow operation One of: [SIGNAL] [CANCEL] [TERMINATE] [GET_STATE] [START] [DESCRIBE] [GET_HISTORY]";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_OPERATION_DEFAULT = "START";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_SIGNAL_NAME_CONF = "camel.sink.endpoint.signalName";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_SIGNAL_NAME_DOC = "The name of the signal to send to the workflow.";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_SIGNAL_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_STATE_RESULT_TYPE_CONF = "camel.sink.endpoint.stateResultType";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_STATE_RESULT_TYPE_DOC = "The type of the result when a workflow state is queried.";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_STATE_RESULT_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_TASK_START_TO_CLOSE_TIMEOUT_CONF = "camel.sink.endpoint.taskStartToCloseTimeout";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_TASK_START_TO_CLOSE_TIMEOUT_DOC = "Set the task start to close timeout.";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_TASK_START_TO_CLOSE_TIMEOUT_DEFAULT = "600";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_TERMINATION_DETAILS_CONF = "camel.sink.endpoint.terminationDetails";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_TERMINATION_DETAILS_DOC = "Details for terminating a workflow.";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_TERMINATION_DETAILS_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_TERMINATION_REASON_CONF = "camel.sink.endpoint.terminationReason";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_TERMINATION_REASON_DOC = "The reason for terminating a workflow.";
    public static final String CAMEL_SINK_AWSSWF_ENDPOINT_TERMINATION_REASON_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_AMAZON_SWCLIENT_CONF = "camel.component.aws-swf.amazonSWClient";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_AMAZON_SWCLIENT_DOC = "To use the given AmazonSimpleWorkflowClient as client";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_AMAZON_SWCLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_CONFIGURATION_CONF = "camel.component.aws-swf.configuration";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_CONFIGURATION_DOC = "The component configuration";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_DATA_CONVERTER_CONF = "camel.component.aws-swf.dataConverter";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_DATA_CONVERTER_DOC = "An instance of com.amazonaws.services.simpleworkflow.flow.DataConverter to use for serializing/deserializing the data.";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_DATA_CONVERTER_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_DOMAIN_NAME_CONF = "camel.component.aws-swf.domainName";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_DOMAIN_NAME_DOC = "The workflow domain to use.";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_DOMAIN_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_EVENT_NAME_CONF = "camel.component.aws-swf.eventName";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_EVENT_NAME_DOC = "The workflow or activity event name to use.";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_EVENT_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_REGION_CONF = "camel.component.aws-swf.region";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_REGION_DOC = "Amazon AWS Region. When using this parameter, the configuration will expect the capitalized name of the region (for example AP_EAST_1) You'll need to use the name Regions.EU_WEST_1.name()";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_REGION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_VERSION_CONF = "camel.component.aws-swf.version";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_VERSION_DOC = "The workflow or activity event version to use.";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_VERSION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.aws-swf.lazyStartProducer";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AWSSWF_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_ACTIVITY_SCHEDULING_OPTIONS_CONF = "camel.component.aws-swf.activitySchedulingOptions";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_ACTIVITY_SCHEDULING_OPTIONS_DOC = "Activity scheduling options";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_ACTIVITY_SCHEDULING_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.aws-swf.autowiredEnabled";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_AWSSWF_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_CLIENT_CONFIGURATION_PARAMETERS_CONF = "camel.component.aws-swf.clientConfigurationParameters";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_CLIENT_CONFIGURATION_PARAMETERS_DOC = "To configure the ClientConfiguration using the key/values from the Map.";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_CLIENT_CONFIGURATION_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_START_WORKFLOW_OPTIONS_PARAMETERS_CONF = "camel.component.aws-swf.startWorkflowOptionsParameters";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_START_WORKFLOW_OPTIONS_PARAMETERS_DOC = "To configure the StartWorkflowOptions using the key/values from the Map.";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_START_WORKFLOW_OPTIONS_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_SWCLIENT_PARAMETERS_CONF = "camel.component.aws-swf.sWClientParameters";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_SWCLIENT_PARAMETERS_DOC = "To configure the AmazonSimpleWorkflowClient using the key/values from the Map.";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_SWCLIENT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_ACCESS_KEY_CONF = "camel.component.aws-swf.accessKey";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_ACCESS_KEY_DOC = "Amazon AWS Access Key.";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_SECRET_KEY_CONF = "camel.component.aws-swf.secretKey";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_SECRET_KEY_DOC = "Amazon AWS Secret Key.";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_CHILD_POLICY_CONF = "camel.component.aws-swf.childPolicy";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_CHILD_POLICY_DOC = "The policy to use on child workflows when terminating a workflow.";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_CHILD_POLICY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_EXECUTION_START_TO_CLOSE_TIMEOUT_CONF = "camel.component.aws-swf.executionStartToCloseTimeout";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_EXECUTION_START_TO_CLOSE_TIMEOUT_DOC = "Set the execution start to close timeout.";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_EXECUTION_START_TO_CLOSE_TIMEOUT_DEFAULT = "3600";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_OPERATION_CONF = "camel.component.aws-swf.operation";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_OPERATION_DOC = "Workflow operation One of: [SIGNAL] [CANCEL] [TERMINATE] [GET_STATE] [START] [DESCRIBE] [GET_HISTORY]";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_OPERATION_DEFAULT = "START";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_SIGNAL_NAME_CONF = "camel.component.aws-swf.signalName";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_SIGNAL_NAME_DOC = "The name of the signal to send to the workflow.";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_SIGNAL_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_STATE_RESULT_TYPE_CONF = "camel.component.aws-swf.stateResultType";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_STATE_RESULT_TYPE_DOC = "The type of the result when a workflow state is queried.";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_STATE_RESULT_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_TASK_START_TO_CLOSE_TIMEOUT_CONF = "camel.component.aws-swf.taskStartToCloseTimeout";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_TASK_START_TO_CLOSE_TIMEOUT_DOC = "Set the task start to close timeout.";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_TASK_START_TO_CLOSE_TIMEOUT_DEFAULT = "600";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_TERMINATION_DETAILS_CONF = "camel.component.aws-swf.terminationDetails";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_TERMINATION_DETAILS_DOC = "Details for terminating a workflow.";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_TERMINATION_DETAILS_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_TERMINATION_REASON_CONF = "camel.component.aws-swf.terminationReason";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_TERMINATION_REASON_DOC = "The reason for terminating a workflow.";
    public static final String CAMEL_SINK_AWSSWF_COMPONENT_TERMINATION_REASON_DEFAULT = null;

    public CamelAwsswfSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAwsswfSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_AWSSWF_PATH_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_PATH_TYPE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AWSSWF_PATH_TYPE_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_AMAZON_SWCLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_AMAZON_SWCLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_AMAZON_SWCLIENT_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_DATA_CONVERTER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_DATA_CONVERTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_DATA_CONVERTER_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_DOMAIN_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_DOMAIN_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_DOMAIN_NAME_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_EVENT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_EVENT_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_EVENT_NAME_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_REGION_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_VERSION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_VERSION_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSSWF_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_ACTIVITY_SCHEDULING_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_ACTIVITY_SCHEDULING_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_ACTIVITY_SCHEDULING_OPTIONS_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_CLIENT_CONFIGURATION_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_CLIENT_CONFIGURATION_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_CLIENT_CONFIGURATION_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_START_WORKFLOW_OPTIONS_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_START_WORKFLOW_OPTIONS_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_START_WORKFLOW_OPTIONS_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_SWCLIENT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_SWCLIENT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_SWCLIENT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_SECRET_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_SECRET_KEY_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_CHILD_POLICY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_CHILD_POLICY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_CHILD_POLICY_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_EXECUTION_START_TO_CLOSE_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_EXECUTION_START_TO_CLOSE_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_EXECUTION_START_TO_CLOSE_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_OPERATION_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_SIGNAL_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_SIGNAL_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_SIGNAL_NAME_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_STATE_RESULT_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_STATE_RESULT_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_STATE_RESULT_TYPE_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_TASK_START_TO_CLOSE_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_TASK_START_TO_CLOSE_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_TASK_START_TO_CLOSE_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_TERMINATION_DETAILS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_TERMINATION_DETAILS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_TERMINATION_DETAILS_DOC);
        conf.define(CAMEL_SINK_AWSSWF_ENDPOINT_TERMINATION_REASON_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_ENDPOINT_TERMINATION_REASON_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_ENDPOINT_TERMINATION_REASON_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_AMAZON_SWCLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_AMAZON_SWCLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_AMAZON_SWCLIENT_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_DATA_CONVERTER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_DATA_CONVERTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_DATA_CONVERTER_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_DOMAIN_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_DOMAIN_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_DOMAIN_NAME_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_EVENT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_EVENT_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_EVENT_NAME_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_REGION_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_VERSION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_VERSION_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSSWF_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_ACTIVITY_SCHEDULING_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_ACTIVITY_SCHEDULING_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_ACTIVITY_SCHEDULING_OPTIONS_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSSWF_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_CLIENT_CONFIGURATION_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_CLIENT_CONFIGURATION_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_CLIENT_CONFIGURATION_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_START_WORKFLOW_OPTIONS_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_START_WORKFLOW_OPTIONS_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_START_WORKFLOW_OPTIONS_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_SWCLIENT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_SWCLIENT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_SWCLIENT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_SECRET_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_SECRET_KEY_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_CHILD_POLICY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_CHILD_POLICY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_CHILD_POLICY_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_EXECUTION_START_TO_CLOSE_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_EXECUTION_START_TO_CLOSE_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_EXECUTION_START_TO_CLOSE_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_OPERATION_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_SIGNAL_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_SIGNAL_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_SIGNAL_NAME_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_STATE_RESULT_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_STATE_RESULT_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_STATE_RESULT_TYPE_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_TASK_START_TO_CLOSE_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_TASK_START_TO_CLOSE_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_TASK_START_TO_CLOSE_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_TERMINATION_DETAILS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_TERMINATION_DETAILS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_TERMINATION_DETAILS_DOC);
        conf.define(CAMEL_SINK_AWSSWF_COMPONENT_TERMINATION_REASON_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSWF_COMPONENT_TERMINATION_REASON_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSWF_COMPONENT_TERMINATION_REASON_DOC);
        return conf;
    }
}