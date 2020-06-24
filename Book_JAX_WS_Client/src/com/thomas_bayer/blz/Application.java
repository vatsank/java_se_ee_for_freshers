package com.thomas_bayer.blz;

import java.rmi.RemoteException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BLZServicePortTypeProxy proxy = new BLZServicePortTypeProxy();
		
		 try {
			DetailsType resp = proxy.getBank("73369871");
			
			System.out.println(resp.getPlz());
			
			System.out.println(resp.getBezeichnung());
			
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
