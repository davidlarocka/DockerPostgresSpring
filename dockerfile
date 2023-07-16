FROM openjdk:17-jdk-alpine

COPY target/api-postgresql-0.0.1-SNAPSHOT.jar api-app-java.jar
ENTRYPOINT [ "java", "-jar", "api-app-java.jar" ]