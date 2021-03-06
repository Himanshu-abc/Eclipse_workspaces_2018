package com.app.entity;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestControler {

	HashMap<String, Employee> list=new HashMap<String,Employee>();
	
	@RequestMapping(value="/employees" , method=RequestMethod.GET)
	public Map<String, Employee> function3() {
		
		list.put("raju",new Employee("raju", 22, "Male", new String[] {"cricket"}, "it", 600000d));
		list.put("sheetal",new Employee("sheetal",32,"Female",new String[] {"football,hockey"},"infrstructure",3242432d));
		list.put("mohan",new Employee("mohan", 44,"Male",new String[] {"carrom","ludo"},"help",3434343d));
		
		return list;
	}
	
	// Get a Resource
	@RequestMapping(value="/{name}" , method=RequestMethod.GET)
	public Employee function4(@PathVariable("name")String name) {
		
		String n=name;
		Employee ee=list.get(n);
		return ee;
	}
	// update a Resource
	
	@RequestMapping(value="/employees/{name}",method=RequestMethod.PUT)
	public Employee function5(@PathVariable("name")String name,@RequestBody Employee ee) {
		
		String n=name;
		Employee e=list.get(n);
		
		if(e.getName()!=null)
		{
		e.setName(ee.getName());
		e.setAge(ee.getAge());
		e.setDepartment(ee.getDepartment());
		e.setGender(ee.getGender());
		e.setHobbies(ee.getHobbies());
		e.setSalary(ee.getSalary());
		
		return e;
		}
		else {
			return 	new Employee(ee.getName(), ee.getAge(), ee.getGender(), ee.getHobbies(), ee.getDepartment(), ee.getSalary());
		}
	}
}
