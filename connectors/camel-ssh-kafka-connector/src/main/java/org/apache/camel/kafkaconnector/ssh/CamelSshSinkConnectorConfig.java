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
package org.apache.camel.kafkaconnector.ssh;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelSshSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_SSH_PATH_HOST_CONF = "camel.sink.path.host";
    public static final String CAMEL_SINK_SSH_PATH_HOST_DOC = "Sets the hostname of the remote SSH server.";
    public static final String CAMEL_SINK_SSH_PATH_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_SSH_PATH_PORT_CONF = "camel.sink.path.port";
    public static final String CAMEL_SINK_SSH_PATH_PORT_DOC = "Sets the port number for the remote SSH server.";
    public static final Integer CAMEL_SINK_SSH_PATH_PORT_DEFAULT = 22;
    public static final String CAMEL_SINK_SSH_ENDPOINT_FAIL_ON_UNKNOWN_HOST_CONF = "camel.sink.endpoint.failOnUnknownHost";
    public static final String CAMEL_SINK_SSH_ENDPOINT_FAIL_ON_UNKNOWN_HOST_DOC = "Specifies whether a connection to an unknown host should fail or not. This value is only checked when the property knownHosts is set.";
    public static final Boolean CAMEL_SINK_SSH_ENDPOINT_FAIL_ON_UNKNOWN_HOST_DEFAULT = false;
    public static final String CAMEL_SINK_SSH_ENDPOINT_KNOWN_HOSTS_RESOURCE_CONF = "camel.sink.endpoint.knownHostsResource";
    public static final String CAMEL_SINK_SSH_ENDPOINT_KNOWN_HOSTS_RESOURCE_DOC = "Sets the resource path for a known_hosts file";
    public static final String CAMEL_SINK_SSH_ENDPOINT_KNOWN_HOSTS_RESOURCE_DEFAULT = null;
    public static final String CAMEL_SINK_SSH_ENDPOINT_TIMEOUT_CONF = "camel.sink.endpoint.timeout";
    public static final String CAMEL_SINK_SSH_ENDPOINT_TIMEOUT_DOC = "Sets the timeout in milliseconds to wait in establishing the remote SSH server connection. Defaults to 30000 milliseconds.";
    public static final Long CAMEL_SINK_SSH_ENDPOINT_TIMEOUT_DEFAULT = 30000L;
    public static final String CAMEL_SINK_SSH_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_SSH_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_SSH_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_SSH_ENDPOINT_CHANNEL_TYPE_CONF = "camel.sink.endpoint.channelType";
    public static final String CAMEL_SINK_SSH_ENDPOINT_CHANNEL_TYPE_DOC = "Sets the channel type to pass to the Channel as part of command execution. Defaults to exec.";
    public static final String CAMEL_SINK_SSH_ENDPOINT_CHANNEL_TYPE_DEFAULT = "exec";
    public static final String CAMEL_SINK_SSH_ENDPOINT_SHELL_PROMPT_CONF = "camel.sink.endpoint.shellPrompt";
    public static final String CAMEL_SINK_SSH_ENDPOINT_SHELL_PROMPT_DOC = "Sets the shellPrompt to be dropped when response is read after command execution";
    public static final String CAMEL_SINK_SSH_ENDPOINT_SHELL_PROMPT_DEFAULT = null;
    public static final String CAMEL_SINK_SSH_ENDPOINT_SLEEP_FOR_SHELL_PROMPT_CONF = "camel.sink.endpoint.sleepForShellPrompt";
    public static final String CAMEL_SINK_SSH_ENDPOINT_SLEEP_FOR_SHELL_PROMPT_DOC = "Sets the sleep period in milliseconds to wait reading response from shell prompt. Defaults to 100 milliseconds.";
    public static final Long CAMEL_SINK_SSH_ENDPOINT_SLEEP_FOR_SHELL_PROMPT_DEFAULT = 100L;
    public static final String CAMEL_SINK_SSH_ENDPOINT_CERT_RESOURCE_CONF = "camel.sink.endpoint.certResource";
    public static final String CAMEL_SINK_SSH_ENDPOINT_CERT_RESOURCE_DOC = "Sets the resource path of the certificate to use for Authentication. Will use ResourceHelperKeyPairProvider to resolve file based certificate, and depends on keyType setting.";
    public static final String CAMEL_SINK_SSH_ENDPOINT_CERT_RESOURCE_DEFAULT = null;
    public static final String CAMEL_SINK_SSH_ENDPOINT_CERT_RESOURCE_PASSWORD_CONF = "camel.sink.endpoint.certResourcePassword";
    public static final String CAMEL_SINK_SSH_ENDPOINT_CERT_RESOURCE_PASSWORD_DOC = "Sets the password to use in loading certResource, if certResource is an encrypted key.";
    public static final String CAMEL_SINK_SSH_ENDPOINT_CERT_RESOURCE_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_SSH_ENDPOINT_KEY_PAIR_PROVIDER_CONF = "camel.sink.endpoint.keyPairProvider";
    public static final String CAMEL_SINK_SSH_ENDPOINT_KEY_PAIR_PROVIDER_DOC = "Sets the KeyPairProvider reference to use when connecting using Certificates to the remote SSH Server.";
    public static final String CAMEL_SINK_SSH_ENDPOINT_KEY_PAIR_PROVIDER_DEFAULT = null;
    public static final String CAMEL_SINK_SSH_ENDPOINT_KEY_TYPE_CONF = "camel.sink.endpoint.keyType";
    public static final String CAMEL_SINK_SSH_ENDPOINT_KEY_TYPE_DOC = "Sets the key type to pass to the KeyPairProvider as part of authentication. KeyPairProvider.loadKey(...) will be passed this value. From Camel 3.0.0 / 2.25.0, by default Camel will select the first available KeyPair that is loaded. Prior to this, a KeyType of 'ssh-rsa' was enforced by default.";
    public static final String CAMEL_SINK_SSH_ENDPOINT_KEY_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_SSH_ENDPOINT_PASSWORD_CONF = "camel.sink.endpoint.password";
    public static final String CAMEL_SINK_SSH_ENDPOINT_PASSWORD_DOC = "Sets the password to use in connecting to remote SSH server. Requires keyPairProvider to be set to null.";
    public static final String CAMEL_SINK_SSH_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_SSH_ENDPOINT_USERNAME_CONF = "camel.sink.endpoint.username";
    public static final String CAMEL_SINK_SSH_ENDPOINT_USERNAME_DOC = "Sets the username to use in logging into the remote SSH server.";
    public static final String CAMEL_SINK_SSH_ENDPOINT_USERNAME_DEFAULT = null;
    public static final String CAMEL_SINK_SSH_COMPONENT_FAIL_ON_UNKNOWN_HOST_CONF = "camel.component.ssh.failOnUnknownHost";
    public static final String CAMEL_SINK_SSH_COMPONENT_FAIL_ON_UNKNOWN_HOST_DOC = "Specifies whether a connection to an unknown host should fail or not. This value is only checked when the property knownHosts is set.";
    public static final Boolean CAMEL_SINK_SSH_COMPONENT_FAIL_ON_UNKNOWN_HOST_DEFAULT = false;
    public static final String CAMEL_SINK_SSH_COMPONENT_KNOWN_HOSTS_RESOURCE_CONF = "camel.component.ssh.knownHostsResource";
    public static final String CAMEL_SINK_SSH_COMPONENT_KNOWN_HOSTS_RESOURCE_DOC = "Sets the resource path for a known_hosts file";
    public static final String CAMEL_SINK_SSH_COMPONENT_KNOWN_HOSTS_RESOURCE_DEFAULT = null;
    public static final String CAMEL_SINK_SSH_COMPONENT_TIMEOUT_CONF = "camel.component.ssh.timeout";
    public static final String CAMEL_SINK_SSH_COMPONENT_TIMEOUT_DOC = "Sets the timeout in milliseconds to wait in establishing the remote SSH server connection. Defaults to 30000 milliseconds.";
    public static final Long CAMEL_SINK_SSH_COMPONENT_TIMEOUT_DEFAULT = 30000L;
    public static final String CAMEL_SINK_SSH_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.ssh.lazyStartProducer";
    public static final String CAMEL_SINK_SSH_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_SSH_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_SSH_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.ssh.autowiredEnabled";
    public static final String CAMEL_SINK_SSH_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_SSH_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_SSH_COMPONENT_CHANNEL_TYPE_CONF = "camel.component.ssh.channelType";
    public static final String CAMEL_SINK_SSH_COMPONENT_CHANNEL_TYPE_DOC = "Sets the channel type to pass to the Channel as part of command execution. Defaults to exec.";
    public static final String CAMEL_SINK_SSH_COMPONENT_CHANNEL_TYPE_DEFAULT = "exec";
    public static final String CAMEL_SINK_SSH_COMPONENT_CONFIGURATION_CONF = "camel.component.ssh.configuration";
    public static final String CAMEL_SINK_SSH_COMPONENT_CONFIGURATION_DOC = "Component configuration";
    public static final String CAMEL_SINK_SSH_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_SSH_COMPONENT_SHELL_PROMPT_CONF = "camel.component.ssh.shellPrompt";
    public static final String CAMEL_SINK_SSH_COMPONENT_SHELL_PROMPT_DOC = "Sets the shellPrompt to be dropped when response is read after command execution";
    public static final String CAMEL_SINK_SSH_COMPONENT_SHELL_PROMPT_DEFAULT = null;
    public static final String CAMEL_SINK_SSH_COMPONENT_SLEEP_FOR_SHELL_PROMPT_CONF = "camel.component.ssh.sleepForShellPrompt";
    public static final String CAMEL_SINK_SSH_COMPONENT_SLEEP_FOR_SHELL_PROMPT_DOC = "Sets the sleep period in milliseconds to wait reading response from shell prompt. Defaults to 100 milliseconds.";
    public static final Long CAMEL_SINK_SSH_COMPONENT_SLEEP_FOR_SHELL_PROMPT_DEFAULT = 100L;
    public static final String CAMEL_SINK_SSH_COMPONENT_CERT_RESOURCE_CONF = "camel.component.ssh.certResource";
    public static final String CAMEL_SINK_SSH_COMPONENT_CERT_RESOURCE_DOC = "Sets the resource path of the certificate to use for Authentication. Will use ResourceHelperKeyPairProvider to resolve file based certificate, and depends on keyType setting.";
    public static final String CAMEL_SINK_SSH_COMPONENT_CERT_RESOURCE_DEFAULT = null;
    public static final String CAMEL_SINK_SSH_COMPONENT_CERT_RESOURCE_PASSWORD_CONF = "camel.component.ssh.certResourcePassword";
    public static final String CAMEL_SINK_SSH_COMPONENT_CERT_RESOURCE_PASSWORD_DOC = "Sets the password to use in loading certResource, if certResource is an encrypted key.";
    public static final String CAMEL_SINK_SSH_COMPONENT_CERT_RESOURCE_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_SSH_COMPONENT_KEY_PAIR_PROVIDER_CONF = "camel.component.ssh.keyPairProvider";
    public static final String CAMEL_SINK_SSH_COMPONENT_KEY_PAIR_PROVIDER_DOC = "Sets the KeyPairProvider reference to use when connecting using Certificates to the remote SSH Server.";
    public static final String CAMEL_SINK_SSH_COMPONENT_KEY_PAIR_PROVIDER_DEFAULT = null;
    public static final String CAMEL_SINK_SSH_COMPONENT_KEY_TYPE_CONF = "camel.component.ssh.keyType";
    public static final String CAMEL_SINK_SSH_COMPONENT_KEY_TYPE_DOC = "Sets the key type to pass to the KeyPairProvider as part of authentication. KeyPairProvider.loadKey(...) will be passed this value. From Camel 3.0.0 / 2.25.0, by default Camel will select the first available KeyPair that is loaded. Prior to this, a KeyType of 'ssh-rsa' was enforced by default.";
    public static final String CAMEL_SINK_SSH_COMPONENT_KEY_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_SSH_COMPONENT_PASSWORD_CONF = "camel.component.ssh.password";
    public static final String CAMEL_SINK_SSH_COMPONENT_PASSWORD_DOC = "Sets the password to use in connecting to remote SSH server. Requires keyPairProvider to be set to null.";
    public static final String CAMEL_SINK_SSH_COMPONENT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_SSH_COMPONENT_USERNAME_CONF = "camel.component.ssh.username";
    public static final String CAMEL_SINK_SSH_COMPONENT_USERNAME_DOC = "Sets the username to use in logging into the remote SSH server.";
    public static final String CAMEL_SINK_SSH_COMPONENT_USERNAME_DEFAULT = null;

    public CamelSshSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelSshSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_SSH_PATH_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SSH_PATH_HOST_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_SSH_PATH_HOST_DOC);
        conf.define(CAMEL_SINK_SSH_PATH_PORT_CONF, ConfigDef.Type.INT, CAMEL_SINK_SSH_PATH_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_PATH_PORT_DOC);
        conf.define(CAMEL_SINK_SSH_ENDPOINT_FAIL_ON_UNKNOWN_HOST_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SSH_ENDPOINT_FAIL_ON_UNKNOWN_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_ENDPOINT_FAIL_ON_UNKNOWN_HOST_DOC);
        conf.define(CAMEL_SINK_SSH_ENDPOINT_KNOWN_HOSTS_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SSH_ENDPOINT_KNOWN_HOSTS_RESOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_ENDPOINT_KNOWN_HOSTS_RESOURCE_DOC);
        conf.define(CAMEL_SINK_SSH_ENDPOINT_TIMEOUT_CONF, ConfigDef.Type.LONG, CAMEL_SINK_SSH_ENDPOINT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_ENDPOINT_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_SSH_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SSH_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_SSH_ENDPOINT_CHANNEL_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SSH_ENDPOINT_CHANNEL_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_ENDPOINT_CHANNEL_TYPE_DOC);
        conf.define(CAMEL_SINK_SSH_ENDPOINT_SHELL_PROMPT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SSH_ENDPOINT_SHELL_PROMPT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_ENDPOINT_SHELL_PROMPT_DOC);
        conf.define(CAMEL_SINK_SSH_ENDPOINT_SLEEP_FOR_SHELL_PROMPT_CONF, ConfigDef.Type.LONG, CAMEL_SINK_SSH_ENDPOINT_SLEEP_FOR_SHELL_PROMPT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_ENDPOINT_SLEEP_FOR_SHELL_PROMPT_DOC);
        conf.define(CAMEL_SINK_SSH_ENDPOINT_CERT_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SSH_ENDPOINT_CERT_RESOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_ENDPOINT_CERT_RESOURCE_DOC);
        conf.define(CAMEL_SINK_SSH_ENDPOINT_CERT_RESOURCE_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_SSH_ENDPOINT_CERT_RESOURCE_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_ENDPOINT_CERT_RESOURCE_PASSWORD_DOC);
        conf.define(CAMEL_SINK_SSH_ENDPOINT_KEY_PAIR_PROVIDER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SSH_ENDPOINT_KEY_PAIR_PROVIDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_ENDPOINT_KEY_PAIR_PROVIDER_DOC);
        conf.define(CAMEL_SINK_SSH_ENDPOINT_KEY_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SSH_ENDPOINT_KEY_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_ENDPOINT_KEY_TYPE_DOC);
        conf.define(CAMEL_SINK_SSH_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_SSH_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_SSH_ENDPOINT_USERNAME_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_SSH_ENDPOINT_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_ENDPOINT_USERNAME_DOC);
        conf.define(CAMEL_SINK_SSH_COMPONENT_FAIL_ON_UNKNOWN_HOST_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SSH_COMPONENT_FAIL_ON_UNKNOWN_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_COMPONENT_FAIL_ON_UNKNOWN_HOST_DOC);
        conf.define(CAMEL_SINK_SSH_COMPONENT_KNOWN_HOSTS_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SSH_COMPONENT_KNOWN_HOSTS_RESOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_COMPONENT_KNOWN_HOSTS_RESOURCE_DOC);
        conf.define(CAMEL_SINK_SSH_COMPONENT_TIMEOUT_CONF, ConfigDef.Type.LONG, CAMEL_SINK_SSH_COMPONENT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_COMPONENT_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_SSH_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SSH_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_SSH_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SSH_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_SSH_COMPONENT_CHANNEL_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SSH_COMPONENT_CHANNEL_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_COMPONENT_CHANNEL_TYPE_DOC);
        conf.define(CAMEL_SINK_SSH_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SSH_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_SSH_COMPONENT_SHELL_PROMPT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SSH_COMPONENT_SHELL_PROMPT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_COMPONENT_SHELL_PROMPT_DOC);
        conf.define(CAMEL_SINK_SSH_COMPONENT_SLEEP_FOR_SHELL_PROMPT_CONF, ConfigDef.Type.LONG, CAMEL_SINK_SSH_COMPONENT_SLEEP_FOR_SHELL_PROMPT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_COMPONENT_SLEEP_FOR_SHELL_PROMPT_DOC);
        conf.define(CAMEL_SINK_SSH_COMPONENT_CERT_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SSH_COMPONENT_CERT_RESOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_COMPONENT_CERT_RESOURCE_DOC);
        conf.define(CAMEL_SINK_SSH_COMPONENT_CERT_RESOURCE_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_SSH_COMPONENT_CERT_RESOURCE_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_COMPONENT_CERT_RESOURCE_PASSWORD_DOC);
        conf.define(CAMEL_SINK_SSH_COMPONENT_KEY_PAIR_PROVIDER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SSH_COMPONENT_KEY_PAIR_PROVIDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_COMPONENT_KEY_PAIR_PROVIDER_DOC);
        conf.define(CAMEL_SINK_SSH_COMPONENT_KEY_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SSH_COMPONENT_KEY_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_COMPONENT_KEY_TYPE_DOC);
        conf.define(CAMEL_SINK_SSH_COMPONENT_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_SSH_COMPONENT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_COMPONENT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_SSH_COMPONENT_USERNAME_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_SSH_COMPONENT_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SSH_COMPONENT_USERNAME_DOC);
        return conf;
    }
}