package com.omriyahoo.graphqlspqr.configuration;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

@Configuration
@Profile("local")
public class DatabaseConfiguration {

    @Bean
    @RestartScope
    @ServiceConnection
    @Primary
    public DataSourceProperties dataSourceProperties() {
        PostgreSQLContainer<?> container = new PostgreSQLContainer<>(DockerImageName.parse("postgres:latest"))
                .withDatabaseName("graphql-demo")
                .withUsername("omri")
                .withPassword("omri");

        container.start();

        DataSourceProperties properties = new DataSourceProperties();
        properties.setUrl(container.getJdbcUrl());
        properties.setUsername(container.getUsername());
        properties.setPassword(container.getPassword());

        return properties;
    }
}