package com.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.File;

@Path("/person")
public class PersonController {
    //post işlemi için postman ' e yazılacak adres
    //  http://localhost:9090/jersey_post_war_exploded/rest/person/addperson?name=muharrem&surname=kursun
    @POST
    @Path("/addperson")
    @Produces(MediaType.APPLICATION_JSON)//giden datanın türü
    @Consumes(MediaType.APPLICATION_JSON)//gelen datanın türü
    public String addPerson(@BeanParam Person person)
    {

        return person.toString();
    }
    //Get işlemi için chrome 'a yazılacak adres
    //  http://localhost:9090/jersey_post_war_exploded/rest/person/getperson?name=muharrem&surname=kursun
    @GET
    @Path("/getperson")
    @Produces(MediaType.APPLICATION_JSON)//giden datanın türü
    public String addPerson2(@BeanParam Person person)
    {

        System.out.println(person.toString());
        return person.toString();
    }



}
