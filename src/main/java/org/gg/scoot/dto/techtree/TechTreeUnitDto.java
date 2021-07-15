package org.gg.scoot.dto.techtree;

import org.gg.scoot.dto.Age;
import org.gg.scoot.dto.unit.UnitDto;

public class TechTreeUnitDto {
    public UnitDto unit;
    public Age age;
    public Long requiredTech;
    public Long upperBuilding;
    public Long parentUnit;
    public Long enablingResearch;
}
