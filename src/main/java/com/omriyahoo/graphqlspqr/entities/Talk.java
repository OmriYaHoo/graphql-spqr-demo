package com.omriyahoo.graphqlspqr.entities;

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
    private Speaker speaker;

    @Column
    private String subject;

    @ManyToMany
    @JoinTable(
            name = "PARTICIPANTS_TALKS ",
            joinColumns = @JoinColumn(name = "talk_id"),
            inverseJoinColumns = @JoinColumn(name = "participant_id"))
    private List<Participant> participants;
}
