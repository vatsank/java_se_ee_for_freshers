package com.training.dayone;

public class CurrencyConverter {

	private double exchangeRate;

	public CurrencyConverter() {
		super();
	}

	public CurrencyConverter(double exchangeRate) {
		super();
		this.exchangeRate = exchangeRate;
	}

	public double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	
	public double convert(double inrValue) {
		
		return inrValue / exchangeRate;
		
	}
}
