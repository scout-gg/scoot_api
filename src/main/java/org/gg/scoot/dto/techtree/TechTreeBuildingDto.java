package org.gg.scoot.dto.techtree;

import org.gg.scoot.dto.Age;
import org.gg.scoot.dto.unit.UnitBuildingDto;


import java.util.List;

public class TechTreeBuildingDto {
    public Age age;
    public UnitBuildingDto building;
    public Integer requiredBuildingId;
    public Integer enablingResearchId;
    public Integer requiredTechId;
    public List<Long> techs;
    public List<Long> units;
}
