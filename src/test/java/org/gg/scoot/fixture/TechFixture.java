package org.gg.scoot.fixture;

import org.gg.scoot.entity.tech.TechEntity;

public class TechFixture {

    public static final long THUMB_RING_ID = 437L;

    public static TechEntity thumbRing() {
        return new TechEntity()
                .withId(THUMB_RING_ID)
                .withAge(3)
                .withInternalName("Thumb Ring")
                .withName(HelpTextFixture.thumbRing())
                .withResearchTime(45)
                .withWoodCost(250)
                .withFoodCost(300)
                .withStoneCost(0)
                .withGoldCost(0);
    }
}
