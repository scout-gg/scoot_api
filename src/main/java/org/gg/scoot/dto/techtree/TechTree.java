package org.gg.scoot.dto.techtree;

import java.util.List;

public record TechTree(List<TechTreeBuildingDto> buildings, List<TechTreeTechDto> techs, List<TechTreeUnitDto> units) { }
