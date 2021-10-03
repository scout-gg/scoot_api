package org.gg.scoot.mapper.unit;

import org.gg.scoot.dto.common.LanguageDto;
import org.gg.scoot.dto.techtree.CivBuildingDto;
import org.gg.scoot.dto.unit.BuildingDto;
import org.gg.scoot.dto.unit.UnitDto;
import org.gg.scoot.entity.unit.BuildingEntity;
import org.gg.scoot.entity.unit.UnitEntity;
import org.gg.scoot.entity.unit.UnitOrBuildingEntity;
import org.gg.scoot.mapper.helptext.HelpTextMapper;
import org.gg.scoot.mapper.tech.TechMapper;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

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
    BuildingDto toDto(BuildingEntity buildingEntity, @Context LanguageDto languageDto);

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
    UnitDto toDto(UnitEntity unitEntity, @Context LanguageDto languageDto);

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
    UnitDto toDto(UnitOrBuildingEntity unitEntity, @Context LanguageDto languageDto);

    List<UnitDto> toUnitDto(List<UnitEntity> unitEntity, @Context LanguageDto languageDto);

    List<BuildingDto> toDto(List<BuildingEntity> unitEntity, @Context LanguageDto languageDto);

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
    CivBuildingDto toCivtDto(BuildingEntity buildingEntity, @Context Long civId, @Context LanguageDto languageDto);

    List<CivBuildingDto> toCivtDto(List<BuildingEntity> buildingEntity, @Context Long civId, @Context LanguageDto languageDto);

    @Named("isBuildingEnabled")
    default boolean isBuildingEnabled(List<Long> enabledForCivilizations, @Context Long civId, @Context LanguageDto languageDto) {
        return enabledForCivilizations.contains(civId);
    }
}
