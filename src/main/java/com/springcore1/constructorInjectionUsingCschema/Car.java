package com.springcore1.constructorInjectionUsingCschema;

public class Car {
  String name;
public Car(String name) {
	super();
	this.name=name;
}
@Override
public String toString() {
	return this.name;
}
  

}
