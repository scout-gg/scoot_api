package org.gg.scoot.entity.tech;

import lombok.*;
import org.gg.scoot.entity.unit.UnitOrBuildingEntity;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "technology")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TechEntity extends TechBaseEntity {
    @OneToMany
    @Where(clause = "NOT is_root")
    @JoinTable(name = "tech_required_tech",
            joinColumns = {@JoinColumn(name = "required_tech", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "tech", referencedColumnName = "id")})
    private List<TechEntity> techs;

    @OneToOne
    @JoinTable(name = "unit_required_tech",
            joinColumns = {@JoinColumn(name = "required_tech", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "unit", referencedColumnName = "id")}
    )
    private UnitOrBuildingEntity unlockUnit;
}
