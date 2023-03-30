FROM eclipse-temurin:11-jdk-alpine as build
COPY target/service-0.0.1-SNAPSHOT.war app.war
ENTRYPOINT ["java","-jar","app.war"]
