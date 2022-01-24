FROM openjdk:8
ADD target/java-jenkins-docker-demo.jar java-jenkins-docker-demo.jar
ENTRYPOINT ["java", "-jar","java-jenkins-docker-demo.jar"]
EXPOSE 8080