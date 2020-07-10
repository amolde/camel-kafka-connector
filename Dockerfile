FROM strimzi/kafka:0.18.0-kafka-2.5.0
USER root:root
COPY ./custom-package/target/custom-camel-kafka-connector-0.4.0-SNAPSHOT-package/share/java/ /opt/kafka/plugins/
USER 1001
