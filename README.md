# graphql-code-first

##### Instructions:

The project can run with memory embedded DB called H2 or postgres.

###### Run with terminal:
- To run with H2 run the application with spring profile: `mvnw spring-boot:run -Drun.profiles=h2`
- To run with containerized postgres run the application with spring profile: `mvnw spring-boot:run -Drun.profiles=local`

###### Run with IDE:
Enter the profile name (h2 or local) in your IDE run configurations


***
Once the application is up and running you can visit your GraphiQL UI [here](localhost:9001/graphiql)

Note: The default port for this application is **9001**