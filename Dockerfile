FROM quay.io/strimzi/kafka:0.47.0-kafka-4.0.0
USER root:root
RUN mkdir /opt/kafka/nu-custom-config
RUN chown 1001:root /opt/kafka/nu-custom-config
COPY ./custom-package/kafka_connect_tls_prepare_certificates.sh /opt/kafka/nu-custom-config/kafka_connect_tls_prepare_certificates.sh
RUN chmod +x /opt/kafka/nu-custom-config/kafka_connect_tls_prepare_certificates.sh
COPY ./custom-package/target/custom-camel-kafka-connector-4.10.4-SNAPSHOT-package/share/java/ /opt/kafka/plugins/
USER 1001
ENTRYPOINT ["/bin/bash", "/opt/kafka/nu-custom-config/kafka_connect_tls_prepare_certificates.sh"]
