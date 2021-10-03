package org.gg.scoot.entity.tech;

import lombok.Getter;
import lombok.Setter;
import org.gg.scoot.entity.unit.BuildingEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "technology")
@Getter
@Setter
public class ChildTechEntity extends TechBaseEntity {
    @OneToMany
    @JoinTable(name = "tech_required_tech",
            joinColumns = {@JoinColumn(name = "required_tech", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "tech", referencedColumnName = "id")})
    private List<ChildTechEntity> techs;

    @OneToOne
    @JoinTable(name = "unit_required_tech",
            joinColumns = {@JoinColumn(name = "required_tech", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "unit", referencedColumnName = "id")}
    )
    private BuildingEntity unlockUnit;
}
