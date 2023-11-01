FROM maven:3.8.5-openjdk-11 as build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests



FROM openjdk:11
WORKDIR /app
#COPY ./target/eurekaserver-0.0.1-SNAPSHOT.jar app.jar
COPY --from=build ./app/target/*.jar ./app.jar

ENV RABBITMQ_SERVER=rabbitmq-host
ENV EUREKA_SERVER=localhost

ENTRYPOINT java -jar app.jar