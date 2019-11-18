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

    @OneToMany
    private List<Participant> participants;
}
