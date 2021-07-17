package org.gg.scoot.dto.civ;

import org.gg.scoot.dto.Cost;
import org.gg.scoot.dto.tech.TechDto;
import org.gg.scoot.dto.unit.UnitDto;
import org.gg.scoot.dto.unit.UnitStat;

import java.util.List;

public class CivUnitDto {
    public Long id;
    public Cost cost;
    public UnitStat stats;
    public String name;
    public String helpTextShort;
    public String helpText;
    public List<TechDto> techs;
    public List<UnitDto> units;
    public boolean enabled;
}
