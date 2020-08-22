FROM openjdk:8
EXPOSE 8080
RUN mkdir /app
ADD build/libs/version-api-0.0.1-SNAPSHOT.jar /app/version-api.jar
ENTRYPOINT ["java","-jar","/app/version-api.jar"]
