package org.gg.scoot.entity.unit;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.With;
import org.gg.scoot.entity.HelpTextEntity;
import org.gg.scoot.entity.tech.TechEntity;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "unit")
@Where(clause = "unit_type = 70")
@AllArgsConstructor
@NoArgsConstructor
@With
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
    public HelpTextEntity name;

    @OneToOne
    @JoinColumn(name = "help_text_short", referencedColumnName = "id")
    public HelpTextEntity helpTextShort;

    @OneToOne
    @JoinColumn(name = "help_text", referencedColumnName = "id")
    public HelpTextEntity helpText;

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


    @ElementCollection(fetch=FetchType.EAGER)
    @CollectionTable(name="civ_unit", joinColumns=@JoinColumn(name="unit_id"))
    @Column(name="civ_id")
    public List<Long> enabledForCivilizations;
}