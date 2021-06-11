package org.gg.scoot.resource;

import org.gg.scoot.dto.Language;
import org.gg.scoot.dto.tech.TechDto;
import org.gg.scoot.entity.Tech;
import org.gg.scoot.mapper.TechMapper;
import org.jboss.resteasy.annotations.jaxrs.PathParam;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/techs")
public class TechResource {

    @Inject
    TechMapper mapper;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TechDto byId(@PathParam Long id, @QueryParam("lang") String lang) {
        Language language = Language.valueOf(lang.toUpperCase());
        Tech tech = Tech.findById(id);
        return mapper.toTechDtoFr(tech, language);

    }
}
