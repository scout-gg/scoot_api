package org.gg.scoot.entity.tech;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.*;
import org.gg.scoot.entity.helptext.HelpTextEntity;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@MappedSuperclass
public class TechBaseEntity extends PanacheEntityBase {
    @Id
    private Long id;
    @OneToOne
    @JoinColumn(name = "name", referencedColumnName = "id")
    private HelpTextEntity name;
    private Integer age;
    @Column(name = "internal_name")
    private String internalName;
    @Column(name = "research_time")
    private Integer researchTime;
    @Column(name = "wood_cost")
    private Integer woodCost;
    @Column(name = "food_cost")
    private Integer foodCost;
    @Column(name = "gold_cost")
    private Integer goldCost;
    @Column(name = "stone_cost")
    private Integer stoneCost;
}
