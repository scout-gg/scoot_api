package org.gg.scoot.entity.unit;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.*;
import org.gg.scoot.entity.HelpTextEntity;
import org.gg.scoot.entity.tech.TechEntity;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

@Table(name = "unit")
@Where(clause = "unit_type = 80")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@With
public class BuildingEntity extends PanacheEntityBase {
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
    @Where(clause = "is_root")
    @JoinTable(name = "tech_required_unit",
            joinColumns = {@JoinColumn(name = "required_unit", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "tech", referencedColumnName = "id")})
    private List<TechEntity> techs;

    @OneToMany
    @Where(clause = "is_root AND  belongs_to_civ IS NULL")
    @JoinTable(name = "unit_required_unit",
            joinColumns = {@JoinColumn(name = "required_unit", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "unit", referencedColumnName = "id")})
    private List<UnitEntity> units;

    @OneToMany
    @Where(clause = "belongs_to_civ IS NULL")
    @JoinTable(name = "unit_required_unit",
            joinColumns = {@JoinColumn(name = "required_unit", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "unit", referencedColumnName = "id")})
    private List<BuildingEntity> buildings;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "civ_unit", joinColumns = @JoinColumn(name = "unit_id"))
    @Column(name = "civ_id")
    private List<Long> enabledForCivilizations;
}
