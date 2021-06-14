package org.gg.scoot.dto.techtree;

import org.gg.scoot.dto.Age;
import org.gg.scoot.dto.tech.TechDto;


import java.util.List;

public class TechTreeTechDto {
    public Age age;
    public TechDto tech;
    public List<TechTreeTechDto> enablingTech;
}
