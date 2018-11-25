FROM adoptopenjdk/openjdk11:x86_64-alpine-jdk-11.0.1.13-slim
COPY target/exampleservice-b-0.0.1-SNAPSHOT.jar /opt
CMD java -jar /opt/exampleservice-b-0.0.1-SNAPSHOT.jar