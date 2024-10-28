FROM eclipse-temurin:21-jdk-ubi9-minimal
WORKDIR /app
COPY target/bookstore-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "bookstore-0.0.1-SNAPSHOT.jar"]
