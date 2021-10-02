package org.gg.scoot.mapper.techtree;

import org.gg.scoot.mapper.helptext.HelpTextMapper;
import org.mapstruct.Mapper;

@Mapper(uses = {HelpTextMapper.class}, componentModel = "cdi")
public interface CivBuildingMapper {
}
