FROM openjdk:8-jdk-alpine
EXPOSE 8083
ADD target/achat.war achat.war
ENTRYPOINT ["java","-jar","/achat.war"]