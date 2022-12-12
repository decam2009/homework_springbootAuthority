FROM openjdk:latest
EXPOSE 9090
COPY target/springboot_authorities-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]

