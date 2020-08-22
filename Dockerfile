FROM openjdk:8
EXPOSE 8080
mkdir app
ADD build/libs/version-api-0.0.1-SNAPSHOT.jar /app/version-api.jar
ENTRYPOINT ["java","-jar","/app/version-api.jar"]
