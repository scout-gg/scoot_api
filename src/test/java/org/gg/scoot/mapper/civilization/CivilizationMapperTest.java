package org.gg.scoot.mapper.civilization;

import io.quarkus.test.junit.QuarkusTest;
import org.assertj.core.api.SoftAssertions;
import org.gg.scoot.dto.LanguageDto;
import org.gg.scoot.fixture.CivilizationFixture;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@QuarkusTest
class CivilizationMapperTest {

    @Inject
    CivilizationMapper mapper;

    @Test
    void should_map_CivilizationEntity_to_english_CivilizationDto() {
        // Arrange
        var britons = CivilizationFixture.britons();

        // Act
        var civilizationDto = mapper.toDto(britons, LanguageDto.EN);

        // Assert
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(civilizationDto.id()).isEqualTo(1L);
        softly.assertThat(civilizationDto.name()).isEqualTo("Britons");
        softly.assertAll();
    }
}