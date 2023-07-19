FROM openjdk:8
EXPOSE 8080
ADD target/cicd-sample.jar cicd-docker-sample.jar
ENTRYPOINT ["java","-jar","/cicd-sample.jar"]