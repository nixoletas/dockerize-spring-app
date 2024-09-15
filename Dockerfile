FROM openjdk:24-oraclelinux9
MAINTAINER baeldung.com
COPY target/apidemo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]