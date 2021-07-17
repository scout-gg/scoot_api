package org.gg.scoot.mapper.unit;

import org.gg.scoot.dto.Language;
import org.gg.scoot.dto.civ.CivBuildingDto;
import org.gg.scoot.dto.unit.BuildingDto;
import org.gg.scoot.dto.unit.UnitDto;
import org.gg.scoot.entity.unit.BuildingEntity;
import org.gg.scoot.entity.unit.UnitEntity;
import org.gg.scoot.entity.unit.UnitOrBuildingEntity;
import org.gg.scoot.mapper.HelpTextMapper;
import org.gg.scoot.mapper.tech.TechMapper;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "cdi", uses = {HelpTextMapper.class, TechMapper.class})
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
    BuildingDto toDto(BuildingEntity buildingEntity, @Context Language language);

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
    UnitDto toDto(UnitEntity unitEntity, @Context Language language);

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
    UnitDto toDto(UnitOrBuildingEntity unitEntity, @Context Language language);

    List<UnitDto> toUnitDto(List<UnitEntity> unitEntity, @Context Language language);

    List<BuildingDto> toDto(List<BuildingEntity> unitEntity, @Context Language language);

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
    @Mapping(source = "enabledForCivilizations", target = "enabled", qualifiedByName = "isBuildingEnabled")
    CivBuildingDto toCivtDto(BuildingEntity buildingEntity, @Context Long civId, @Context Language language);

    List<CivBuildingDto> toCivtDto(List<BuildingEntity> buildingEntity, @Context Long civId, @Context Language language);

    @Named("isBuildingEnabled")
    default boolean isBuildingEnabled(List<Long> enabledForCivilizations, @Context Long civId, @Context Language language) {
        return enabledForCivilizations.contains(civId);
    }
}
