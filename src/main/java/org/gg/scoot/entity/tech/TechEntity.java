package org.gg.scoot.entity.tech;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.With;
import org.gg.scoot.entity.HelpTextEntity;
import org.gg.scoot.entity.unit.UnitOrBuildingEntity;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "technology")
@AllArgsConstructor
@NoArgsConstructor
@With
public class TechEntity extends PanacheEntityBase {
    @Id
    public Long id;
    @OneToOne
    @JoinColumn(name = "name", referencedColumnName = "id")
    public HelpTextEntity name;
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
    @Where(clause = "NOT is_root")
    @JoinTable(name = "tech_required_tech",
            joinColumns = {@JoinColumn(name = "required_tech", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "tech", referencedColumnName = "id")})
    public List<TechEntity> techs;

    @OneToOne
    @JoinTable(name = "unit_required_tech",
            joinColumns = {@JoinColumn(name = "required_tech", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "unit", referencedColumnName = "id")}
    )
    public UnitOrBuildingEntity unlockUnit;
}
