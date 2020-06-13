package com.api

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam

@Path("/dummy")
interface DummyApi {
    @GET
    @Path("first")
    fun first() : String

    @GET
    @Path("second/{secondValue}")
    fun second(@PathParam("secondValue") secondValue: String) : String
}