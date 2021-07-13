package org.gg.scoot.dto.tech;

import org.gg.scoot.dto.Cost;
import org.gg.scoot.dto.unit.UnitBuildingDto;

import java.util.List;


public class TechDto {
    public Long id;
    public String name;
    public Integer researchTime;
    public Cost cost;
    public List<TechDto> techs;
    public UnitBuildingDto unlockUnit;
}
