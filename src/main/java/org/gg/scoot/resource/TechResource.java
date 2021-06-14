package org.gg.scoot.resource;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import org.gg.scoot.dto.Language;
import org.gg.scoot.dto.tech.TechDto;
import org.gg.scoot.entity.TechEntity;
import org.gg.scoot.mapper.TechMapper;
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
        Language language = Language.valueOf(lang.toUpperCase());
        final List<TechEntity> entities = TechEntity.listAll();
        return mapper.toTechDtoFr(entities, language);

    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TechDto byId(@PathParam Long id, @QueryParam("lang") String lang) {
        Language language = Language.valueOf(lang.toUpperCase());
        TechEntity techEntity = TechEntity.findById(id);
        return mapper.toTechDtoFr(techEntity, language);

    }
}
