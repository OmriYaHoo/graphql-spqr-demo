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
@Table(name = "participants")
public class Participant extends Base {

    @ManyToOne
    private Talk talk;

    @Column
    private String name;
}
