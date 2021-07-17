package org.gg.scoot.fixture;

import org.gg.scoot.entity.unit.UnitEntity;

import java.util.List;

public class UnitFixture {

    public static final long ARCHER_ID = 4L;

    public static UnitEntity archer() {
        return new UnitEntity()
                .withId(ARCHER_ID)
                .withAge(2)
                .withUnitType(70)
                .withInternalName("ARCHR")
                .withName(HelpTextFixture.archerName())
                .withHelpText(HelpTextFixture.archerHelpText())
                .withHelpTextShort(HelpTextFixture.archerHelpTextShort())
                .withWoodCost(25)
                .withFoodCost(0)
                .withStoneCost(0)
                .withGoldCost(45)
                .withAttack(4)
                .withMeleeArmor(0)
                .withPierceArmor(0)
                .withHitPoints(30)
                .withLineOfSight(6)
                .withGarrisonCapacity(0)
                .withTechs(List.of())
                .withEnabledForCivilizations(BuildingFixture.CIVILIZATIONS_ID);
    }
}
