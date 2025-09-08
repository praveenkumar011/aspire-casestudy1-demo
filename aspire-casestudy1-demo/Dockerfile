# Stage 1: Build the project using Maven
FROM maven:3.9.4-eclipse-temurin-21 AS build
WORKDIR /app
COPY . /app
RUN mvn clean package

# Stage 2: Run the built JAR using a lightweight JDK image
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
