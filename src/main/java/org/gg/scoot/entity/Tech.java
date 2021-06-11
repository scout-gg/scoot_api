package org.gg.scoot.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "technology")
public class Tech extends PanacheEntityBase {
    @Id
    public Long id;
    @OneToOne
    @JoinColumn(name = "name", referencedColumnName = "id")
    public HelpText name;
    @Column(name = "internal_name")
    public String internalName;
    @Column(name = "building_id")
    public Integer buildingId;
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
}
