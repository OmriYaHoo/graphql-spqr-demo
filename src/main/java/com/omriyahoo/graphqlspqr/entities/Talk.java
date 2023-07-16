package com.omriyahoo.graphqlspqr.entities;

import io.leangen.graphql.annotations.GraphQLQuery;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Table(name = "talks")
public class Talk extends Base {

    @OneToOne
    @GraphQLQuery(name = "speaker", description = "The Talk's Speaker")
    private Speaker speaker;

    @GraphQLQuery(name = "subject", description = "The Talk's Subject")
    private String subject;

    @ManyToMany
    @JoinTable(
            name = "ATTENDEES_TALKS ",
            joinColumns = @JoinColumn(name = "talk_id"),
            inverseJoinColumns = @JoinColumn(name = "attendee_id"))
    @GraphQLQuery(name = "attendees", description = "The Talk's Attendees")
    private List<Attendee> attendees;
}
