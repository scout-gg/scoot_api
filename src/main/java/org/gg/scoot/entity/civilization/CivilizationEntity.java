package org.gg.scoot.entity.civilization;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.With;
import org.gg.scoot.entity.HelpTextEntity;

import javax.persistence.*;

@Entity
@Table(name = "civilization")
@With
@AllArgsConstructor
@NoArgsConstructor
public class CivilizationEntity extends PanacheEntityBase {
    @Id
    public Long id;

    @OneToOne
    @JoinColumn(name = "name", referencedColumnName = "id")
    public HelpTextEntity name;
}
