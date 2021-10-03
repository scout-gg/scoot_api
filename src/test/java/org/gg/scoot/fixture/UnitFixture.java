package org.gg.scoot.fixture;

import org.gg.scoot.entity.unit.BuildingEntity;
import org.gg.scoot.entity.unit.UnitEntity;
import org.gg.scoot.entity.unit.UnitOrBuildingBaseEntity;

import java.util.List;

import static org.gg.scoot.fixture.BuildingFixture.CIVILIZATIONS_ID;

public class UnitFixture {

    public static final long ARCHER_ID = 4L;

    public static UnitEntity archer() {
        var archer = new UnitEntity();
        archer.setId(ARCHER_ID);
        archer.setAge(2);
        archer.setInternalName("ARCHR");
        archer.setName(HelpTextFixture.archerName());
        archer.setHelpText(HelpTextFixture.archerHelpText());
        archer.setHelpTextShort(HelpTextFixture.archerHelpTextShort());
        archer.setWoodCost(25);
        archer.setFoodCost(0);
        archer.setStoneCost(0);
        archer.setGoldCost(45);
        archer.setMeleeArmor(0);
        archer.setPierceArmor(0);
        archer.setAttack(4);
        archer.setHitPoints(30);
        archer.setLineOfSight(6);
        archer.setGarrisonCapacity(0);
        archer.setUnitType(70);
        archer.setEnabledForCivilizations(CIVILIZATIONS_ID);
        archer.setTechs(List.of());

        return archer;
    }
}
