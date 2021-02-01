FROM openjdk:11

ADD build/libs/spring-0.0.1-SNAPSHOT.jar spring.java

ENTRYPOINT ["java", "-jar", "spring.java"]

EXPOSE 8080
