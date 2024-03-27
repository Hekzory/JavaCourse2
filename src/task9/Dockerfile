FROM openjdk:20
COPY build/libs/app-*.jar /app/app.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "app.jar"]