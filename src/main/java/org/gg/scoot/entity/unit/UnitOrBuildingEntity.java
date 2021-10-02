package org.gg.scoot.entity.unit;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.*;
import org.gg.scoot.entity.HelpTextEntity;
import org.gg.scoot.entity.tech.TechEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "unit")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@With
public class UnitOrBuildingEntity extends PanacheEntityBase {
    @Id
    private Long id;

    private Integer age;

    @Column(name = "internal_name")
    private String internalName;

    @Column(name = "unit_type")
    private Integer unitType;

    @OneToOne
    @JoinColumn(name = "name", referencedColumnName = "id")
    private HelpTextEntity name;

    @OneToOne
    @JoinColumn(name = "help_text_short", referencedColumnName = "id")
    private HelpTextEntity helpTextShort;

    @OneToOne
    @JoinColumn(name = "help_text", referencedColumnName = "id")
    private HelpTextEntity helpText;

    @Column(name = "wood_cost")
    private Integer woodCost;
    @Column(name = "food_cost")
    private Integer foodCost;
    @Column(name = "gold_cost")
    private Integer goldCost;
    @Column(name = "stone_cost")
    private Integer stoneCost;
    @Column(name = "attack")
    private Integer attack;
    @Column(name = "melee_armor")
    private Integer meleeArmor;
    @Column(name = "pierce_armor")
    private Integer pierceArmor;
    @Column(name = "hit_points")
    private Integer hitPoints;
    @Column(name = "line_of_sight")
    private Integer lineOfSight;
    @Column(name = "garrison_capacity")
    private Integer garrisonCapacity;

    @OneToMany
    @JoinTable(name = "tech_required_unit",
            joinColumns = {@JoinColumn(name = "required_unit", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "tech", referencedColumnName = "id")})
    private List<TechEntity> techs;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "civ_unit", joinColumns = @JoinColumn(name = "unit_id"))
    @Column(name = "civ_id")
    private List<Long> enabledForCivilizations;
}
