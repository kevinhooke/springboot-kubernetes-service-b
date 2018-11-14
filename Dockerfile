FROM openjdk:11-jre
COPY target/exampleservice-b-0.0.2-SNAPSHOT.jar /opt
CMD java -jar /opt/exampleservice-b-0.0.2-SNAPSHOT.jar