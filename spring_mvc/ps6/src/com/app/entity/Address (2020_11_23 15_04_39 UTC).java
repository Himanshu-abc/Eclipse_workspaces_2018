package com.app.entity;

public class Address {
	
	private String country;
	private String city;
	private int pinCode;
	
	public Address(String country, String city, int pinCode) {
		super();
		this.country = country;
		this.city = city;
		this.pinCode = pinCode;
	}
	public Address() {
		super();
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
}
