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

docker build -t amolde/strimzi-kafka-connect:${docker_tag} -t amolde/strimzi-kafka-connect:latest .
docker login
docker push amolde/strimzi-kafka-connect
