package org.gg.scoot.archunit;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import javax.persistence.Entity;
import javax.persistence.Table;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "org.gg.scoot", importOptions = ArchUnitIgnoreTests.class)
public class ArchitectureTest {
    @ArchTest
    public static final ArchRule dto_should_be_records_or_enum = classes().that()
            .resideInAPackage("..dto..")
            .should()
            .beRecords()
            .orShould()
            .beEnums()
            .andShould()
            .haveNameMatching(".*Dto");

    @ArchTest
    public static final ArchRule resource_should_have_Resource_suffix = classes().that()
            .resideInAPackage("..resource..")
            .should()
            .haveNameMatching(".*Resource");

    @ArchTest
    public static final ArchRule entity_should_have_Entity_suffix = classes().that()
            .resideInAPackage("..entity..")
            .should()
            .haveNameMatching(".*Entity");

    @ArchTest
    public static final ArchRule mapper_should_have_Mapper_suffix = classes().that()
            .resideInAPackage("..mapper..")
            .should()
            .haveNameMatching(".*Mapper")
            .andShould()
            .beInterfaces();

    @ArchTest
    public static final ArchRule dto_should_only_be_accessed_by_resources_or_mappers = classes().that()
            .resideInAPackage("..dto..")
            .should()
            .onlyBeAccessed()
            .byAnyPackage("..resource..", "..mapper..", "..dto..");

    @ArchTest
    public static final ArchRule entity_should_not_access_any_package = classes().that()
            .resideInAPackage("..entity..")
            .should()
            .beAnnotatedWith(Entity.class)
            .orShould()
            .beAnnotatedWith(Table.class)
            .andShould()
            .onlyAccessClassesThat()
            .resideOutsideOfPackages("..dto..", "..mapper..", "..resource..");
}


