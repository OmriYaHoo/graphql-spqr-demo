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
@Table(name = "attendees")
public class Attendee extends Base {

    @ManyToMany
    @JoinTable(
            name = "ATTENDEES_TALKS ",
            joinColumns = @JoinColumn(name = "attendee_id"),
            inverseJoinColumns = @JoinColumn(name = "talk_id"))
    @GraphQLQuery(name = "talks", description = "Talks this attendee is participating")
    private List<Talk> talks;

    @Column
    @GraphQLQuery(name = "name", description = "Attendee Name")
    private String name;
}
