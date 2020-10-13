FROM openjdk:14
EXPOSE 9191
ADD target/ventas2020.jar ventas2020.jar
ENTRYPOINT ["java","-jar","/ventas2020.jar"]