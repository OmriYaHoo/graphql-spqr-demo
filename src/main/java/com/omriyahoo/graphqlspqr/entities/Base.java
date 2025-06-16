package com.omriyahoo.graphqlspqr.entities;


import io.leangen.graphql.annotations.GraphQLQuery;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@MappedSuperclass
public abstract class Base {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GraphQLQuery(name = "id", description = "Entity ID")
    private Long id;

    @CreatedDate
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @GraphQLQuery(name = "createdDate", description = "Entity Creation Date")
    private ZonedDateTime createdDate;

    @LastModifiedDate
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @GraphQLQuery(name = "lastModifiedDate", description = "Entity Last Modification Date")
    private ZonedDateTime lastModifiedDate;

    @PrePersist
    protected void onCreate() {
        createdDate = ZonedDateTime.now();
        lastModifiedDate = ZonedDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        lastModifiedDate = ZonedDateTime.now();
    }
}
