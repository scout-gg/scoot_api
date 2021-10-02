package org.gg.scoot.mapper.helptext;

import org.gg.scoot.dto.LanguageDto;
import org.gg.scoot.entity.HelpTextEntity;
import org.mapstruct.Context;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface HelpTextMapper {
    default String map(HelpTextEntity helpText, @Context LanguageDto languageDto) {
        if (helpText == null) {
            return null;
        }

        return switch (languageDto) {
            case FR -> helpText.contentFr;
            case EN -> helpText.contentEn;
            case ES -> helpText.contentEs;
        };
    }
}