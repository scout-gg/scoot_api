package org.gg.scoot.mapper.tech;

import org.gg.scoot.dto.Language;
import org.gg.scoot.dto.tech.TechDto;
import org.gg.scoot.entity.tech.ChildTechEntity;
import org.gg.scoot.mapper.HelpTextMapper;
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
    TechDto toTechDtoFr(ChildTechEntity techEntity, @Context Language language);

    List<TechDto> toTechDtoFr(List<ChildTechEntity> techEntity, @Context Language language);
}
