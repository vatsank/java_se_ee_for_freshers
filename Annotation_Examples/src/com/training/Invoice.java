package com.training;

/**
 * 
 * @author Srivatsan
 *
 *  Class Name - Noun
 *  Method Name - Verb
 */

public class Invoice {


	private int invoiceNumber;
	private String customerName;
	private double amount;
	
	public Invoice() {
		super();
	}

	// Overloaded Constructor
	
	public Invoice(int invoiceNumber, String customerName, double amount) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.customerName = customerName;
		this.amount = amount;
	}

	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return this.customerName +" , " +this.amount;
	}
	
	
	
}
