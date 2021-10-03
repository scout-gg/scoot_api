package org.gg.scoot.dto.tech;

import org.gg.scoot.dto.common.CostDto;
import org.gg.scoot.dto.unit.UnitDto;

import java.util.List;


public record TechDto(Long id,
                      String name,
                      Integer researchTime,
                      CostDto cost,
                      List<TechDto> techs,
                      UnitDto unlockUnit) {
}
