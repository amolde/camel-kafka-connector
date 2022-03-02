FROM quay.io/strimzi/kafka:0.28.0-kafka-3.0.0
USER root:root
COPY ./custom-package/target/custom-camel-kafka-connector-0.9.0-package/share/java/ /opt/kafka/plugins/
USER 1001
