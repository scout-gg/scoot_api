package org.gg.scoot.dto.techtree;

import org.gg.scoot.dto.Age;
import org.gg.scoot.dto.unit.UnitDto;


import java.util.List;

public class TechTreeBuildingDto {
    public Age age;
    public UnitDto building;
    public Integer requiredBuilding;
    public Integer enablingResearch;
    public Integer requiredTech;
    public List<Long> units;
    public List<TechTreeTechDto> techs;
}
