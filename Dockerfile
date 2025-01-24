FROM openjdk:17-jdk-slim
EXPOSE 8080
ADD target/java-spring-project.jar java-spring-project.jar
ENTRYPOINT ["java","-jar","/java-spring-project.jar"]