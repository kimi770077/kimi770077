package com.startup.controller.api;

import com.startup.controller.app.PersonController;
import com.startup.model.entity.Person;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/person")
public class PersonApi {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAll(){
        return PersonController.findAll();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Person save(@FormParam("firstname") String name, @FormParam("lastname") String family,@FormParam("national-code")String nationalCode){
        return PersonController.save(name,family,nationalCode);
    }


    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public Response test(){
        return Response.ok(PersonController.findAll()).build();
    }

}
