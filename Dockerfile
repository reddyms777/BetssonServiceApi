FROM openjdk:8
ADD src/main/Manifest/mysql-rest-docker.jar mysql-rest-docker.jar 
EXPOSE 8081
ENTRYPOINT ["java","-jar","/mysql-rest-docker.jar"]
