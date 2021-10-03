package org.gg.scoot.entity.unit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
public class BuildingEntity extends UnitOrBuildingBaseEntity {
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
