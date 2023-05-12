FROM openjdk:v8
EXPOSE 8080
WORKDIR target
ADD target/. .
