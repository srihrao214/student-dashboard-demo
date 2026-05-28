# Student Dashboard Demo

A demo Student Dashboard application built with Spring Boot, Thymeleaf, JPA/Hibernate, and H2 Database.

The application demonstrates a simple educational management system where students, teachers, lectures, and exams can be managed through a web interface.

## Features

* Student management
* Teacher management
* Lecture scheduling
* Exam management
* Thymeleaf-based UI
* H2 in-memory database
* Spring Data JPA / Hibernate persistence
* Sample demo data initialization
* JUnit 5 integration testing
* Docker support
* GitLab CI/CD pipeline

## Technology Stack

* Java 17
* Spring Boot 3
* Spring Data JPA
* Hibernate
* Thymeleaf
* H2 Database
* Maven
* JUnit 5
* Docker
* GitLab CI/CD

## Project Structure

```text
src
├── main
│   ├── java
│   └── resources
│       ├── templates
│       ├── application.properties
│       └── data.sql
└── test
    └── java
```

## Running the Application

### Clone Repository

```bash
git clone https://github.com/srihrao214/student-dashboard-demo.git
cd student-dashboard-demo
```

### Build

```bash
mvn clean package
```

### Run

```bash
mvn spring-boot:run
```

Application:

```text
http://localhost:8080
```

H2 Console:

```text
http://localhost:8080/h2-console
```

## Testing

The project includes JUnit 5 integration tests that verify:

* Spring Boot application startup
* Database initialization
* Demo data loading
* Repository functionality

Run tests:

```bash
mvn test
```

## Docker Support

Build Docker image:

```bash
docker build -t student-dashboard-demo .
```

Run Docker container:

```bash
docker run -p 8080:8080 student-dashboard-demo
```

Open:

```text
http://localhost:8080
```

## CI/CD

A GitLab CI/CD pipeline is configured using `.gitlab-ci.yml`.

Pipeline stages:

* Build
* Test

The pipeline automatically executes Maven build and JUnit tests whenever code is pushed to GitLab.

## Demo Data

The application is preloaded with sample:

* Students
* Teachers
* Lectures
* Exams

using the `data.sql` script.

## Possible Future Enhancements

* Spring Security with JWT authentication
* Role-based authorization
* Attendance tracking
* Grade management
* REST API documentation with Swagger/OpenAPI
* PostgreSQL/MySQL support
* Kubernetes deployment
* Cloud deployment (AWS/Azure/GCP)

## Author

Sriram Rao

GitHub:
https://github.com/srihrao214
