package org.gg.scoot.resource;

import org.gg.scoot.dto.civilization.CivilizationDto;
import org.gg.scoot.dto.common.LanguageDto;
import org.gg.scoot.dto.techtree.TechTreeDto;
import org.gg.scoot.entity.civilization.CivilizationEntity;
import org.gg.scoot.entity.unit.BuildingEntity;
import org.gg.scoot.mapper.civilization.CivilizationMapper;
import org.gg.scoot.mapper.unit.UnitBuildingMapper;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/techtree")
public class TechTreeResource {

    @Inject
    UnitBuildingMapper unitBuildingMapper;

    @Inject
    CivilizationMapper civilizationMapper;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TechTreeDto all(@PathParam Long id, @QueryParam("lang") String lang) {
        LanguageDto languageDto = LanguageDto.from(lang);

        List<BuildingEntity> buildingEntities = BuildingEntity.<BuildingEntity>find("is_root", true).stream().toList();
        final CivilizationEntity civilizationEntity = CivilizationEntity.findById(id);
        CivilizationDto civilization = civilizationMapper.toDto(civilizationEntity, languageDto);


        var civBuildingDtos = unitBuildingMapper.toCivtDto(buildingEntities, id, languageDto);
        return new TechTreeDto(id, civilization.name(), civBuildingDtos);
    }
}
