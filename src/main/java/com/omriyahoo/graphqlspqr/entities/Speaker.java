package com.omriyahoo.graphqlspqr.entities;

import io.leangen.graphql.annotations.GraphQLQuery;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Table(name = "speakers")
public class Speaker extends Base {

    @GraphQLQuery(name = "name", description = "Speaker Name")
    private String name;

}
