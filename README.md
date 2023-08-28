# Spring Actuator Admin with JWT Header Filter

![Spring Actuator Admin](https://img.shields.io/badge/Spring%20Actuator%20Admin-Enabled-brightgreen)
![JWT Header Filter](https://img.shields.io/badge/JWT%20Header%20Filter-Enabled-blue)

This repository contains an implementation of Spring Actuator Admin with a request filter to add a JWT header. Spring Actuator Admin is a tool that provides insights into Spring Boot applications through custom endpoints. The JWT request filter allows you to add a JWT token as a header to every request, which can be useful for authentication and authorization purposes in your microservices.

## Prerequisites

- Java JDK 17 or higher
- Spring Boot 3.x
- Maven

## How to use

1. Clone this repository to your local environment:

    `git clone https://github.com/matheuslara01/actuator-admin-spring.git`

2. Customize JWT settings in file:

    `HttpConfig.Java`

3. Run the application using Maven:

    `./mvnw spring-boot:run`

4. Access the Spring Actuator Admin dashboard in your browser:

    `http://localhost:8081`

5. Requests made to the application's endpoints will automatically have the JWT header added according to the provided settings.

## License

This project is licensed under the [MIT License](LICENSE).
