package com.example.demo.module1;

import org.apache.log4j.*;

public class Employee {

	private long empId;
	private String empName;
	
	//Logger log = Logger.getRootLogger();

	Logger log = Logger.getLogger("fileLogger");
	
	public Employee(long empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
		log.info("Employee Initialized");
	}
	public Employee() {
		super();
	}
	
	
	public double calculateSalary() {
		
		log.debug("Calculate Salary Called");
		double salaryPerMonth = 50000.00;
		if(empId>1000) {
		
			salaryPerMonth=72000.00;
		}
		
		log.debug(salaryPerMonth);
	
		return salaryPerMonth;
	}
	
	
}
