set -e

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

mvn --projects custom-package --also-make clean package -DcamelSalesforce.clientId=${clientId} -DcamelSalesforce.password=${password} -DcamelSalesforce.userName=${userName} -DcamelSalesforce.clientSecret=${clientSecret}
# mvn --projects custom-package --also-make package -DcamelSalesforce.clientId=${clientId} -DcamelSalesforce.password=${password} -DcamelSalesforce.userName=${userName} -DcamelSalesforce.clientSecret=${clientSecret}

docker build -t amolde/strimzi-kafka-connect .
docker login
docker push amolde/strimzi-kafka-connect
