package org.gg.scoot.resource;

import org.gg.scoot.dto.LanguageDto;
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

@Path("/civilizations")
public class CivilizationResource {
    @Inject
    CivilizationMapper mapper;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CivilizationDto> all(@QueryParam("lang") String lang) {
        LanguageDto languageDto = LanguageDto.valueOf(lang.toUpperCase());
        return mapper.toDto(CivilizationEntity.listAll(), languageDto);
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public CivilizationDto byId(@PathParam Long id, @QueryParam("lang") String lang) {
        LanguageDto languageDto = LanguageDto.valueOf(lang.toUpperCase());
        CivilizationEntity civilization = CivilizationEntity.findById(id);
        return mapper.toDto(civilization, languageDto);
    }
}
