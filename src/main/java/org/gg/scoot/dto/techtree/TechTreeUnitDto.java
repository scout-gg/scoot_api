package org.gg.scoot.dto.techtree;

import org.gg.scoot.dto.Age;
import org.gg.scoot.dto.unit.UnitBuildingDto;

public class TechTreeUnitDto {
    public UnitBuildingDto unit;
    public Age age;
    public Long requiredTech;
    public Long upperBuilding;
    public Long parentUnit;
    public Long enablingResearch;
}
