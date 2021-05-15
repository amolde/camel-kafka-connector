set -e

docker_tag=$1
if [[ ${docker_tag} == "" ]]
then
    echo "provide docker tag"
    exit 1
fi

# jenv disable-plugin maven
# jenv enable-plugin maven

jenv global
# 1.8.0.232
jenv version
# 1.8.0.232 (set by /Users/adeshmukh/.jenv/version)
mvn -version

# g di 2d29bd779775d76e4bb57c74ed1abe6d76744efd v0.9.0

. .env
# cd custom-package
# mvn camel-salesforce:generate -DcamelSalesforce.clientId=${clientId} -DcamelSalesforce.password=${password} -DcamelSalesforce.userName=${userName} -DcamelSalesforce.clientSecret=${clientSecret}

# mvn --projects custom-package --also-make clean package -DcamelSalesforce.clientId=${clientId} -DcamelSalesforce.password=${password} -DcamelSalesforce.userName=${userName} -DcamelSalesforce.clientSecret=${clientSecret}
mvn --projects custom-package --also-make clean package \
    -DcamelSalesforce.clientId=${clientId} \
    -DcamelSalesforce.version="49.0" \
    -DcamelSalesforce.loginUrl="${salesforceLoginUrl}" \
    -DcamelSalesforce.password=${password} \
    -DcamelSalesforce.userName=${userName} \
    -DcamelSalesforce.clientSecret=${clientSecret}

# Do we also need this?
# mvn clean package 

rm custom-package/target/custom-camel-kafka-connector-0.9.0-package/share/java/custom-camel-kafka-connector/camel-spring-3.9.0.jar
rm custom-package/target/custom-camel-kafka-connector-0.9.0-package/share/java/custom-camel-kafka-connector/camel-salesforce-3.9.0.jar
cp ~/.m2/repository/org/apache/camel/camel-spring/3.8.0/camel-spring-3.8.0.jar custom-package/target/custom-camel-kafka-connector-0.9.0-package/share/java/custom-camel-kafka-connector/.
cp ~/.m2/repository/org/apache/camel/camel-salesforce/3.8.0/camel-salesforce-3.8.0.jar custom-package/target/custom-camel-kafka-connector-0.9.0-package/share/java/custom-camel-kafka-connector/.

# docker build -t amolde/strimzi-kafka-connect:${docker_tag} -t amolde/strimzi-kafka-connect:latest .
docker build -t amolde/strimzi-kafka-connect:${docker_tag} .
docker login
docker push amolde/strimzi-kafka-connect:${docker_tag}
