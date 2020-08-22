# versionCI
A Repository which creates a simple JAVA Rest Endpoint, containerises it and runs CI
#To Build the App
Go to Root Path
1. ./gradlew build
#To run the app
2. java -jar build/libs/version-api-0.0.1-SNAPSHOT.jar

#Test output manually
Hit the following URL : http://localhost:8080/version
Once done we can shutdown the process.

#Create CI pipeline
1. Download Jenkins WAR file from https://www.jenkins.io/download/
2. Run the WAR : java -jar jenkins.war -> This will run jenkins at localhost:8080/

The next steps to configure the Jenkins Pipeline is there in the doc with screenshot.
   
