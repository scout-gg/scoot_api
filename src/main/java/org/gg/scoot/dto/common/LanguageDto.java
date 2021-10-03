package org.gg.scoot.dto.common;

public enum LanguageDto {
    FR,
    EN,
    ES;

    public static LanguageDto from(String value) {
        if (value == null) {
            return LanguageDto.EN;
        } else {
            return LanguageDto.valueOf(value.toUpperCase());
        }
    }
}
