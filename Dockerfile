FROM quay.io/strimzi/kafka:0.46.0-kafka-4.0.0
USER root:root
COPY ./custom-package/target/custom-camel-kafka-connector-4.10.4-SNAPSHOT-package/share/java/ /opt/kafka/plugins/
USER 1001
