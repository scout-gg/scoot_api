package org.gg.scoot.mapper.civilization;

import org.gg.scoot.dto.LanguageDto;
import org.gg.scoot.dto.civilization.CivilizationDto;
import org.gg.scoot.entity.civilization.CivilizationEntity;
import org.gg.scoot.mapper.helptext.HelpTextMapper;
import org.mapstruct.Context;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(uses = {HelpTextMapper.class}, componentModel = "cdi")
public interface CivilizationMapper {
    CivilizationDto toDto(CivilizationEntity civilizationEntity, @Context LanguageDto languageDto);
    List<CivilizationDto> toDto(List<CivilizationEntity> civilizationEntities, @Context LanguageDto languageDto);
}
