package org.gg.scoot.resource;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.gg.scoot.dto.common.LanguageDto;
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
import java.util.Optional;

@Path("/units")
public class UnitResource {
    @Inject
    UnitBuildingMapper mapper;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
            summary = "Get a unit by id",
            description = "Return a unit given its identifier")
    public UnitDto byId(@PathParam Long id, @QueryParam("lang") Optional<LanguageDto> lang) {
        UnitEntity unitEntity = UnitEntity.findById(id);
        return mapper.toDto(unitEntity, lang.orElse(LanguageDto.EN));
    }

}
