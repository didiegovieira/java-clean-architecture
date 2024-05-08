FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY ./out/artifacts/backend_java_jar/backend-java.jar /app/backend-java.jar

EXPOSE 8080

CMD ["java", "-jar", "/backend-java.jar"]