package org.gg.scoot.resource;

import org.gg.scoot.dto.Language;
import org.gg.scoot.dto.unit.BuildingDto;
import org.gg.scoot.dto.unit.UnitDto;
import org.gg.scoot.entity.BuildingEntity;
import org.gg.scoot.entity.UnitEntity;
import org.gg.scoot.mapper.UnitBuildingMapper;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/buildings")
public class BuildingResource {
    @Inject
    UnitBuildingMapper mapper;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public BuildingDto byId(@PathParam Long id, @QueryParam("lang") String lang) {
        Language language = Language.valueOf(lang.toUpperCase());
        BuildingEntity buildingEntity = BuildingEntity.findById(id);
        return mapper.toDto(buildingEntity, language);
    }
}
