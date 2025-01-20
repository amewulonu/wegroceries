# Use the official Maven image with OpenJDK 21
FROM maven:3.8.7-openjdk-21

# Set the working directory in the container
WORKDIR /workspace

# Copy the pom.xml and download dependencies only (this will be cached)
COPY pom.xml .

# Download dependencies
RUN mvn dependency:go-offline

# Copy the rest of the project files to the container
COPY src ./src

# Package the application
RUN mvn package

# Set the default command for the container
CMD ["mvn", "spring-boot:run"]