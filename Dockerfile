FROM openjdk:17-jdk-alpine
VOLUME /tmp
ADD target/domain-manager-1.0.jar domain-manager-1.0.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/domain-manager-1.0.jar"]