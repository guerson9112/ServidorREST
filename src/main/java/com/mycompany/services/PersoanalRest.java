/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.services;

import com.mycompany.datos.Personal;
import com.mycompany.session.PersonalFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Personal")
public class PersoanalRest {
    
    @EJB
    private PersonalFacade personalFacade;
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Personal>findAll(){
        return personalFacade.findAll();
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Personal findById(@PathParam("id") Integer id){
        return personalFacade.find(id);
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void create (Personal personal){
        personalFacade.create(personal);
    }
    
    
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("{id}")
    
    public void edit (@PathParam("id") Integer id, Personal personal){
        personalFacade.edit(personal);
    }

    
    
}
