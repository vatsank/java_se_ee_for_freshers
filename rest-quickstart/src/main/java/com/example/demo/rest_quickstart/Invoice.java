package com.example.demo.rest_quickstart;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Invoice {

	@XmlElement
	private long id;
	@XmlElement

	private String customerName;
	@XmlElement

	private double amount;
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(long id, String customerName, double amount) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.amount = amount;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
		return "Invoice [id=" + id + ", customerName=" + customerName + ", amount=" + amount + "]";
	}
	
}
