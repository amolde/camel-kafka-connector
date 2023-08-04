FROM quay.io/strimzi/kafka:0.32.0-kafka-3.2.0
USER root:root
COPY ./custom-package/target/custom-camel-kafka-connector-1.1.0-SNAPSHOT-package/share/java/ /opt/kafka/plugins/
USER 1001
