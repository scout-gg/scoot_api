package org.gg.scoot.mapper;

import org.gg.scoot.dto.Language;
import org.gg.scoot.dto.unit.UnitBuildingDto;
import org.gg.scoot.entity.Unit;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi", uses = HelpTextMapper.class)
public interface UnitBuildingMapper {
    @Mapping(source = "woodCost", target = "cost.woodCost")
    @Mapping(source = "foodCost", target = "cost.foodCost")
    @Mapping(source = "goldCost", target = "cost.goldCost")
    @Mapping(source = "stoneCost", target = "cost.stoneCost")
    @Mapping(source = "attack", target = "stats.attack")
    @Mapping(source = "meleeArmor", target = "stats.meleeArmor")
    @Mapping(source = "pierceArmor", target = "stats.pierceArmor")
    @Mapping(source = "hitPoints", target = "stats.hitPoints")
    @Mapping(source = "lineOfSight", target = "stats.lineOfSight")
    @Mapping(source = "garrisonCapacity", target = "stats.garrisonCapacity")
    UnitBuildingDto toDto(Unit unitBuilding, @Context Language language);
}
