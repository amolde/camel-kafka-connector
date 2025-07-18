
myversion="4.10.4-SNAPSHOT"
docker_tag="${myversion}-0.0"

jenv disable-plugin maven
jenv enable-plugin maven
jenv global
# 17
jenv version
# 17 (set by /Users/a.deshmukh/.jenv/version)
mvn -version
# Apache Maven 3.9.0 (9b58d2bad23a66be161c4664ef21ce219c2c8584)
# Maven home: /usr/local/Cellar/maven/3.9.0/libexec
# Java version: 17.0.6, vendor: Homebrew, runtime: /usr/local/Cellar/openjdk@17/17.0.6/libexec/openjdk.jdk/Contents/Home
# Default locale: en_US, platform encoding: UTF-8
# OS name: "mac os x", version: "12.6.1", arch: "x86_64", family: "mac"

mvn --projects custom-package --also-make clean package

cp ~/.m2/repository/org/postgresql/postgresql/42.4.4/postgresql-42.4.4.jar custom-package/target/custom-camel-kafka-connector-${myversion}-package/share/java/custom-camel-kafka-connector/.

docker build -t amolde/strimzi-kafka-connect:${docker_tag} .
docker login
docker push amolde/strimzi-kafka-connect:${docker_tag}

