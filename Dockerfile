FROM openjdk:17
EXPOSE 8080
ADD target/cicd-sample.jar cicd-sample.jar
ENTRYPOINT ["java","-jar","/cicd-sample.jar"]
