FROM openjdk:14-jdk-slim
COPY target/demo-0.0.1-SNAPSHOT.jar /opt/demo-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/opt/sample-0.0.1-SNAPSHOT.jar","&"]