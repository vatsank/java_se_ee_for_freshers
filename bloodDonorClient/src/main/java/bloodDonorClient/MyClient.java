package bloodDonorClient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class MyClient {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		
		String uri = "http://localhost:2020/bloodDonors/webapi/";
		
		WebTarget target = client.target(uri).path("donors");
		
		
		String response = target.request().get(String.class);

		
		System.out.println(response);
		
		String aposList = target.path("/apos/").request().get(String.class);
		
		System.out.println("A positive Donors");
		
		System.out.println(aposList);
		
	}

}
