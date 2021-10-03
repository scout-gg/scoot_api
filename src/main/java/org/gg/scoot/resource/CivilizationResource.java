package org.gg.scoot.resource;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.gg.scoot.dto.common.LanguageDto;
import org.gg.scoot.dto.civilization.CivilizationDto;
import org.gg.scoot.entity.civilization.CivilizationEntity;
import org.gg.scoot.mapper.civilization.CivilizationMapper;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("/civilizations")
public class CivilizationResource {
    @Inject
    CivilizationMapper mapper;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
            summary = "List all available civilizations",
            description = "Return all civilizations")
    public List<CivilizationDto> all(@QueryParam("lang") Optional<LanguageDto> lang) {
        return mapper.toDto(CivilizationEntity.listAll(), lang.orElse(LanguageDto.EN));
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
            summary = "Get a civilization by id",
            description = "Return a civilization given its identifier")
    public CivilizationDto byId(@PathParam Long id, @QueryParam("lang") Optional<LanguageDto> lang) {
        CivilizationEntity civilization = CivilizationEntity.findById(id);
        return mapper.toDto(civilization, lang.orElse(LanguageDto.EN));
    }
}
