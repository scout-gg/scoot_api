package org.gg.scoot.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.List;


@Entity(name = "technology")
public class TechEntity extends PanacheEntityBase {
    @Id
    public Long id;
    @OneToOne
    @JoinColumn(name = "name", referencedColumnName = "id")
    public HelpText name;
    public Integer age;
    @Column(name = "internal_name")
    public String internalName;
    @Column(name = "research_time")
    public Integer researchTime;
    @Column(name = "wood_cost")
    public Integer woodCost;
    @Column(name = "food_cost")
    public Integer foodCost;
    @Column(name = "gold_cost")
    public Integer goldCost;
    @Column(name = "stone_cost")
    public Integer stoneCost;

    @OneToMany
    @JoinTable(name = "tech_required_tech",
            joinColumns = {@JoinColumn(name = "required_tech", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "tech", referencedColumnName = "id")})
    public List<TechEntity> techs;

    @OneToOne
    @JoinTable(name = "unit_required_tech",
            joinColumns = {@JoinColumn(name = "required_tech", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "unit", referencedColumnName = "id")}
    )
    public BuildingEntity unlockUnit;
}
