FROM openjdk:8-jdk-alpine
EXPOSE 8083
ADD target/achat.war achat.jar
ENTRYPOINT ["java","-jar","/achat.jar"]