package org.gg.scoot.resource;

import org.gg.scoot.entity.Civilization;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/civilizations")
public class CivilizationResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Civilization> list() {
        return Civilization.listAll();
    }
}
