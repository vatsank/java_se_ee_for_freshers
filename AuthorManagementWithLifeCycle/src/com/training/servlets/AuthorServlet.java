package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xpath.internal.FoundIndex;
import com.training.entity.Author;
import com.training.utils.DbConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Servlet implementation class AuthorServlet
 */
public class AuthorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	private Connection con;
	
    public AuthorServlet() {
        super();
     
        System.out.println("Constructor Called");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {

		this.con = DbConnection.getOracleConnection();
		
		System.out.println("Init Method Called");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy()  {
		System.out.println("Destory Method Called");
		try {
			this.con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	             PrintWriter out = response.getWriter();
	             
	             out.println("Hey got SQL connection !!!!");
	             out.println(this.con);
	             
	             Author ramesh=new Author(101, "Ramesh Kumar", 94949439, "ram@abc.com");
	             
	             Author rakesh=new Author(102, "Rakesh Kumar", 94749479, "rak@abc.com");

	             
	             List<Author> list = new ArrayList<>();
	             
	             list.add(ramesh);
	             list.add(rakesh);
	             request.setAttribute("foundAuthor", list);
	             request.setAttribute("user", "ramesh");
	             
	             
	             //RequestDispatcher dispatcher = request.getRequestDispatcher("showAuthors.jsp");
	
	             RequestDispatcher dispatcher = request.getRequestDispatcher("displayAuthors.jsp");
	             
	             dispatcher.forward(request, response);
	             
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
