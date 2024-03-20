FROM registry.access.redhat.com/ubi9/openjdk-17
ADD ./target/dynatrace-spring-rest-controller-0.0.1-SNAPSHOT.jar /app/app.jar
ADD upload/script.sh /app/script.sh
USER root
RUN chmod -R +x /app && sh /app/script.sh
