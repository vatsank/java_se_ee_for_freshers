package com.training;

import javax.jws.WebService;

@WebService(endpointInterface = "com.training.BookService")
public class BookServiceImpl implements BookService {

	@Override
	public String[] findBestBooks(String topic) {

		String[] books = {"Harry potter","Alchemist"};
		String[] itBooks ={"Head First Java","Thinking in java"};
		
		if(topic.equalsIgnoreCase("java")) {
			return  itBooks;
		} else {
		return books;
		}
	}

}
