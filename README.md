# Student Dashboard Demo

A demo Student Dashboard application built with Spring Boot, Thymeleaf, JPA/Hibernate, and H2 Database. The project demonstrates CRUD operations for Students, Teachers, Lectures, and Exams, along with entity relationships, dashboard statistics, Docker-based deployment, JUnit testing, and CI/CD automation using GitHub Actions and GitLab CI/CD.
## Security
The project roadmap includes integration with Keycloak for authentication and authorization using OAuth2/OpenID Connect and JWT-based security. A complete setup guide and containerized Keycloak configuration may be added in future versions.

## Status
The project includes automated build and test pipelines using:

- GitHub Actions
- GitLab CI/CD

The pipelines automatically execute Maven builds and JUnit tests whenever code is pushed to the repository.

## Features

* Student Management
* Teacher Management
* Lecture Scheduling
* Exam Management
* Thymeleaf-based UI
* H2 Database Integration
* Spring Data JPA / Hibernate Persistence
* Sample Demo Data Initialization
* JUnit 5 Integration Testing
* Docker Support
* GitHub Actions CI
* GitLab CI/CD

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
* GitHub Actions
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

The project includes JUnit 5 tests that verify:

* Spring Boot application startup
* Repository functionality
* CRUD persistence operations

Run tests:

```bash
mvn test
```

## Docker Support

Build image:

```bash
docker build -t student-dashboard-demo .
```

Run container:

```bash
docker run -p 8080:8080 student-dashboard-demo
```

Open:

```text
http://localhost:8080
```

## CI/CD

The project includes automated pipelines using:

* GitHub Actions
* GitLab CI/CD

Pipeline stages:

* Build
* Test

The pipelines automatically execute Maven builds and JUnit tests whenever code is pushed.

## Demo Data

The application is preloaded with sample:

* Students
* Teachers
* Lectures
* Exams

using `data.sql`.

Additional Students, Teachers, Lectures, and Exams can be created through the web interface.

## Possible Future Enhancements

* Spring Security with JWT Authentication
* Role-Based Authorization
* REST API Documentation using Swagger/OpenAPI
* PostgreSQL / MySQL Support
* Container Orchestration with Kubernetes
* Cloud Deployment (AWS, Azure, GCP)
* Advanced Dashboard Analytics
* Search and Pagination
* Email Notifications

## Author

**Sriram Rao**

GitHub: https://github.com/srihrao214
