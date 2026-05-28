# Student Dashboard Demo

A modern Java-based Student Management Dashboard application built using Spring Boot, Thymeleaf, Spring Data JPA, and Bootstrap.

This project demonstrates a clean enterprise-style MVC architecture, server-side rendering, database integration, and responsive UI design.

---

# Project Overview

The application allows administrators or staff members to manage student information through a web dashboard.

Features
Responsive student dashboard UI
Student overview page
Backend integration using Spring Boot
Thymeleaf-based frontend rendering
Maven project structure
Basic database integration with H2
Clean layered architecture using Controller, Service and Repository patterns

The project focuses on:

* Clean backend architecture
* MVC design principles
* Spring Boot enterprise development practices
* Database persistence using JPA/Hibernate
* Thymeleaf server-side rendering
* Responsive frontend integration using Bootstrap

---

# Technologies Used

| Technology      | Purpose                              |
| --------------- | ------------------------------------ |
| Java            | Core programming language            |
| Spring Boot     | Backend framework                    |
| Spring MVC      | Web/MVC architecture                 |
| Spring Data JPA | Database persistence layer           |
| Hibernate       | ORM framework                        |
| Thymeleaf       | Server-side template engine          |
| Bootstrap       | Responsive frontend styling          |
| H2 Database     | In-memory database                   |
| Maven           | Dependency management and build tool |

---

# Architecture

The application follows a layered MVC architecture:

```text
Client Browser
      ↓
Thymeleaf UI
      ↓
Controller Layer
      ↓
Service Layer
      ↓
Repository Layer
      ↓
H2 Database
```

## Layer Responsibilities

### Controller Layer

Handles incoming HTTP requests and returns appropriate Thymeleaf views.

### Service Layer

Contains business logic and separates application logic from controllers.

### Repository Layer

Handles database operations using Spring Data JPA.

### Database Layer

Stores student data using H2 in-memory database.

---

# Features

## Student Management

Current functionality:

* Display student records from database
* Dashboard-style student overview
* Thymeleaf-based UI rendering
* Server-side rendering with Spring Boot MVC
* Demonstration of layered architecture

Note:
This project is currently focused on demonstrating backend architecture, MVC structure, Thymeleaf integration, and database connectivity. Student records are preloaded using `data.sql` for demonstration purposes.

## Backend Features

* MVC-based application architecture
* Dependency Injection using Spring Framework
* Server-side rendering with Thymeleaf
* Layered structure using Controller, Service and Repository components
* JPA/Hibernate integration
* H2 database configuration
* Validation and form support prepared for future enhancements


## Frontend Features

* Responsive Bootstrap UI
* Thymeleaf template rendering
* Dynamic table rendering
* Clean dashboard layout
* Form-based user interaction

  ## Testing with JUnit

The project includes basic Spring Boot integration testing using JUnit 5.

The test validates that the application context starts correctly and that the initial demo data is loaded into the H2 database.

Example test coverage:

* Spring Boot application context loading
* Repository layer validation
* H2 in-memory database initialization
* Demo data verification from `data.sql`

Run tests locally:

```bash
mvn test
```

---

## Docker Support

This project includes a `Dockerfile` for containerizing the Spring Boot application.

Dockerfile overview:

```dockerfile
FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
```

Build the application first:

```bash
mvn clean package
```

Build Docker image:

```bash
docker build -t student-dashboard-demo .
```

Run Docker container:

```bash
docker run -p 8080:8080 student-dashboard-demo
```

Open in browser:

```text
http://localhost:8080
```

---

## GitLab CI/CD Pipeline

This project includes a basic GitLab CI/CD pipeline using `.gitlab-ci.yml`.

The pipeline automatically runs when code is pushed to GitLab.

Pipeline stages:

* `build` – compiles the project using Maven
* `test` – runs JUnit tests using Maven

Example pipeline configuration:

```yaml
stages:
  - build
  - test

build-job:
  stage: build
  image: maven:3.9-eclipse-temurin-17
  script:
    - mvn clean compile

test-job:
  stage: test
  image: maven:3.9-eclipse-temurin-17
  script:
    - mvn test
```

The latest GitLab pipeline successfully passed both build and test stages.

---

## DevOps / Automation Highlights

This project demonstrates basic modern backend development workflow experience:

* GitHub repository for source code hosting
* GitLab repository for CI/CD demonstration
* GitLab Runner executing automated build and test jobs
* Maven-based build automation
* Dockerfile for containerized deployment
* JUnit test execution in local and CI environments


---

# Project Structure

```text
src/main/java
 ├── controller
 ├── service
 ├── repository
 ├── model/entity
 └── StudentDashboardApplication

src/main/resources
 ├── templates
 ├── static
 └── application.properties
```

---

# Database Configuration

This project uses an H2 in-memory database for simplicity and fast local development.

## Advantages of H2

* Lightweight
* Easy setup
* Fast startup
* Suitable for demos and testing

Example configuration:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

---

# JPA / Hibernate Usage

The application uses Spring Data JPA with Hibernate ORM.

Key concepts demonstrated:

* Entity mapping
* Repository abstraction
* CRUD persistence
* ORM-based database interaction
* Automatic query generation

Example entity:

```java
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
}
```

---

# Thymeleaf Integration

Thymeleaf is used as the server-side template engine.

Benefits:

* Tight integration with Spring Boot
* Dynamic HTML rendering
* Simple form binding
* Easy MVC integration
* Suitable for enterprise CRUD applications

Example:

```html
<tr th:each="student : ${students}">
    <td th:text="${student.name}"></td>
</tr>
```

---

# Request Flow Example

Example request flow for loading dashboard data:

```text
Browser Request
   ↓
Controller handles HTTP request
   ↓
Service layer processes business logic
   ↓
Repository fetches data using JPA
   ↓
Database queried
   ↓
Controller returns Thymeleaf view
```

````

---

# Running the Application

## Prerequisites

- Java 17+
- Maven

## Steps

### Clone Repository

```bash
git clone https://github.com/srihrao214/student-dashboard-demo.git
````

### Navigate to Project

```bash
cd student-dashboard-demo
```

### Build Project

```bash
mvn clean install
```

### Run Application

```bash
mvn spring-boot:run
```

### Open in Browser

```text
http://localhost:8080
```

---

# Possible Future Enhancements

Potential future enhancements:

* Add student creation functionality
* Update and delete operations
* JWT authentication and authorization
* PostgreSQL/MySQL integration
* REST API endpoints
* Pagination and filtering
* Kubernetes deployment
* Logging and monitoring
* Role-based access control

---

# Learning Outcomes

This project helped strengthen practical experience in:

* Java backend development
* Spring Boot architecture
* MVC design pattern
* ORM and relational databases
* Thymeleaf frontend integration
* Enterprise application structure
* CRUD application development

---

# Use Case

This project is intended for:

* Learning Spring Boot development
* Demonstrating Java backend skills
* Understanding MVC architecture
* Practicing JPA/Hibernate
* Portfolio/GitHub showcase
* Interview discussions and technical demonstrations

---

# Author

Sriram Rao

GitHub:
[https://github.com/srihrao214](https://github.com/srihrao214)
