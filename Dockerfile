FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8001
ADD target/* jenkins-docker-app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /jenkins-docker-app.jar" ]