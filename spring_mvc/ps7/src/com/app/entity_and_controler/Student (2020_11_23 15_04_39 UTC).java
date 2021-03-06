package com.app.entity_and_controler;

import java.util.Arrays;
import java.util.List;

public class Student {

	private Integer id;
	private String name;
	private String[] hobbies;
	private List<String> qualifications;
	private String gender;
	private City city;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public List<String> getQualifications() {
		return qualifications;
	}
	public void setQualifications(List<String> qualifications) {
		this.qualifications = qualifications;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", hobbies=" + Arrays.toString(hobbies) + ", qualifications="
				+ qualifications + ", gender=" + gender + ", city=" + city + "]";
	}
}