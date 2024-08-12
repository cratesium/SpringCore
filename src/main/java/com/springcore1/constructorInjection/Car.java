package com.springcore1.constructorInjection;

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
