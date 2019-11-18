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
@Table(name = "speakers")
public class Speaker extends Base {

    @Column
    private String name;

    @OneToMany
    private List<Talk> talk;

}
