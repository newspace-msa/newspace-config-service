FROM openjdk:17-ea-11-jdk-slim
VOLUME /tmp
COPY target/config-service-1.0.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]