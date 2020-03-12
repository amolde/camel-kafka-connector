set -e

# jenv disable-plugin maven
# jenv enable-plugin maven

jenv global
# 1.8.0.232
jenv version
# 1.8.0.232 (set by /Users/adeshmukh/.jenv/version)
mvn -version
mvn --projects custom-package --also-make clean package 

docker build -t amolde/strimzi-kafka-connect .
docker login
docker push amolde/strimzi-kafka-connect
