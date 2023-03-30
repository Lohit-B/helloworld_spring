FROM eclipse-temurin:11-jdk-alpine as build
WORKDIR /workspace/app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN ./mvnw package -DskipTests
COPY target/*.war app.war

ENTRYPOINT ["java","-jar","app.war"]
