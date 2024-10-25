FROM openjdk:21-bookworm
WORKDIR /app
COPY target/JimmyPinkard-0.0.1-SNAPSHOT.jar /app/JimmyPinkard.jar
ENTRYPOINT ["java", "-jar", "/app/JimmyPinkard.jar"]