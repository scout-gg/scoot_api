package org.gg.scoot.entity.unit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.gg.scoot.entity.tech.TechEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "unit")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UnitOrBuildingEntity extends UnitOrBuildingBaseEntity {
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
