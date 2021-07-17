package org.gg.scoot.dto.civ;

import java.util.List;

public class TechTreeDto {
    public Long id;
    public String name;
    public List<CivBuildingDto> buildings;

    public TechTreeDto(Long id, String name, List<CivBuildingDto> buildings) {
        this.id = id;
        this.name = name;
        this.buildings = buildings;
    }
}
