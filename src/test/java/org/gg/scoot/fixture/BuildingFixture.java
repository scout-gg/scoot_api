package org.gg.scoot.fixture;

import org.gg.scoot.entity.unit.BuildingEntity;

import java.util.List;

public class BuildingFixture {

    public static final List<Long> CIVILIZATIONS_ID = List.of(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 10L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L, 33L, 34L, 35L, 36L, 37L);
    public static final long ARCHERY_RANGE_ID = 87L;

    public static BuildingEntity archeryRange() {
        return new BuildingEntity()
                .withId(ARCHERY_RANGE_ID)
                .withAge(0)
                .withInternalName("ARRG")
                .withName(HelpTextFixture.archeryRangeName())
                .withHelpText(HelpTextFixture.archeryRangeHelpText())
                .withHelpTextShort(HelpTextFixture.archeryRangeHelpTextShort())
                .withWoodCost(175)
                .withFoodCost(0)
                .withStoneCost(0)
                .withGoldCost(0)
                .withAttack(0)
                .withMeleeArmor(1)
                .withPierceArmor(0)
                .withHitPoints(1500)
                .withLineOfSight(6)
                .withGarrisonCapacity(10)
                .withEnabledForCivilizations(CIVILIZATIONS_ID)
                .withUnitType(80)
                .withUnits(List.of(UnitFixture.archer()))
                .withTechs(List.of(TechFixture.thumbRing()))
                // We are doing this for the sake of testing, this does not reflect the actual database
                .withBuildings(List.of(new BuildingEntity().withId(99L)));
    }
}
