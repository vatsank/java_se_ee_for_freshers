package com.training.filters;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet Filter implementation class LoggingFlter
 */
public class LoggingFlter implements Filter {

    /**
     * Default constructor. 
     */
	
	Logger log = Logger.getLogger("fileLogger");
	
    public LoggingFlter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		log.info("Request From " +req.getRemoteHost()+ req.getRequestURI()+LocalDate.now()+"Received");
		//System.out.println("PRE PROESSING - STARTS");
		
		String uri = req.getRequestURI();
		
		
		if(uri.contains("Greeting")) {
		   
			HttpServletResponse resp = (HttpServletResponse)response;
			resp.sendRedirect("http://www.google.com");
		}
		chain.doFilter(request, response);
		HttpServletResponse resp = (HttpServletResponse)response;
		
	//	resp.setContentType("text/text");

		log.info(resp.getContentType());
		
		
		log.info("POST PROESSING - STARTS");
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
