package com.training;
import java.util.*;
public class JsonApplication {

	public static void main(String[] args) {

		
		JsonHandler handler = new JsonHandler();
		
		BankAccount ramsAccount = 
				
				new BankAccount(203030, "Ramesh Kumar", 48900);
		
		String jsonData = handler.parseToJson(ramsAccount);
		
		System.out.println(jsonData);
		
		BankAccount ramAccount2 = handler.jsonToJava(jsonData);
		
		System.out.println(ramAccount2);
		
		List<BankAccount> list = Arrays.asList(new BankAccount(304040,"Suresh",78838),ramsAccount);
		
		System.out.println(handler.parseToJson(list));
		
		
		handler.parseToJsonFile(list);
		
	}

}
