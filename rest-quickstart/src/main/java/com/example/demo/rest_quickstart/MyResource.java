package com.example.demo.rest_quickstart;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.json.Json;
import javax.json.JsonObject;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }

    @GET
    @Path("/quick")
	@Produces(MediaType.APPLICATION_JSON)
	public String getMessage(){
		
	     JsonObject map = Json.createObjectBuilder().add("ram",40).build();
		 
				 
		 return map.toString();
		 
		
		 
	
	}
	
    @GET
    @Path("{invNo}")
    @Produces("application/json")
     public Response findInvoice(@PathParam("invNo") int number)  {

    	Invoice  inv = new Invoice(192,"Ganesh",4500.00);
 return Response.status(200).entity(inv).build();
       }
   }
   

