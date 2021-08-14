package com.app.entity;

public class Address {
	
	private String locality;
	private String city;
	private int pinCode;
	private String country;
	
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [locality=" + locality + ", city=" + city + ", pinCode=" + pinCode + ", country=" + country
				+ "]";
	}
}
