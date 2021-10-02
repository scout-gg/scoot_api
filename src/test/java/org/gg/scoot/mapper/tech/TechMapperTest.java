package org.gg.scoot.mapper.tech;

import io.quarkus.test.junit.QuarkusTest;
import org.assertj.core.api.SoftAssertions;
import org.gg.scoot.dto.LanguageDto;
import org.gg.scoot.dto.tech.TechDto;
import org.gg.scoot.entity.tech.TechEntity;
import org.gg.scoot.fixture.TechFixture;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.gg.scoot.fixture.TechFixture.THUMB_RING_ID;

@QuarkusTest
class TechMapperTest {

    @Inject
    TechMapper mapper;

    @Test
    void should_map_TechEntity_to_english_TechDto() {
        // Arrange
        var thumbRing = TechFixture.thumbRing();

        // Act
        var techDto = mapper.toDto(thumbRing, LanguageDto.EN);

        // Assert
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(techDto.id()).isEqualTo(THUMB_RING_ID);
        softly.assertThat(techDto.name()).isEqualTo("Thumb Ring");
        softly.assertThat(techDto.techs()).isEqualTo(null);
        softly.assertThat(techDto.cost().foodCost()).isEqualTo(300);
        softly.assertThat(techDto.cost().woodCost()).isEqualTo(250);
        softly.assertThat(techDto.cost().stoneCost()).isEqualTo(0);
        softly.assertThat(techDto.cost().goldCost()).isEqualTo(0);
        softly.assertThat(techDto.researchTime()).isEqualTo(45);
        softly.assertThat(techDto.unlockUnit()).isNull();
        softly.assertAll();
    }
}