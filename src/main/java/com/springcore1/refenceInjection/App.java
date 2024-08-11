package com.springcore1.refenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	  public static void main(String[] args) {
		
		  
		 ApplicationContext context=  new ClassPathXmlApplicationContext("com/springcore1/refenceInjection/refconfig.xml");
		 A objA =(A)context.getBean("aref");
		 System.out.println(objA);
		 System.out.println("------------------------");
		 System.out.println("x = "+ objA.getX());
		 System.out.println("y = "+objA.getObjB().getY());
		 System.out.println("objb= "+objA.getObjB());
	}

}
