FROM openjdk:8
ADD target/name-concatenate.jar name-concatenate.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar", "name-concatenate.jar"]