package com.training.entity;
import java.util.*;
public class BookDetails {

	
	private List<Book> bookList ;
	
	public BookDetails() {
		
		this.bookList = new ArrayList<>();
	}
	
	public boolean addBook(Book book) {
		
		return this.bookList.add(book);
	}
}
