package io.github.andrebiegel.ping.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.metrics.annotation.Metered;

import io.github.andrebiegel.ping.entity.Ping;

@Path("ping")
public class PingResource {

    @GET
    @Metered
    @Produces(MediaType.APPLICATION_JSON)
    public Ping hello() {
        return new Ping("hello");
    }
}