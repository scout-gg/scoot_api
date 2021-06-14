package org.gg.scoot.dto.unit;

import org.gg.scoot.dto.Cost;
import org.gg.scoot.dto.tech.TechDto;

import java.util.List;

public class UnitBuildingDto {
    public Long id;
    public Cost cost;
    public UnitStat stats;
    public String name;
    public String helpTextShort;
    public String helpText;
    public List<TechDto> techs;
    public List<UnitBuildingDto> units;
}
