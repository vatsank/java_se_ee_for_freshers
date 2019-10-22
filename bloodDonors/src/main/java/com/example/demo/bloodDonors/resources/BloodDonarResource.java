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

import com.training.daos.BloodDonorDaoImpl;
import com.training.entity.BloodDonor;
import javax.ws.rs.core.GenericEntity;


import java.sql.SQLException;
import java.util.*;


	
@Path("donors")
public class BloodDonarResource {

	
	private BloodDonorDaoImpl dao;
	
	    public BloodDonarResource() {
		super();
	
		dao = new BloodDonorDaoImpl();
		System.out.println("Resource Initilized");
	}

		@GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response getIt() {
	    	
	    	List<BloodDonor> list=null;
			try {
				list = dao.findAll();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
	    	
			 GenericEntity< List< BloodDonor > > entity= 	new GenericEntity< List< BloodDonor> >( list ) { };
	    	
	        return Response.status(200).entity(entity).build();
	        
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
			
		
	    	List<BloodDonor> list=null;

	
	    
	    	try {
				list = dao.findByGroup(group);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
	    	
			 GenericEntity< List< BloodDonor > > entity= 	new GenericEntity< List< BloodDonor> >( list ) { };
	    	
	        return Response.status(200).entity(entity).build();
	        
	    	
		}
		
		
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		@POST
	public Response addDonor(BloodDonor donor) {

			try {
				this.dao.add(donor);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return Response.status(201).entity(donor).build();
		}
		
		
		@Path("/frm")
		@POST
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
				public Response addDonor(@FormParam("mobileNumber") long mobileNumber,
				 @FormParam("donorName") String donorName,
				 @FormParam("bloodGroup") String bloodGroup) {
			
			BloodDonor donor = new BloodDonor(mobileNumber, donorName, bloodGroup);
			
			     try {
					int rowAdded = dao.add(donor);
					if(rowAdded!=1) {
						donor =null;
					}
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			     
			return Response.status(201).entity(donor).build();
		}
		
}
