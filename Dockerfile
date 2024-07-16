FROM openjdk:8-jdk-alpine
MAINTAINER angelcode.com
ARG JAR_FILE=target/app-docker-1.0.jar
EXPOSE 8081
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]