package org.gg.scoot.resource;

import org.gg.scoot.dto.LanguageDto;
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

@Path("/buildings")
public class BuildingResource {
    @Inject
    UnitBuildingMapper mapper;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<BuildingDto> all(@QueryParam("lang") String lang) {
        LanguageDto languageDto = LanguageDto.valueOf(lang.toUpperCase());
        return mapper.toDto(BuildingEntity.listAll(), languageDto);

    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public BuildingDto byId(@PathParam Long id, @QueryParam("lang") String lang) {
        LanguageDto languageDto = LanguageDto.valueOf(lang.toUpperCase());
        BuildingEntity buildingEntity = BuildingEntity.findById(id);
        return mapper.toDto(buildingEntity, languageDto);
    }
}
