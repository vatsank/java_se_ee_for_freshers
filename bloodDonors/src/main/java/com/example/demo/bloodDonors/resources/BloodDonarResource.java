package com.example.demo.bloodDonors.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.training.entity.BloodDonor;
import com.training.utils.DbConnection;


// url pattern can be verb or noun or propernoun	

//	http://localhost:4040/bloodDonors/urlPattern
//		resource name will be noun it SHOULD NEVER BE VERB

//		http://host:port/webapprefix/urpatternl/resourceName   
	
@Path("donors")
public class BloodDonarResource {

	
	    public BloodDonarResource() {
		super();
	
		System.out.println("Resource Initilized");
	}

		@GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response getIt() {
	    	
	    	BloodDonor ramesh = new BloodDonor(949494, "Ramesh", "bpos");
	    	
	    	System.out.println(DbConnection.getOracleConnection());
	    	
	        return Response.status(200).entity(ramesh).build();
	        
	    }
		
		@Path("/xml")
		@GET
	    @Produces(MediaType.APPLICATION_XML)
	    public Response getAsXML() {
	    	
	    	BloodDonor ramesh = new BloodDonor(949494, "Ramesh", "bpos");
	    	
	    	System.out.println("Inside get as xml");
	        return Response.status(200).entity(ramesh).build();
	        
	    }
		
		
		@GET
		@Path("{reqGroup}")
		@Produces(MediaType.APPLICATION_JSON)
		public Response getByGroup(@PathParam("reqGroup") String group) {
			
		
			
	BloodDonor donor = new BloodDonor(949494, "Magesh", "opos");
	
	    if(group.equalsIgnoreCase("apos")) {
	    	donor = new BloodDonor(11444, "Suresh", "apos");
	    }
	
	    	
	        return Response.status(200).entity(donor).build();
		}
		
		
//		@Produces(MediaType.APPLICATION_JSON)
//		@Consumes(MediaType.APPLICATION_JSON)
//		@Post
//		public Response addDonor(BloodDonor donor) {
//			
//			return Response.status(201).entity(donor).build();
//		}
		
		
		
		@POST
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
				public Response addDonor(@FormParam("mobileNumber") long mobileNumber,
				 @FormParam("donorName") String donorName,
				 @FormParam("bloodGroup") String bloodGroup) {
			
			BloodDonor donor = new BloodDonor(mobileNumber, donorName, bloodGroup);
			return Response.status(201).entity(donor).build();
		}
		
}
