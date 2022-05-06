package org.acme;

import org.acme.service.FraseMotivacionalService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/frase-motivacional")
public class FraseMotivacionalResource {

    FraseMotivacionalService fraceMotivacionalService;

    public FraseMotivacionalResource() {

        fraceMotivacionalService = new FraseMotivacionalService();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getFraceMotivacional() {

        return fraceMotivacionalService.getFraceMotivacional();
    }
}
