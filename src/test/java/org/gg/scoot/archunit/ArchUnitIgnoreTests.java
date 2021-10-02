package org.gg.scoot.archunit;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.core.importer.Location;

public class ArchUnitIgnoreTests implements ImportOption {
    @Override
    public boolean includes(Location location) {
        final boolean excludeTests = !location.contains("/test/") && !location.contains("/target/test-classes/");
        final boolean excludeGeneratedMapper = !location.contains("MapperImpl.class");
        final boolean excludeMapperWithDuplicateGeneratedClass = !location.contains("HelpTextMapper");
        return excludeTests && excludeGeneratedMapper && excludeMapperWithDuplicateGeneratedClass;
    }
}
