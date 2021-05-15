FROM quay.io/strimzi/kafka:0.22.1-kafka-2.7.0
USER root:root
COPY ./custom-package/target/custom-camel-kafka-connector-0.9.0-package/share/java/ /opt/kafka/plugins/
USER 1001
