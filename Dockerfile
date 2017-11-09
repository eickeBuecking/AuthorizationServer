FROM goyalzz/ubuntu-java-8-maven-docker-image
VOLUME /tmp
ADD target/AuthenticationServer-0.0.1-SNAPSHOT.jar authenticationserver.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/authenticationserver.jar"]
