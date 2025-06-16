package com.omriyahoo.graphqlspqr.controllers;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.SchemaPrinter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GraphQLSchemaController {

    private final GraphQL graphQL;

    public GraphQLSchemaController(GraphQL graphQL) {
        this.graphQL = graphQL;
    }

    @GetMapping(value = "/schema", produces = "application/graphql-response+json")
    public Mono<String> getSchema() {
        GraphQLSchema schema = graphQL.getGraphQLSchema();
        return Mono.just(new SchemaPrinter().print(schema));
    }
}