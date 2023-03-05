
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import json.RequestBodyStart;

@ApplicationPath("/")
public class Endpoints extends Application {

    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @PUT
    @Path("/start")
    public Response start(RequestBodyStart body) {
        return Response.status(Status.ACCEPTED).build();
    }
}