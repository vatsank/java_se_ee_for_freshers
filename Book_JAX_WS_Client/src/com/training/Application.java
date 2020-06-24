package com.training;

import java.rmi.RemoteException;

public class Application {

	public static void main(String[] args) {
	
		BookServiceProxy proxy = new BookServiceProxy();
		
		try {
			String[] response = proxy.findBestBooks("novel");
		
			for(String eachBook: response) {
				System.out.println(eachBook);
			}
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		

	}

}
