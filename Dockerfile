FROM openjdk:21
WORKDIR "/home/app"
COPY . .
RUN ["./mvnw", "package", "-DskipTests"]
RUN ["useradd", "-s", "/bin/bash", "app"]
RUN ["chown", "-R", "app", "/home/app"]
RUN mv target/JimmyPinkard-0.0.1-SNAPSHOT.jar .
RUN rm -rf src ReadMe.md Dockerfile mvnw.cmd pom.xml mvnw target .gitignore
USER app
ENTRYPOINT ["java", "-jar", "JimmyPinkard-0.0.1-SNAPSHOT.jar"]