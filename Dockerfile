FROM maven:3.8.6-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17
EXPOSE 8001
COPY --from=build /target/general-0.0.1-SNAPSHOT.jar general-test.jar
ENTRYPOINT [ "java", "-jar", "general-test.jar" ]