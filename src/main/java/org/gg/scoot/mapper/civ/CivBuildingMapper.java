package org.gg.scoot.mapper.civ;

import org.gg.scoot.mapper.HelpTextMapper;
import org.mapstruct.Mapper;

@Mapper(uses = {HelpTextMapper.class}, componentModel = "cdi")
public interface CivBuildingMapper {
}
