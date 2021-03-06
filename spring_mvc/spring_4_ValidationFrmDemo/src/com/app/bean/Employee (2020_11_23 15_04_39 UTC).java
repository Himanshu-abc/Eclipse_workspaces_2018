package com.app.bean;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

public class Employee {
	@NotNull
	@Min(1)
	@Max(99)
	private Integer empId;

	@NotEmpty
	@Size(min=4,max=10)
	private String name;

	
	//@DecimalMin("5000")
	@DecimalMin(value="5000",inclusive=false)
	@DecimalMax("9999.99")
	@Digits(integer=4,fraction=3)
	private Double salary;
	
	@NotBlank
	private String city;

	@Email
	private String email;

	@Range(min=1,max=100)
	private Double age;
	
	@Past
	private Date joinDate;

	@URL
	private String companyUrl;
	
	@NotEmpty
	private List<String> qualification;
	
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary="
				+ salary + ", city=" + city + ", email=" + email
				+ ", joinDate=" + joinDate + ", companyUrl=" + companyUrl + "]";
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getCompanyUrl() {
		return companyUrl;
	}

	public void setCompanyUrl(String companyUrl) {
		this.companyUrl = companyUrl;
	}

	public Double getAge() {
		return age;
	}

	public void setAge(Double age) {
		this.age = age;
	}

	public List<String> getQualification() {
		return qualification;
	}

	public void setQualification(List<String> qualification) {
		this.qualification = qualification;
	}	

}