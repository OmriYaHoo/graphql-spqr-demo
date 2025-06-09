# graphql-spqr-demo

This project is a demo Spring Boot application that showcases how to build a GraphQL API using [GraphQL SPQR](https://github.com/leangen/graphql-spqr) and [graphql-spqr-spring-boot-starter](https://github.com/leangen/graphql-spqr-spring-boot-starter). It integrates with PostgreSQL using Spring Data JPA and supports both traditional and reactive web endpoints.

## Features

- Exposes a GraphQL API using SPQR annotations.
- Uses Spring Boot for rapid development and configuration.
- Integrates with PostgreSQL via Spring Data JPA.
- Supports both WebMVC and WebFlux (reactive) endpoints.
- Includes actuator endpoints for monitoring.
- Testcontainers support for integration testing.
- Hot reload with Spring Boot DevTools.

## Technologies Used

- Java 24
- Spring Boot 3.4.6
- GraphQL SPQR & graphql-spqr-spring-boot-starter
- PostgreSQL
- Spring Data JPA & JDBC
- Spring Web & WebFlux
- Testcontainers
- Lombok

## Prerequisites

- Java 24+
- Maven 3.8.6+ (or use the included Maven Wrapper)
- PostgreSQL database (local or Docker)

## Getting Started

### 1. Clone the repository

```sh
git clone https://github.com/OmriYaHoo/graphql-spqr-demo.git
cd graphql-spqr-demo
```

### 2. Configure the Database

Update your `src/main/resources/application.properties` (or `application.yml`) with your PostgreSQL connection details:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/your_db
spring.datasource.username=your_user
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

Alternatively, you can use Docker to run a PostgreSQL instance:

```sh
docker run --name postgres -e POSTGRES_PASSWORD=your_password -e POSTGRES_DB=your_db -p 5432:5432 -d postgres:15
```

### 3. Build the Project

Using Maven Wrapper (recommended):

```sh
./mvnw clean install
```

Or with your local Maven:

```sh
mvn clean install
```

### 4. Run the Application

```sh
./mvnw spring-boot:run
```

Or run the generated jar:

```sh
java -jar target/graphql-spqr-0.0.1-SNAPSHOT.jar
```

### 5. Access the GraphQL API

- GraphQL endpoint: `http://localhost:8080/graphql`
- You can use [GraphiQL](https://github.com/graphql/graphiql) or [Postman](https://www.postman.com/) to interact with the API.

### 6. Actuator Endpoints

- Health check: `http://localhost:8080/actuator/health`
- Metrics: `http://localhost:8080/actuator/metrics`

## Running Tests

```sh
./mvnw test
```
