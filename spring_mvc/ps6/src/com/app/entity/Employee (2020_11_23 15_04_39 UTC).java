package com.app.entity;

import java.util.List;

public class Employee {
	
	private String name;
	private int age;
	private String hobby;
	private List<String> skills;
	private Address address;
	
	public Employee(String name, int age, String hobby, List<String> skills, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.hobby = hobby;
		this.skills = skills;
		this.address = address;
	}
	public Employee() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", hobby=" + hobby + ", skills=" + skills + ", address="
				+ address + "]";
	}
}
