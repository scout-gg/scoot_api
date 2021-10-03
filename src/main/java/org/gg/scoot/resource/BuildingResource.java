package org.gg.scoot.resource;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.gg.scoot.dto.common.LanguageDto;
import org.gg.scoot.dto.unit.BuildingDto;
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
import java.util.Optional;

@Path("/buildings")
public class BuildingResource {
    @Inject
    UnitBuildingMapper mapper;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
            summary = "List all available buildings",
            description = "Return all buildings")
    public List<BuildingDto> all(@QueryParam("lang") Optional<LanguageDto> lang) {
        return mapper.toDto(BuildingEntity.listAll(), lang.orElse(LanguageDto.EN));

    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
            summary = "Get a building by id",
            description = "Return a building given its identifier")
    public BuildingDto byId(@PathParam Long id, @QueryParam("lang") Optional<LanguageDto> lang) {
        BuildingEntity buildingEntity = BuildingEntity.findById(id);
        return mapper.toDto(buildingEntity, lang.orElse(LanguageDto.EN));
    }
}
