package br.com.lucas.primeiraaula;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("ping")
public class Ping {
    @GET
    public String pong(){
        return "pong";
    }

    @GET
    @Path("/maismais")
    public String pongMaisMais(){
        return "pong++";
    }

    @POST
    public String pongSupremo(String poderEspecial){
        return "pong Super Sayajin - " + poderEspecial;
    }
}
