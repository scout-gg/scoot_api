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
            case BR -> helpText.getContentBr();
            case DE -> helpText.getContentDe();
            case ES -> helpText.getContentEs();
            case HI -> helpText.getContentHi();
            case IT -> helpText.getContentIt();
            case JP -> helpText.getContentJp();
            case KO -> helpText.getContentKo();
            case MS -> helpText.getContentMs();
            case MX -> helpText.getContentMx();
            case RU -> helpText.getContentRu();
            case TR -> helpText.getContentTr();
            case TW -> helpText.getContentTw();
            case VI -> helpText.getContentVi();
            case ZH -> helpText.getContentZh();
        };
    }
}
