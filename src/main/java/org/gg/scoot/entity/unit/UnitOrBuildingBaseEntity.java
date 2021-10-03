package org.gg.scoot.entity.unit;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.gg.scoot.entity.helptext.HelpTextEntity;

import javax.persistence.*;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UnitOrBuildingBaseEntity extends PanacheEntityBase {
    @Id
    protected Long id;

    protected Integer age;

    @Column(name = "internal_name")
    protected String internalName;

    @Column(name = "unit_type")
    protected Integer unitType;

    @OneToOne
    @JoinColumn(name = "name", referencedColumnName = "id")
    protected HelpTextEntity name;

    @OneToOne
    @JoinColumn(name = "help_text_short", referencedColumnName = "id")
    protected HelpTextEntity helpTextShort;

    @OneToOne
    @JoinColumn(name = "help_text", referencedColumnName = "id")
    protected HelpTextEntity helpText;

    @Column(name = "wood_cost")
    protected Integer woodCost;
    @Column(name = "food_cost")
    protected Integer foodCost;
    @Column(name = "gold_cost")
    protected Integer goldCost;
    @Column(name = "stone_cost")
    protected Integer stoneCost;
    @Column(name = "attack")
    protected Integer attack;
    @Column(name = "melee_armor")
    protected Integer meleeArmor;
    @Column(name = "pierce_armor")
    protected Integer pierceArmor;
    @Column(name = "hit_points")
    protected Integer hitPoints;
    @Column(name = "line_of_sight")
    protected Integer lineOfSight;
    @Column(name = "garrison_capacity")
    protected Integer garrisonCapacity;
}
