package com.training;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;

public class JsonHandler {

	private Gson parser;
	
	
	public JsonHandler() {
		super();
	
		 parser = new Gson();
	}

	public String parseToJson(BankAccount obj) {
				
		return parser.toJson(obj);
	}
	
	public String parseToJson(List<BankAccount> list) {
		
		return parser.toJson(list);
	}
	
   public boolean parseToJsonFile(List<BankAccount> list) {
		
	   boolean result = false;
	   JsonWriter writer =null;
	   try {
		 writer = new JsonWriter(new FileWriter(new File("account.json"),true));
		  
		 writer.beginArray();
		  
		  for(BankAccount eachAccount:list) {
			
			  writer.beginObject();

				  writer.name("accountNumber").value(eachAccount.getAccountNumber());
				  writer.name("holderName").value(eachAccount.getAccountHolderName());
				  writer.name("balance").value(eachAccount.getBalance());
		
		   writer.endObject();
		  }
		 
		  writer.endArray();
		  result =true;
	   } catch (IOException e) {
	
		e.printStackTrace();
	}finally {
		
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	   
	   
	   return result;
	   
	}
	
	
	public BankAccount jsonToJava(String obj) {
		
		return parser.fromJson(obj, BankAccount.class);
	}
}
