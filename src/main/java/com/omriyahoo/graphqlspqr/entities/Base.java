package com.omriyahoo.graphqlspqr.entities;


import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@MappedSuperclass
public abstract class Base {

    @Id
    @GraphQLQuery(name = "id", description = "Entity ID")
    private Long id;

    @Column
    @CreatedDate
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @GraphQLQuery(name = "createdDate", description = "Entity Creation Date")
    private Date createdDate;

    @Column
    @LastModifiedDate
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @GraphQLQuery(name = "lastModifiedDate", description = "Entity Last Modification Date")
    private Date lastModifiedDate;

    @PrePersist
    protected void onCreate() {
        createdDate = new Date(System.currentTimeMillis());
        lastModifiedDate = new Date(System.currentTimeMillis());
    }

    @PreUpdate
    protected void onUpdate() {
        lastModifiedDate = new Date(System.currentTimeMillis());
    }
}
