package org.gg.scoot.mapper;

import org.gg.scoot.dto.Language;
import org.gg.scoot.dto.tech.TechDto;
import org.gg.scoot.entity.Tech;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {UnitBuildingMapper.class, HelpTextMapper.class}, componentModel = "cdi")
public interface TechMapper {
    @Mapping(source = "name.contentFr", target = "name")
    @Mapping(source = "woodCost", target = "cost.woodCost")
    @Mapping(source = "foodCost", target = "cost.foodCost")
    @Mapping(source = "goldCost", target = "cost.goldCost")
    @Mapping(source = "stoneCost", target = "cost.stoneCost")
    TechDto toTechDtoFr(Tech tech, @Context Language language);
}
