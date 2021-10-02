package org.gg.scoot.dto.techtree;

import org.gg.scoot.dto.CostDto;
import org.gg.scoot.dto.tech.TechDto;
import org.gg.scoot.dto.unit.UnitDto;
import org.gg.scoot.dto.unit.UnitStatDto;

import java.util.List;

public record CivUnitDto(Long id,
                         CostDto costDto,
                         UnitStatDto stats,
                         String name,
                         String helpTextShort,
                         String helpText,
                         List<TechDto> techs,
                         List<UnitDto> units,
                         boolean enabled) {
}
