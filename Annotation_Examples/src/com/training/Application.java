package com.training;

public class Application {

	public static void main(String[] args) {
		
		Invoice ramInvoice = new Invoice(101,"Ram", 45000);
		
		System.out.println(ramInvoice);
		
		UsingAnnotations firstUse = new UsingAnnotations();
		 
		System.out.println(firstUse.showMessge());
	}

}
