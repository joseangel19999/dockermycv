FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar app-docker-1.0.jar
ENTRYPOINT ["java","-jar","/app-docker-1.0.jar"]
