package org.gg.scoot.mapper;

import org.gg.scoot.dto.Age;
import org.gg.scoot.dto.Language;
import org.gg.scoot.dto.techtree.TechTreeTechDto;
import org.gg.scoot.entity.TechTreeTech;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "cdi",
        uses = {TechMapper.class, HelpTextMapper.class},
        imports = Age.class
)
public interface TechTreeTechMapper {
    @Mapping(target = "age", expression = "java( Age.from( tech.age) )")
    TechTreeTechDto toDto(TechTreeTech tech, @Context Language language);
}
