package org.gg.scoot.dto.techtree;

import org.gg.scoot.dto.common.CostDto;
import org.gg.scoot.dto.unit.UnitStatDto;

import java.util.List;

public record CivBuildingDto(Long id,
                             CostDto cost,
                             UnitStatDto stats,
                             String name,
                             String helpTextShort,
                             String helpText,
                             List<CivTechDto> techs,
                             List<CivUnitDto> units,
                             List<CivBuildingDto> buildings,
                             Boolean enabled) {
}
