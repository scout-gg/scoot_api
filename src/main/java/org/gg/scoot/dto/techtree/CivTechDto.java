package org.gg.scoot.dto.techtree;

import org.gg.scoot.dto.common.CostDto;
import org.gg.scoot.dto.tech.TechDto;
import org.gg.scoot.dto.unit.UnitDto;

import java.util.List;

public record CivTechDto(Long id,
                         String name,
                         Integer researchTime,
                         CostDto costDto,
                         List<TechDto> techs,
                         UnitDto unlockUnit) {
}
