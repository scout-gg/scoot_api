package org.gg.scoot.resource;

import org.gg.scoot.dto.Language;
import org.gg.scoot.dto.techtree.TechTreeBuildingDto;
import org.gg.scoot.entity.TechTreeBuilding;
import org.gg.scoot.mapper.TechTreeBuildingMapper;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("/techtrees")
public class TechTreeResource {

    @Inject
    TechTreeBuildingMapper mapper;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TechTreeBuildingDto> all(@QueryParam("lang") Optional<String> lang) {

        Language language = lang.map(String::toUpperCase)
                                .map(Language::valueOf)
                                .orElse(Language.EN);

        final List<TechTreeBuilding> buildings = TechTreeBuilding.listAll();
        return mapper.toDto(buildings, language);
    }

}


