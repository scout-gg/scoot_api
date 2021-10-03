package org.gg.scoot.mapper.tech;

import org.gg.scoot.dto.common.LanguageDto;
import org.gg.scoot.dto.tech.TechDto;
import org.gg.scoot.entity.tech.ChildTechEntity;
import org.gg.scoot.mapper.helptext.HelpTextMapper;
import org.gg.scoot.mapper.unit.UnitBuildingMapper;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(uses = {UnitBuildingMapper.class, HelpTextMapper.class}, componentModel = "cdi")
public interface ChildTechMapper {

    @Mapping(source = "woodCost", target = "cost.woodCost")
    @Mapping(source = "foodCost", target = "cost.foodCost")
    @Mapping(source = "goldCost", target = "cost.goldCost")
    @Mapping(source = "stoneCost", target = "cost.stoneCost")
    @Mapping(source = "techs", target = "techs")
    TechDto toDto(ChildTechEntity techEntity, @Context LanguageDto languageDto);

    List<TechDto> toDto(List<ChildTechEntity> techEntity, @Context LanguageDto languageDto);
}
