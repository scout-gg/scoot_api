package org.gg.scoot.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.List;

@Entity(name = "unit")
public class UnitEntity extends PanacheEntityBase {
    @Id
    public Long id;

    public Integer age;

    @Column(name = "internal_name")
    public String internalName;

    @Column(name = "unit_type")
    public Integer unitType;

    @OneToOne
    @JoinColumn(name = "name", referencedColumnName = "id")
    public HelpText name;

    @OneToOne
    @JoinColumn(name = "help_text_short", referencedColumnName = "id")
    public HelpText helpTextShort;

    @OneToOne
    @JoinColumn(name = "help_text", referencedColumnName = "id")
    public HelpText helpText;

    @Column(name = "wood_cost")
    public Integer woodCost;
    @Column(name = "food_cost")
    public Integer foodCost;
    @Column(name = "gold_cost")
    public Integer goldCost;
    @Column(name = "stone_cost")
    public Integer stoneCost;
    @Column(name = "attack")
    public Integer attack;
    @Column(name = "melee_armor")
    public Integer meleeArmor;
    @Column(name = "pierce_armor")
    public Integer pierceArmor;
    @Column(name = "hit_points")
    public Integer hitPoints;
    @Column(name = "line_of_sight")
    public Integer lineOfSight;
    @Column(name = "garrison_capacity")
    public Integer garrisonCapacity;

    @OneToMany
    @JoinTable(name = "tech_required_unit",
            joinColumns = {@JoinColumn(name = "required_unit", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "tech", referencedColumnName = "id")})
    public List<TechEntity> techs;

    @OneToMany
    @JoinTable(name = "unit_required_unit",
            joinColumns = {@JoinColumn(name = "required_unit", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "unit", referencedColumnName = "id")})
    public List<UnitEntity> units;
}
