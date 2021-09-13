FROM openjdk:alpine
ADD build/libs/inventory-external-0.0.1-SNAPSHOT.jar inventory-external.jar
EXPOSE $EXT_SVC_PORT
ENTRYPOINT ["java","-jar","-Dserver.port=${EXT_SVC_PORT}","-Xms256m", "-Xmx512m","inventory-external.jar"]
