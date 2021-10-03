package org.gg.scoot.resource;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.gg.scoot.dto.common.LanguageDto;
import org.gg.scoot.dto.tech.TechDto;
import org.gg.scoot.entity.tech.TechEntity;
import org.gg.scoot.mapper.tech.TechMapper;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("/techs")
public class TechResource {

    @Inject
    TechMapper mapper;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
            summary = "List all technologies available technologies",
            description = "Return all technologies")
    public List<TechDto> all(@QueryParam("lang") Optional<LanguageDto> lang) {
        return mapper.toDto(TechEntity.listAll(), lang.orElse(LanguageDto.EN));

    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
            summary = "Get a technology by id",
            description = "Return a technology given its identifier")
    public TechDto byId(@PathParam Long id, @QueryParam("lang") Optional<LanguageDto> lang) {
        TechEntity techEntity = TechEntity.findById(id);
        return mapper.toDto(techEntity, lang.orElse(LanguageDto.EN));

    }
}
