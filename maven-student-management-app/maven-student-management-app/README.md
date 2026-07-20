# Student Management API

A beginner-friendly Spring Boot REST API created to demonstrate Maven, Git, GitHub and REST concepts.

## Technologies

- Java 17
- Maven
- Spring Boot
- Spring Web
- Jakarta Validation
- JUnit

## Build the application

mvn clean package

## Run the application

mvn spring-boot:run

Or:

java -jar target/student-management-api-1.0.0.jar

## API Endpoints

### Get all students

GET /api/students

### Get one student

GET /api/students/{id}

### Create a student

POST /api/students

Sample request:

{
  "name": "Rahul",
  "email": "rahul@example.com",
  "course": "Maven",
  "age": 23
}

### Update a student

PUT /api/students/{id}

### Delete a student

DELETE /api/students/{id}

## Important Note

This training project stores data in memory. Data is reset whenever the application restarts.
