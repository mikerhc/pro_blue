FROM maven:3.9.7-eclipse-temurin-22 AS build
#WORKDIR /umich_nfl

COPY . .

RUN mvn clean package -DskipTests
RUN ls -l /target

FROM openjdk:22-jdk-slim

COPY --from=build /target/umich_nfl-0.0.1-SNAPSHOT.jar umich_nfl.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","umich_nfl.jar"]