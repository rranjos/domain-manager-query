FROM openjdk:17-jdk-alpine
VOLUME /tmp
ADD target/domain-manager-query-1.0.jar domain-manager-query.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/domain-manager-query.jar"]