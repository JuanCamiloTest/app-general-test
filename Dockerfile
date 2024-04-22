FROM openjdk:17-alpine AS builder
WORKDIR /general
COPY pom.xml ./
RUN mvn package
FROM openjdk:17-alpine
WORKDIR /general
COPY target/*.jar ./general.jar
FROM openjdk:17
EXPOSE 8001
ENTRYPOINT [ "java", "-jar", "general.jar" ]