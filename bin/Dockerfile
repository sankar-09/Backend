# Use a Maven image to build the project
FROM maven:3.8.5-openjdk-17 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml and source code to the working directory
COPY . .


# Package the application while skipping tests
RUN mvn clean package -DskipTests

# Use a slimmed-down version of OpenJDK for the runtime
FROM openjdk:17.0.1-jdk-slim

# Set the working directory in the container
# WORKDIR /app

# Copy the packaged jar from the build stage
COPY --from=build /app/target/*.jar app.jar

# Set the entry point for the container to run the jar file
ENTRYPOINT ["java", "-jar", "/app.jar"]

# Expose port 8080 to the outside world
EXPOSE 8080



# Set up the command to run the application
# ENTRYPOINT ["java", "-jar", "/app/target/ShopFlow-0.0.1-SNAPSHOT.jar"]


#install maven 
#set maven bin path in environment variable
#run mvn -V
# run     mvn clean package      for jar file create
#also set jdk in systemm variable
# java -version
#  run java -jar target/ShopFlow-0.0.1-SNAPSHOT.jar    for run the jar file in visual studio
#docker build -t shopflow-app .
#docker run -p 8080:8080 shopflow-app



# my docker user name : sunkariramesh04
# password :sunkari@045
