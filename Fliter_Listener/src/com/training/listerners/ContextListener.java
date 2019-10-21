package com.training.listerners;

import java.io.File;
import java.net.URL;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Application Lifecycle Listener implementation class ContextListener
 *
 */
public class ContextListener implements ServletContextListener {

	Logger log = Logger.getRootLogger();
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

    	log.info("Context Initialzed");
    	ServletContext ctx = sce.getServletContext();
    	String logFile = sce.getServletContext().getInitParameter("logFile");
    
    	String fullPath = ctx.getRealPath("") + File.separator + logFile;
    	
    	PropertyConfigurator.configure(fullPath);
    
    log.info("log file configured");
    }
	
}
