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
@Table(name = "talks")
public class Talk extends Base {

    @OneToOne
    @GraphQLQuery(name = "speaker", description = "The Talk's Speaker")
    private Speaker speaker;

    @Column
    @GraphQLQuery(name = "subject", description = "The Talk's Subject")
    private String subject;

    @ManyToMany
    @JoinTable(
            name = "PARTICIPANTS_TALKS ",
            joinColumns = @JoinColumn(name = "talk_id"),
            inverseJoinColumns = @JoinColumn(name = "participant_id"))
    @GraphQLQuery(name = "participants", description = "The Talk's Participants")
    private List<Participant> participants;
}
