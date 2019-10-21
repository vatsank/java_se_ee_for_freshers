package com.training.listerners;

import java.io.File;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.PropertyConfigurator;

/**
 * Application Lifecycle Listener implementation class ContextListener
 *
 */
public class ContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
       
    	 String designer= sce.getServletContext().getInitParameter("design");
    
    	 String logFile = sce.getServletContext().getInitParameter("logFile");
    	 
    	  sce.getServletContext().setAttribute("designer", designer);
    
    	  String logFileRef = sce.getServletContext().getRealPath("")+File.separator+logFile;
    	  
    	  
    	  PropertyConfigurator.configure(logFileRef);
    	  
    }
	
}
