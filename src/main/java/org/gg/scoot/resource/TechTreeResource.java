package org.gg.scoot.resource;

import org.eclipse.microprofile.openapi.annotations.Operation;
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
import java.util.Optional;

@Path("/techtree")
public class TechTreeResource {

    @Inject
    UnitBuildingMapper unitBuildingMapper;

    @Inject
    CivilizationMapper civilizationMapper;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
            summary = "Given a civilization id return its techtree",
            description = "Return a civilization techtree, avalaible technologies, units and buildings will have the enabled field set to `true`.")
    public TechTreeDto all(@PathParam Long id, @QueryParam("lang") Optional<LanguageDto> lang) {
        List<BuildingEntity> buildingEntities = BuildingEntity.<BuildingEntity>find("is_root", true).stream().toList();
        CivilizationEntity civilizationEntity = CivilizationEntity.findById(id);

        var language = lang.orElse(LanguageDto.EN);
        var civilization = civilizationMapper.toDto(civilizationEntity, language);
        var civBuildingDtos = unitBuildingMapper.toCivtDto(buildingEntities, id, language);

        return new TechTreeDto(id, civilization.name(), civBuildingDtos);
    }
}
