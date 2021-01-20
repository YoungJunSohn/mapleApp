package org.yj.maple.web.domain.hyperstats;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.yj.maple.web.domain.BaseTimeEntity;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class HyperStats extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long strPoint;

    private Long dexPoint;

    private Long lukPoint;

    private Long criticalChancePoint;

    private Long criticalDamagePoint;

    private Long defenseIgnoreRatePoint;

    private Long bossDamagePoint;

    private Long defaultDamagePoint;

    private Long atkPoint;


}
