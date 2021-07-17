package org.gg.scoot.resource;

import org.gg.scoot.dto.Language;
import org.gg.scoot.dto.unit.UnitDto;
import org.gg.scoot.entity.unit.UnitEntity;
import org.gg.scoot.mapper.unit.UnitBuildingMapper;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/units")
public class UnitResource {
    @Inject
    UnitBuildingMapper mapper;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public UnitDto byId(@PathParam Long id, @QueryParam("lang") String lang) {
        Language language = Language.valueOf(lang.toUpperCase());
        UnitEntity unitEntity = UnitEntity.findById(id);
        return mapper.toDto(unitEntity, language);
    }

}
