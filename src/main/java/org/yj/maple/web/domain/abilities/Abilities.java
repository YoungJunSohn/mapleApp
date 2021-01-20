package org.yj.maple.web.domain.abilities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.yj.maple.web.domain.BaseTimeEntity;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Abilities extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rank;

    private String ability;

    private String amount;

    private Long strength;

    private Long dexterity;

    private Long intelligence;

    private Long luck;
}
