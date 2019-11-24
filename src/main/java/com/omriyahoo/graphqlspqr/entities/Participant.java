package com.omriyahoo.graphqlspqr.entities;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Table(name = "participants")
public class Participant extends Base {

    @ManyToMany
    @JoinTable(
            name = "PARTICIPANTS_TALKS ",
            joinColumns = @JoinColumn(name = "participant_id"),
            inverseJoinColumns = @JoinColumn(name = "talk_id"))
    @GraphQLQuery(name = "talks", description = "Talks this participant is participating")
    private List<Talk> talks;

    @Column
    @GraphQLQuery(name = "name", description = "Participant Name")
    private String name;
}
