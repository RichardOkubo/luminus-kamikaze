FROM openjdk:8-alpine

COPY target/uberjar/kamikaze.jar /kamikaze/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/kamikaze/app.jar"]
