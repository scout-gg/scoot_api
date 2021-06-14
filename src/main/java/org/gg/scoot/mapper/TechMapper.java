package org.gg.scoot.mapper;

import org.gg.scoot.dto.Language;
import org.gg.scoot.dto.tech.TechDto;
import org.gg.scoot.entity.TechEntity;
import org.mapstruct.Context;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(uses = {UnitBuildingMapper.class, HelpTextMapper.class}, componentModel = "cdi")
public interface TechMapper {
    @Mapping(source = "name.contentFr", target = "name")
    @Mapping(source = "woodCost", target = "cost.woodCost")
    @Mapping(source = "foodCost", target = "cost.foodCost")
    @Mapping(source = "goldCost", target = "cost.goldCost")
    @Mapping(source = "stoneCost", target = "cost.stoneCost")
    TechDto toTechDtoFr(TechEntity techEntity, @Context Language language);

    @InheritConfiguration
    List<TechDto> toTechDtoFr(List<TechEntity> techEntity, @Context Language language);
}
