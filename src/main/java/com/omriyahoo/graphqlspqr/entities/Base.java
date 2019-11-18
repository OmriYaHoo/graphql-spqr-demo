package com.omriyahoo.graphqlspqr.entities;


import graphql.schema.visibility.GraphqlFieldVisibility;
import io.leangen.graphql.annotations.GraphQLIgnore;
import io.leangen.graphql.annotations.GraphQLInputField;
import io.leangen.graphql.metadata.InputField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@MappedSuperclass
public abstract class Base {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @Column
//    @CreatedDate
//    private Date createdDate;
//
//    @Column
//    @LastModifiedDate
//    private Date lastModifiedDate;
//
//    @PrePersist
//    protected void onCreate() {
//        createdDate = new Date(System.currentTimeMillis());
//        lastModifiedDate = new Date(System.currentTimeMillis());
//    }
//
//    @PreUpdate
//    protected void onUpdate() {
//        lastModifiedDate = new Date(System.currentTimeMillis());
//    }
}
