### how to dockerize a sprig app

simply generate the **.jar** file on */target*.

create your Dockerfile and use the most suitable openjdk image

[Source: Baeldung](https://www.baeldung.com/dockerizing-spring-boot-application)
```dockerfile
FROM openjdk:24-oraclelinux9
MAINTAINER baeldung.com
COPY target/apidemo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
```
then you can run from the command line or use a *docker-compose.yml* file
```yaml
services:
  message-server:
    image: message-server:1.0.0
    build:
      context: .
    ports:
      - "8080:8080"
    restart: always
    container_name: message-server

```