FROM quay.io/strimzi/kafka:0.46.0-kafka-4.0.0
USER root:root
COPY ./custom-package/target/custom-camel-kafka-connector-1.1.0-SNAPSHOT-package/share/java/ /opt/kafka/plugins/
USER 1001
