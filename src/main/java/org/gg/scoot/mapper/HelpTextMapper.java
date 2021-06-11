package org.gg.scoot.mapper;

import org.gg.scoot.dto.Language;
import org.gg.scoot.entity.HelpText;
import org.mapstruct.Context;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi", uses = HelpTextMapper.class)
public abstract class HelpTextMapper {
    public String map(HelpText helpText, @Context Language language) {
        if (helpText == null) {
            return null;
        }

        return switch (language) {
            case FR -> helpText.contentFr;
            case EN -> helpText.contentEn;
            case ES -> helpText.contentEn;
        };
    }
}
