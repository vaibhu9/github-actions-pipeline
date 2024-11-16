FROM mcr.microsoft.com/openjdk/jdk:21-ubuntu

WORKDIR /app

COPY build/libs/github-actions-pipeline-0.0.1-SNAPSHOT.jar pipeline.jar

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "pipeline.jar"]