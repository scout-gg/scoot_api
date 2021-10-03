package org.gg.scoot.mapper.helptext;

import org.gg.scoot.dto.common.LanguageDto;
import org.gg.scoot.entity.helptext.HelpTextEntity;
import org.mapstruct.Context;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface HelpTextMapper {
    default String map(HelpTextEntity helpText, @Context LanguageDto languageDto) {
        if (helpText == null) {
            return null;
        }

        return switch (languageDto) {
            case FR -> helpText.getContentFr();
            case EN -> helpText.getContentEn();
            case ES -> helpText.getContentEs();
        };
    }
}
