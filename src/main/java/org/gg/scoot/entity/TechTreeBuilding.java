package org.gg.scoot.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;


import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.List;

@Entity(name = "tech_tree_building")
public class TechTreeBuilding extends PanacheEntity {

    public Integer age;

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    public Unit building;

    @Column(name = "required_building")
    public Long requiredBuildingId;

    @Column(name = "enabling_research")
    public Long enablingResearchId;

    @Column(name = "required_tech")
    public Long requiredTechId;

    @ElementCollection
    @CollectionTable(name = "tech_tree_tech", joinColumns = @JoinColumn(name = "upper_building"))
    @Column(name = "id")
    public List<Long> techs;

    @ElementCollection
    @CollectionTable(name = "tech_tree_unit", joinColumns = @JoinColumn(name = "upper_building"))
    @Column(name = "id")
    public List<Long> units;
}
