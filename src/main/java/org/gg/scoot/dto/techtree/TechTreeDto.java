package org.gg.scoot.dto.techtree;

import java.util.List;

public record TechTreeDto(Long id, String name, List<CivBuildingDto> buildings) {
}