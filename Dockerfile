FROM openjdk:11

EXPOSE 8080


ADD target/spring-boot-gcp.jar spring-boot-gcp.jar

ENTRYPOINT ["java","-jar","spring-boot-gcp.jar"]