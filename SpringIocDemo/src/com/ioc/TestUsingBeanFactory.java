package com.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestUsingBeanFactory {

	public static void main(String[] args) {

		// Loading xml file
		Resource resource = new ClassPathResource("firstSpring.xml");
		// Creating container Obj - BeanFactory
		BeanFactory factory = new XmlBeanFactory(resource);

		Bank bankObj = (Bank) factory.getBean("bank");
		System.out.println(bankObj.getName());

	}
}
