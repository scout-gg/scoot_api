package org.gg.scoot.entity.tech;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.Getter;
import lombok.Setter;
import org.gg.scoot.entity.HelpTextEntity;
import org.gg.scoot.entity.unit.BuildingEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "technology")
@Getter
@Setter
public class ChildTechEntity extends PanacheEntityBase {
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

    @OneToMany
    @JoinTable(name = "tech_required_tech",
            joinColumns = {@JoinColumn(name = "required_tech", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "tech", referencedColumnName = "id")})
    private List<ChildTechEntity> techs;

    @OneToOne
    @JoinTable(name = "unit_required_tech",
            joinColumns = {@JoinColumn(name = "required_tech", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "unit", referencedColumnName = "id")}
    )
    private BuildingEntity unlockUnit;
}
