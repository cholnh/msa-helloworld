FROM java:8
VOLUME /helloworldVolume
EXPOSE 8080
ARG JAR_FILE=build/libs/helloworld-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
