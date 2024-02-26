FROM openjdk:17-alpine
ARG JAR_FILE=target/dsrmktech*.jar
COPY ${JAR_FILE} dsrmktech.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/dsrmktech.jar"]
