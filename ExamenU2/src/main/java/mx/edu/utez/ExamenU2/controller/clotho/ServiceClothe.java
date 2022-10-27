package mx.edu.utez.ExamenU2.controller.clotho;

import mx.edu.utez.ExamenU2.model.clothes.BeanClothes;
import mx.edu.utez.ExamenU2.model.clothes.DaoClothes;
import mx.edu.utez.ExamenU2.utils.Response;

import javax.jws.WebParam;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
public class ServiceClothe {
    @GET
    @Path("/clothes")
    @Produces(value = {"application/json"})
    public Response<List>getAll(){
        return new DaoClothes().findAll();
    }


    @GET
    @Path("/clothe/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response<BeanClothes>getOne(@PathParam("id") Long id){
        return new DaoClothes().findOne(id);
    }


    @POST
    @Path("/clotheSave")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response<BeanClothes>save(@WebParam BeanClothes employee){
        return new DaoClothes().save(employee);
    }

}
