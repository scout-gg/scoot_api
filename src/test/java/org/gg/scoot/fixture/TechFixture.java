package org.gg.scoot.fixture;

import org.gg.scoot.entity.tech.TechEntity;

public class TechFixture {

    public static final long THUMB_RING_ID = 437L;

    public static TechEntity thumbRing() {
        var thumbRing = new TechEntity();
        thumbRing.setId(THUMB_RING_ID);
        thumbRing.setAge(3);
        thumbRing.setInternalName("Thumb Ring");
        thumbRing.setName(HelpTextFixture.thumbRing());
        thumbRing.setResearchTime(45);
        thumbRing.setWoodCost(250);
        thumbRing.setFoodCost(300);
        thumbRing.setStoneCost(0);
        thumbRing.setGoldCost(0);

        return thumbRing;
    }

}
