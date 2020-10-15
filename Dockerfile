FROM openjdk:8
EXPOSE 8081
ADD target/jenkins-practice.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]