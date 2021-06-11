package org.gg.scoot.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "tech_tree_unit")
public class TechTreeUnit extends PanacheEntity {
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    public Unit id;
    public Integer age;
    @Column(name = "required_tech")
    public Long requiredTech;
    @Column(name = "upper_building")
    public Long upperBuilding;
    @Column(name = "parent_unit")
    public Long parentUnit;
    @Column(name = "enabling_research")
    public Long enablingResearch;
}
