 # Usar una imagen base de Java
 FROM openjdk:17-jdk-alpine

 # Establecer el directorio de trabajo en el contenedor
 WORKDIR /app
 
 # Copiar el archivo JAR de la aplicación al contenedor
 COPY target/gestion-tareas-0.0.1-SNAPSHOT.jar /app/gestion-tareas.jar
 
 # Exponer el puerto en el que la aplicación escuchará
 EXPOSE 8080
 
 # Comando para ejecutar la aplicación Java
 CMD ["java", "-jar", "gestion-tareas.jar"]
 