package com.app.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springConfig.xml");
		
		Restaurant obj=(Restaurant) ctx.getBean("restaurantBean");
		
		obj.greetCustomer();
	}
}
