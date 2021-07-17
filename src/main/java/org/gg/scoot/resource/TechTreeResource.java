package org.gg.scoot.resource;

import org.gg.scoot.dto.Language;
import org.gg.scoot.dto.civ.CivBuildingDto;
import org.gg.scoot.dto.civ.TechTreeDto;
import org.gg.scoot.entity.unit.BuildingEntity;
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
    UnitBuildingMapper mapper;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TechTreeDto all(@PathParam Long id, @QueryParam("lang") String lang) {
        Language language = Language.valueOf(lang.toUpperCase());

        // Fixme : this should be an HQL named query but it doesn't seems to work here
        // Let's stay in touch with the quarkus ppl
        List<BuildingEntity> buildingEntities = BuildingEntity.<BuildingEntity>find("is_root", true).stream().toList();

        final List<CivBuildingDto> civBuildingDtos = mapper.toCivtDto(buildingEntities, id, language);
        return new TechTreeDto(1L, "Britons", civBuildingDtos);
    }
}
