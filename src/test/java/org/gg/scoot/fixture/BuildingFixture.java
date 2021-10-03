package org.gg.scoot.fixture;

import org.gg.scoot.entity.unit.BuildingEntity;

import java.util.List;

public class BuildingFixture {

    public static final List<Long> CIVILIZATIONS_ID = List.of(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 10L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L, 33L, 34L, 35L, 36L, 37L);
    public static final long ARCHERY_RANGE_ID = 87L;

    public static BuildingEntity archeryRange() {
        var innerBuilding = new BuildingEntity();
        innerBuilding.setId(99L);

        var archeryRange = new BuildingEntity();
        archeryRange.setId(ARCHERY_RANGE_ID);
        archeryRange.setAge(0);
        archeryRange.setInternalName("ARRG");
        archeryRange.setName(HelpTextFixture.archeryRangeName());
        archeryRange.setHelpText(HelpTextFixture.archeryRangeHelpText());
        archeryRange.setHelpTextShort(HelpTextFixture.archeryRangeHelpTextShort());
        archeryRange.setWoodCost(175);
        archeryRange.setFoodCost(0);
        archeryRange.setStoneCost(0);
        archeryRange.setGoldCost(0);
        archeryRange.setMeleeArmor(1);
        archeryRange.setPierceArmor(0);
        archeryRange.setAttack(0);
        archeryRange.setHitPoints(1500);
        archeryRange.setLineOfSight(6);
        archeryRange.setGarrisonCapacity(10);
        archeryRange.setUnitType(80);
        archeryRange.setBuildings(List.of(innerBuilding));
        archeryRange.setEnabledForCivilizations(CIVILIZATIONS_ID);
        archeryRange.setUnits(List.of(UnitFixture.archer()));
        archeryRange.setTechs(List.of(TechFixture.thumbRing()));

        return archeryRange;
    }

}
