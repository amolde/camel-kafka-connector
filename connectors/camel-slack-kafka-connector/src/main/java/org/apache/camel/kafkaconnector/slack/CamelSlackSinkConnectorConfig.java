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
package org.apache.camel.kafkaconnector.slack;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelSlackSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_SLACK_PATH_CHANNEL_CONF = "camel.sink.path.channel";
    public static final String CAMEL_SINK_SLACK_PATH_CHANNEL_DOC = "The channel name (syntax #name) or slackuser (syntax userName) to send a message directly to an user.";
    public static final String CAMEL_SINK_SLACK_PATH_CHANNEL_DEFAULT = null;
    public static final String CAMEL_SINK_SLACK_ENDPOINT_ICON_EMOJI_CONF = "camel.sink.endpoint.iconEmoji";
    public static final String CAMEL_SINK_SLACK_ENDPOINT_ICON_EMOJI_DOC = "Use a Slack emoji as an avatar";
    public static final String CAMEL_SINK_SLACK_ENDPOINT_ICON_EMOJI_DEFAULT = null;
    public static final String CAMEL_SINK_SLACK_ENDPOINT_ICON_URL_CONF = "camel.sink.endpoint.iconUrl";
    public static final String CAMEL_SINK_SLACK_ENDPOINT_ICON_URL_DOC = "The avatar that the component will use when sending message to a channel or user.";
    public static final String CAMEL_SINK_SLACK_ENDPOINT_ICON_URL_DEFAULT = null;
    public static final String CAMEL_SINK_SLACK_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_SLACK_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_SLACK_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_SLACK_ENDPOINT_USERNAME_CONF = "camel.sink.endpoint.username";
    public static final String CAMEL_SINK_SLACK_ENDPOINT_USERNAME_DOC = "This is the username that the bot will have when sending messages to a channel or user.";
    public static final String CAMEL_SINK_SLACK_ENDPOINT_USERNAME_DEFAULT = null;
    public static final String CAMEL_SINK_SLACK_ENDPOINT_WEBHOOK_URL_CONF = "camel.sink.endpoint.webhookUrl";
    public static final String CAMEL_SINK_SLACK_ENDPOINT_WEBHOOK_URL_DOC = "The incoming webhook URL";
    public static final String CAMEL_SINK_SLACK_ENDPOINT_WEBHOOK_URL_DEFAULT = null;
    public static final String CAMEL_SINK_SLACK_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_SLACK_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_SLACK_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_SLACK_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_SLACK_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_SLACK_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_SLACK_COMPONENT_WEBHOOK_URL_CONF = "camel.component.slack.webhookUrl";
    public static final String CAMEL_SINK_SLACK_COMPONENT_WEBHOOK_URL_DOC = "The incoming webhook URL";
    public static final String CAMEL_SINK_SLACK_COMPONENT_WEBHOOK_URL_DEFAULT = null;
    public static final String CAMEL_SINK_SLACK_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.slack.lazyStartProducer";
    public static final String CAMEL_SINK_SLACK_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_SLACK_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_SLACK_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.slack.basicPropertyBinding";
    public static final String CAMEL_SINK_SLACK_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_SLACK_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelSlackSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelSlackSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_SLACK_PATH_CHANNEL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SLACK_PATH_CHANNEL_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_SLACK_PATH_CHANNEL_DOC);
        conf.define(CAMEL_SINK_SLACK_ENDPOINT_ICON_EMOJI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SLACK_ENDPOINT_ICON_EMOJI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SLACK_ENDPOINT_ICON_EMOJI_DOC);
        conf.define(CAMEL_SINK_SLACK_ENDPOINT_ICON_URL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SLACK_ENDPOINT_ICON_URL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SLACK_ENDPOINT_ICON_URL_DOC);
        conf.define(CAMEL_SINK_SLACK_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SLACK_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SLACK_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_SLACK_ENDPOINT_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SLACK_ENDPOINT_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SLACK_ENDPOINT_USERNAME_DOC);
        conf.define(CAMEL_SINK_SLACK_ENDPOINT_WEBHOOK_URL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SLACK_ENDPOINT_WEBHOOK_URL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SLACK_ENDPOINT_WEBHOOK_URL_DOC);
        conf.define(CAMEL_SINK_SLACK_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SLACK_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SLACK_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_SLACK_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SLACK_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SLACK_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_SLACK_COMPONENT_WEBHOOK_URL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SLACK_COMPONENT_WEBHOOK_URL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SLACK_COMPONENT_WEBHOOK_URL_DOC);
        conf.define(CAMEL_SINK_SLACK_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SLACK_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SLACK_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_SLACK_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SLACK_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SLACK_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}