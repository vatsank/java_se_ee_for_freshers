package com.training.functional;

public class Application2 {

public static void main(String[] args) {
		
   
		Filter<String>  checkLength = (name) -> name.length()<3 || name.length()>8;
	
		Filter<Integer>  checkAge = (age) -> age >18 && age<58;

		System.out.println(checkLength.test("Ramesh"));
		System.out.println(checkLength.test("we"));
		
		System.out.println(checkAge.test(12));
		System.out.println(checkAge.test(45));
		
		
		
}
}
