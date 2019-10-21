package com.training.functional;

public class Application {

	public static void main(String[] args) {

		// Using Annoymous Class 
		
		
		Converter< Double, Double> currency = new Converter<Double, Double>() { // annonymous class is here
			
			@Override
			public Double convert(Double frm) {
				return frm * 100;
			}
			
		};  // observe this
		
		System.out.println(currency.convert(45.00));
		
		// line Number 10 to 16 is rewritten in a concise way
		Converter<Double, Double> lambda = (frm) -> frm * 100;
		
		// line number 18 and 24 are indentical
		System.out.println(lambda.convert(55.00));
		
		System.out.println(lambda);
	}


}
