FROM openjdk:alpine
ADD build/libs/inventory-external-0.0.1-SNAPSHOT.jar inventory-external.jar
EXPOSE $PORT
ENTRYPOINT ["java","-jar","-Dserver.port=${PORT}","-Xms256m", "-Xmx512m","inventory-external.jar"]
