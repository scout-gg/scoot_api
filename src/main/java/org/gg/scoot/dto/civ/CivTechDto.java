package org.gg.scoot.dto.civ;

import org.gg.scoot.dto.Cost;
import org.gg.scoot.dto.tech.TechDto;
import org.gg.scoot.dto.unit.UnitDto;

import java.util.List;

public class CivTechDto {
    public Long id;
    public String name;
    public Integer researchTime;
    public Cost cost;
    public List<TechDto> techs;
    public UnitDto unlockUnit;
}
