package com.todo.currencyconversionservice;

import org.springframework.stereotype.Component;

@Component
public class CurrencyExchangeData {
	

	private Long id;
	private String IpAddress;
	
	private int port;
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	private String fromCurrency;
	private String toCurrency;
	private double conversionRate; 
	private double convertedValue;
	public String getFromCurrency() {
		return fromCurrency;
	}
	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}
	public String getToCurrency() {
		return toCurrency;
	}
	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}
	
	public CurrencyExchangeData(Long id, String fromCurrency, String toCurrency, double conversionRate, double convertedValue) {
		super();
		this.id = id;
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.conversionRate = conversionRate;
		this.convertedValue = convertedValue;
	}
	public CurrencyExchangeData(){
		
	}
	public double getConversionRate() {
		return conversionRate;
	}
	public void setConversionRate(double conversionRate) {
		this.conversionRate = conversionRate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getConvertedValue() {
		return convertedValue;
	}
	public void setConvertedValue(double convertedValue) {
		this.convertedValue = convertedValue;
	}
	public String getIpAddress() {
		return IpAddress;
	}
	public void setIpAddress(String ipAddress) {
		IpAddress = ipAddress;
	}
	
	
}
