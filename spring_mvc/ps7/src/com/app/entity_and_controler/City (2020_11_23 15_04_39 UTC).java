package com.app.entity_and_controler;

public class City {
	
	private String cityName;
	private String cityCode;
	
	public City() {
		super();
	}

	public City(String cityName, String cityCode) {
		super();
		this.cityName = cityName;
		this.cityCode = cityCode;
	}
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", cityCode=" + cityCode + "]";
	}
}
