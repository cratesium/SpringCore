package com.springcore1.constructorInjectionWithoutUsingCschema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
public static void main(String[] args) {
	ApplicationContext context=  new ClassPathXmlApplicationContext("com/springcore1/constructorInjectionWithoutUsingCschema/ciconfig.xml");
	PersonDetail objDetail=(PersonDetail) context.getBean("objPerson");
	System.out.println(objDetail);
}
}
