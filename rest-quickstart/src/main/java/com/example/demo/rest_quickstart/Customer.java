package com.example.demo.rest_quickstart;
import java.util.*;
import javax.ws.rs.core.Link;


import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
public class Customer {
	private int customerId;
	private String customerName;
	private long mobileNumber;   
	
	@XmlJavaTypeAdapter(Link.JaxbAdapter.class)
    private Link links;

	
	
	public Link getLinks() {
		return links;
	}
	public void setLinks(Link links) {
		this.links = links;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Customer() {
		super();
	
	}
	public Customer(int customerId, String customerName, long mobileNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setcustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void   setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", mobileNumber=" + mobileNumber + "]";
	}
	
	
}
