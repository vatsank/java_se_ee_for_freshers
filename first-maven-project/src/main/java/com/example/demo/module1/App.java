package com.example.demo.module1;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */

public class App 
{
	
	//static Logger log = Logger.getRootLogger();
	
	static Logger log = Logger.getLogger("fileLogger");

    public static void main( String[] args )
    {
        log.info( "Hello World!" );
        
        Employee ramesh = new Employee(200, "Ramesh");
        
        log.info(ramesh.calculateSalary());
        
        Employee sumesh = new Employee(2200, "Sumesh");
        
        log.info(sumesh.calculateSalary());
        
    }
}
