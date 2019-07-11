package com.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUsingAppContext {
	
	public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("firstSpring.xml");
		 System.out.println("In ApplicationContext ");
		 Bank bankObj = (Bank) context.getBean("bank");
		 System.out.println(bankObj.getName());
	}

}
