# Spring-Boot REST API Template

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
        <a href="#built-with">Built With</a>
    </li>
    <li>
        <a href="#topics-covered-in-this-template">Topics covered in this template</a>
    <li>
        <a href="#getting-started">Getting Started</a>
    </li>
    <li>
        <a href="#roadmap">Roadmap</a>
    </li>

  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About The Project

This is a template for a REST API using Spring Boot. It was created to be used as a base for future projects.

## Built With

* [Spring Boot 3.0.2](https://start.spring.io) and [Java 17](https://www.java.com/download/)
* [Maven 3.8.6](https://maven.apache.org/download.cgi)

## Topics covered in this template

* REST API
* Domain-Driven Design
* Tests with JUnit Jupiter, MockMvc and Mockito
* Databases with H2 embedded database
* Custom Exception Handling
* Swagger UI API

<!-- GETTING STARTED -->
## Getting Started

1. . Clone the repo

   ```sh
   Fork or clone the repo: https://github.com/hoaflee/lnp-chatgpt.git
   ```

2. Run using Maven or your IDE

   ```bash
   mvn spring-boot:run
   ```

3. In order to run the tests

   ```bash
   mvn test
   ```

4. Some relevant lines from the application.properties

   ```properties
    # localhost:8080/
    port=8080


    # localhost:8080/swagger-ui/index.html

    springdoc.swagger-ui.path=/swagger-ui.html
    springdoc.api-docs.path=/v3/api-docs
    sprindoc.swagger-ui.config-url=/v3/api-docs/swagger-config
    springdoc.swagger-ui.url=/v3/api-docs


    # H2 Database name - in memory database
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.h2.console.enabled=true

    # localhost:8080/h2-console
    spring.h2.console.path=/h2-console

    spring.datasource.driverClassName=org.h2.Driver

    # authentication to access the database console
    spring.datasource.username=sa
    spring.datasource.password=
   ```

5. An API documentation can be accessed through [localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html) once the program is running

<!-- ROADMAP -->
## Roadmap

* [x] Create a basic REST API
* [x] Add a database support
* [x] Add a Swagger UI API documentation
* [x] Add tests for the controllers, services and repositories
* [ ] Add a security layer
* [ ] Add remote database support
* [ ] Add a Dockerfile for the application
* [ ] And more...?

[//]: # (CONTRIBUTING)

