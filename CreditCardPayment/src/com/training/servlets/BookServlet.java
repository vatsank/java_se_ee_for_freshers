package com.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.Book;
import com.training.entity.BookDetails;

/**
 * Servlet implementation class BookServlet
 */
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   String strBookNumber =   request.getParameter("bookNumber");
		           
		   int bookNumber  = Integer.parseInt(strBookNumber);
		   
		     String  strPrice =  request.getParameter("price");
		   
		     double price = Double.parseDouble(strPrice);
		     
		     String bookName = request.getParameter("bookName");
             String author = request.getParameter("author");
   
             Book book = new Book(bookNumber, bookName, author, price);
             
             BookDetails details = new BookDetails();
             
             boolean result = details.addBook(book);
             
             String message = "Exception";
             if(result) {
            	 message = "One Book Added";
             }
             
             request.setAttribute("msg",message);
             RequestDispatcher dispatcher = request.getRequestDispatcher("showStatus.jsp");
             dispatcher.forward(request, response);
             
	}

}
