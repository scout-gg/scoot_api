package org.gg.scoot.mapper.unit;

import io.quarkus.test.junit.QuarkusTest;
import org.assertj.core.api.SoftAssertions;
import org.gg.scoot.dto.common.LanguageDto;
import org.gg.scoot.dto.tech.TechDto;
import org.gg.scoot.dto.unit.UnitDto;
import org.gg.scoot.fixture.BuildingFixture;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.gg.scoot.fixture.BuildingFixture.ARCHERY_RANGE_ID;
import static org.gg.scoot.fixture.TechFixture.THUMB_RING_ID;
import static org.gg.scoot.fixture.UnitFixture.ARCHER_ID;

@QuarkusTest
class UnitBuildingMapperTest {

    @Inject
    UnitBuildingMapper mapper;

    @Test
    void should_map_BuildingEntity_to_english_BuildingDto() {
        // Arrange
        var archeryRange = BuildingFixture.archeryRange();

        // Act
        var buildingDto = mapper.toDto(archeryRange, LanguageDto.EN);

        // Assert
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(buildingDto.id()).isEqualTo(ARCHERY_RANGE_ID);
        softly.assertThat(buildingDto.name()).isEqualTo("Archery Range");
        softly.assertThat(buildingDto.helpTextShort()).isEqualTo("Build Archery Range");
        softly.assertThat(buildingDto.helpText()).isEqualTo("Build <b>Archery Range<b> (<cost>) \\nUsed to train and upgrade archer units. <i> Upgrades: production speed (Castle); line of sight (Town Center); hit points, armor (University); more resistant to Monks (Monastery).<i>  \\n<hp> <attack> <armor> <piercearmor> <range> <garrison>");
        softly.assertThat(buildingDto.cost().foodCost()).isEqualTo(0);
        softly.assertThat(buildingDto.cost().woodCost()).isEqualTo(175);
        softly.assertThat(buildingDto.cost().stoneCost()).isEqualTo(0);
        softly.assertThat(buildingDto.cost().goldCost()).isEqualTo(0);
        softly.assertThat(buildingDto.enabledForCivilizations()).isEqualTo(BuildingFixture.CIVILIZATIONS_ID);
        softly.assertThat(buildingDto.buildings()).isNotEmpty();
        softly.assertThat(buildingDto.techs()).extracting(TechDto::id).containsOnly(THUMB_RING_ID);
        softly.assertThat(buildingDto.units()).extracting(UnitDto::id).containsOnly(ARCHER_ID);
        softly.assertThat(buildingDto.stats().attack()).isEqualTo(0);
        softly.assertThat(buildingDto.stats().garrisonCapacity()).isEqualTo(10);
        softly.assertThat(buildingDto.stats().hitPoints()).isEqualTo(1500);
        softly.assertThat(buildingDto.stats().lineOfSight()).isEqualTo(6);
        softly.assertThat(buildingDto.stats().meleeArmor()).isEqualTo(1);
        softly.assertThat(buildingDto.stats().pierceArmor()).isEqualTo(0);
        softly.assertAll();
    }
}