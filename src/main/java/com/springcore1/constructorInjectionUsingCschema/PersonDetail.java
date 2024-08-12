package com.springcore1.constructorInjectionUsingCschema;

import java.awt.CardLayout;
import java.security.Signature;
import java.util.List;

public class PersonDetail {
	
	private String name;
	private int age ;
//	private List<String> books;
	private Car car;
	public PersonDetail(String name, int age, Car car) {
		super();
		this.name = name;
		this.age = age;
//		this.books = books;
		this.car = car;
	}
	@Override
	public String toString() {
		return "PersonDetail == > [name=" + name + ", age=" + age + ",  carName=" + car + "]";
	}
	
	
	

}
