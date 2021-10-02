package org.gg.scoot.dto.unit;

import org.gg.scoot.dto.CostDto;
import org.gg.scoot.dto.tech.TechDto;

import java.util.List;

public record UnitDto(Long id,
                      CostDto cost,
                      UnitStatDto stats,
                      String name,
                      String helpTextShort,
                      String helpText,
                      List<TechDto> techs,
                      List<UnitDto> units,
                      List<Long> enabledForCivilizations) {
}
