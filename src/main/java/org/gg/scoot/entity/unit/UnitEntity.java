package org.gg.scoot.entity.unit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.gg.scoot.entity.tech.TechEntity;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "unit")
@Where(clause = "unit_type = 70")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UnitEntity extends UnitOrBuildingBaseEntity {
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