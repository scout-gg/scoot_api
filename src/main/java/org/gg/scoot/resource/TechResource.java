package org.gg.scoot.resource;

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

@Path("/techs")
public class TechResource {

    @Inject
    TechMapper mapper;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TechDto> all(@QueryParam("lang") String lang) {
        LanguageDto languageDto = LanguageDto.valueOf(lang.toUpperCase());
        return mapper.toDto(TechEntity.listAll(), languageDto);

    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TechDto byId(@PathParam Long id, @QueryParam("lang") String lang) {
        LanguageDto languageDto = LanguageDto.valueOf(lang.toUpperCase());
        TechEntity techEntity = TechEntity.findById(id);
        return mapper.toDto(techEntity, languageDto);

    }
}
