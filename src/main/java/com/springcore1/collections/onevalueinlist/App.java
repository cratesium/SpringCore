package com.springcore1.collections.onevalueinlist;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("com/springcore1/collections/onevalueinlist/Collectionconfig.xml");
		Emp emp=(Emp) applicationContext.getBean("object1");
		System.out.println(emp.getName());
		System.out.println(emp.getPhoneNumber());
		System.out.println(emp.getFamilyMember());
		System.out.println(emp.getCourseCode());
	}


}
