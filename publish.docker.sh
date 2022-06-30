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
# system
jenv version
# 11 (set by /Users/adeshmukh/.jenv/version)
mvn -version
# Apache Maven 3.8.1 (05c21c65bdfed0f71a2f2ada8b84da59348c4c5d)
# Maven home: /usr/local/Cellar/maven/3.8.1/libexec
# Java version: 11.0.10, vendor: Oracle Corporation, runtime: /usr/local/Cellar/openjdk@11/11.0.10/libexec/openjdk.jdk/Contents/Home
# Default locale: en_US, platform encoding: UTF-8
# OS name: "mac os x", version: "11.5.2", arch: "x86_64", family: "mac"

myversion=0.11.6-SNAPSHOT
. .env
# cd custom-package
# mvn camel-salesforce:generate -DcamelSalesforce.clientId=${clientId} -DcamelSalesforce.password=${password} -DcamelSalesforce.userName=${userName} -DcamelSalesforce.clientSecret=${clientSecret}

# mvn --projects custom-package --also-make clean package -DcamelSalesforce.clientId=${clientId} -DcamelSalesforce.password=${password} -DcamelSalesforce.userName=${userName} -DcamelSalesforce.clientSecret=${clientSecret}


echo "NEED TO BE ON VPN!!!!!!!"
mvn --projects custom-package --also-make clean package \
    -DcamelSalesforce.clientId=${clientId} \
    -DcamelSalesforce.version="49.0" \
    -DcamelSalesforce.loginUrl="${salesforceLoginUrl}" \
    -DcamelSalesforce.password=${password} \
    -DcamelSalesforce.userName=${userName} \
    -DcamelSalesforce.clientSecret=${clientSecret}

# Do we also need this?
# mvn clean package 

#rm custom-package/target/custom-camel-kafka-connector-${myversion}-package/share/java/custom-camel-kafka-connector/camel-spring-3.9.0.jar
#rm custom-package/target/custom-camel-kafka-connector-${myversion}-package/share/java/custom-camel-kafka-connector/camel-salesforce-3.9.0.jar
#cp ~/.m2/repository/org/apache/camel/camel-spring/3.8.0/camel-spring-3.8.0.jar custom-package/target/custom-camel-kafka-connector-${myversion}-package/share/java/custom-camel-kafka-connector/.
#cp ~/.m2/repository/org/apache/camel/camel-salesforce/3.8.0/camel-salesforce-3.8.0.jar custom-package/target/custom-camel-kafka-connector-${myversion}-package/share/java/custom-camel-kafka-connector/.

cp ~/.m2/repository/org/postgresql/postgresql/42.3.3/postgresql-42.3.3.jar custom-package/target/custom-camel-kafka-connector-${myversion}-package/share/java/custom-camel-kafka-connector/.

docker_tag=${myversion}.0

# docker build -t amolde/strimzi-kafka-connect:${docker_tag} -t amolde/strimzi-kafka-connect:latest .
docker build -t amolde/strimzi-kafka-connect:${docker_tag} .
docker login
docker push amolde/strimzi-kafka-connect:${docker_tag}
