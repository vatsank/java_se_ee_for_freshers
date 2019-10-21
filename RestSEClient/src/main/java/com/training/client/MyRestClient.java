package com.training.client;

import javax.json.Json;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public class MyRestClient {

	public static void main(String[] args) {
			
		 Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://localhost:2020/rest-quickstart/webapi/");
		 
		String response = target.path("customer").request().get(String.class);
		
		System.out.println(response);
//		
//		
//		String delResponse = target.path("customer/remove").queryParam("custId", 102).request().delete(String.class);
//		
//		  
//		System.out.println(delResponse);
//		

		
		 
	
//	
//                Response updateResp = target.path("customer/update").queryParam("custId", 102)
//                		                             .request().put(Entity.entity(cust,MediaType.APPLICATION_JSON));
//                
//                System.out.println(updateResp.toString());
		
                
		
	//	Response resp = target.path("customer/addAsJson").request().post(Entity.entity(cust, MediaType.APPLICATION_JSON));
		
		
		//System.out.println(resp.readEntity(String.class));
                          
                
	}

}
