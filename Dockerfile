FROM openjdk:17
EXPOSE 8001
COPY target/general-0.0.1-SNAPSHOT.jar general-test.jar
ENTRYPOINT [ "java", "-jar", "general-test.jar" ]