package org.gg.scoot.fixture;

import org.gg.scoot.entity.civilization.CivilizationEntity;

public class CivilizationFixture {
    public static CivilizationEntity britons() {
        return new CivilizationEntity()
                .withId(1L)
                .withName(HelpTextFixture.britons());
    }
}
