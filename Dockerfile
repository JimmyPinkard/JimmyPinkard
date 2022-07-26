FROM openjdk:17.0.2-bullseye
COPY target/JimmyPinkard-0.0.1-SNAPSHOT.jar /JimmyPinkard.jar
COPY ~/* /ssl/
CMD echo
CMD java -jar /JimmyPinkard.jar