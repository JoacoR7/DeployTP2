FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/rest-api-0.0.1.jar
COPY ${JAR_FILE} appseguridad.jar
EXPOSE 9000
ENTRYPOINT ["java","-jar","appseguridad.jar"]