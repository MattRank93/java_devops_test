FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/java_devops_test-0.0.3.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]