package com.training;

import javax.xml.ws.Endpoint;

public class Application {

	public static void main(String[] args) {

		
		Endpoint.publish("http://localhost:9000/bookService", new BookServiceImpl());
		
		System.out.println("Service listening in port 9000");
	}

}
