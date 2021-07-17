package org.gg.scoot.mapper;

import org.gg.scoot.dto.Language;
import org.gg.scoot.dto.tech.TechDto;
import org.gg.scoot.entity.tech.TechEntity;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(uses = {UnitBuildingMapper.class, HelpTextMapper.class, ChildTechMapper.class}, componentModel = "cdi")
public interface TechMapper {
    @Mapping(source = "woodCost", target = "cost.woodCost")
    @Mapping(source = "foodCost", target = "cost.foodCost")
    @Mapping(source = "goldCost", target = "cost.goldCost")
    @Mapping(source = "stoneCost", target = "cost.stoneCost")
    @Mapping(source = "techs", target = "techs")
    TechDto toTechDtoFr(TechEntity techEntity, @Context Language language);

    List<TechDto> toTechDtoFr(List<TechEntity> techEntity, @Context Language language);
}
