package org.gg.scoot.dto.common;

public enum LanguageDto {
    EN,
    FR,
    BR,
    DE,
    ES,
    HI,
    IT,
    JP,
    KO,
    MS,
    MX,
    RU,
    TR,
    TW,
    VI,
    ZH;

    // This is used by quarkus to convert request params from strings
    public static LanguageDto fromString(String value) {
        return LanguageDto.valueOf(value.toUpperCase());
    }

}
