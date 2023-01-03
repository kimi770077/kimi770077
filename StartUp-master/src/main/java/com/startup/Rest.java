package com.startup;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/rest")
public class Rest {
    @GET
    public String test(){
        return "Test Done";
    }
}
