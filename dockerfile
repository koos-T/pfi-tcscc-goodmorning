# Use a base image with Java runtime
FROM openjdk:11-jre-slim

# Set the working directory
WORKDIR /app

# Copy the application JAR file into the container
COPY target/pfi-tcscc-goodmorning.jar app.jar

# Expose the port your app will run on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
