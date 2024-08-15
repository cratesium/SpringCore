package com.springcore1.constructorInjectionWithoutUsingCschemaAbiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
public static void main(String[] args) {
	ApplicationContext context=  new ClassPathXmlApplicationContext("com/springcore1/constructorInjectionWithoutUsingCschemaAbiguity/ciconfig.xml");
	Addition addition=(Addition ) context.getBean("addition");
	System.out.println(addition);
}
}
