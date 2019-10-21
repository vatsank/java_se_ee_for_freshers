package com.training.dayone;

public class Application {

	public static void main(String[] args) {

		CurrencyConverter inrToUsd = new CurrencyConverter(72.00);
		
		 double usd = inrToUsd.convert(100.00);
		
		 System.out.printf("USD :%10s",usd);
		
		
	}

}
