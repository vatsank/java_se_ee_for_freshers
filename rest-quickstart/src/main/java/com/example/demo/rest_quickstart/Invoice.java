package com.example.demo.rest_quickstart;

import javax.ws.rs.core.Link;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.*;

@XmlRootElement
public class Invoice {

	@XmlElement
	private long id;
	@XmlElement

	private String customerName;
	@XmlElement

	private double amount;
	
    @XmlJavaTypeAdapter(Link.JaxbAdapter.class)
    private List<Link> links;

	public Invoice() {
		super();
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
	
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", customerName=" + customerName + ", amount=" + amount + "]";
	}
	
}
