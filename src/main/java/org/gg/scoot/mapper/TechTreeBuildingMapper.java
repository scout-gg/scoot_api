package org.gg.scoot.mapper;

import org.gg.scoot.dto.Age;
import org.gg.scoot.dto.Language;
import org.gg.scoot.dto.techtree.TechTreeBuildingDto;
import org.gg.scoot.entity.TechTreeBuilding;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


import java.util.List;

@Mapper(
        componentModel = "cdi",
        uses = {TechMapper.class, HelpTextMapper.class, UnitBuildingMapper.class, TechTreeTechMapper.class},
        imports = Age.class
)
public interface TechTreeBuildingMapper {
    @Mapping(target = "age", expression = "java( Age.from( techTreeBuilding.age) )")
    TechTreeBuildingDto toDto(TechTreeBuilding techTreeBuilding, @Context Language language);

    List<TechTreeBuildingDto> toDto(List<TechTreeBuilding> techTreeBuildings, @Context Language language);
}
