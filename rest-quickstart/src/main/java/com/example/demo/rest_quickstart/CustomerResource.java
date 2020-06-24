package com.example.demo.rest_quickstart;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.training.daos.CustomerDaoImpl;

import java.sql.SQLException;
import java.util.*;
@Path("customer")

public class CustomerResource {

	private static CustomerDaoImpl dao=new CustomerDaoImpl();
	public CustomerResource() {
		super();
		System.out.println("Constructor Called");
	
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response  getCustomers() {

		
		   List<Customer> custList=null;
		try {
			custList = dao.findAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
      
		
		 return Response.status(200).entity(custList).build();

	} 


	@GET
	@Path("{customerId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response  getCustomerById(@PathParam("customerId") int id,@Context UriInfo uriInfo) {

		Link self=null;
		   Customer cust=null;
		try {
			cust = dao.findById(id);
			
	        self = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();


	         cust.setLinks(self);
		} catch (SQLException e) {
			e.printStackTrace();
		}
      
		
		 return Response.status(200).entity(cust).build();

	} 

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addCustomer(Customer cust){
		int rowAdded=0;
		Customer addedCustomer = null;
		try {
			 rowAdded  = dao.add(cust);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(rowAdded ==1) {
			 addedCustomer = cust;
		}
		
		 return Response.status(201).entity(addedCustomer).build();
	}
	
	
	@POST
	@Path("/form")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addCustomerWithFormParam(@FormParam("customerId")  int customerId,@FormParam("customerName") String customerName, @FormParam("mobileNumber") long mobileNumber){
		int rowAdded=0;
		Customer addedCustomer = new Customer(customerId, customerName, mobileNumber);
		try {
			 rowAdded  = dao.add(addedCustomer);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(rowAdded !=1) {
			 addedCustomer = null;
		}
		
		 return Response.status(201).entity(addedCustomer).build();
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public Response removeCustomer(Customer cust){
		
		int rowDeleted=0;
		Customer deletedCustomer = null;

		     try {
				rowDeleted =dao.remove(cust.getCustomerId());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		    
		 	if(rowDeleted ==1) {
		 		deletedCustomer = cust;
			}
		
		 return Response.status(201).entity(deletedCustomer).build();
	}
	
}
