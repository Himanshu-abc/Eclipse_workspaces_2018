package com.app.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		((AbstractApplicationContext)context).registerShutdownHook();
		
		Restaurant r=(Restaurant) context.getBean("rr");
		
		r.message();
	}
}
