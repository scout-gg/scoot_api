package org.gg.scoot.karate;

import com.intuit.karate.junit5.Karate;

public class KarateRunner {
    @Karate.Test
    Karate unitTestRunner() {
        return Karate.run("unit").relativeTo(getClass());
    }

    @Karate.Test
    Karate buildingTestRunner() {
        return Karate.run("building").relativeTo(getClass());
    }

}
