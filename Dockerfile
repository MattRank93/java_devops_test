#FROM openjdk:8-jdk-alpine
#ARG JAR_FILE=build/libs/java_devops_test-0.0.3.jar
#ADD ${JAR_FILE} app.jar
#RUN echo 'we will rock you'
#WORKDIR /Java_devops_test
#COPY . .
#ENTRYPOINT ["java","-jar","/app.jar"]



FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/java_devops_test-0.0.5.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

