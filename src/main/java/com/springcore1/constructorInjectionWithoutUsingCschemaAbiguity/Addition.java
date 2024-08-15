package com.springcore1.constructorInjectionWithoutUsingCschemaAbiguity;

public class Addition {
	private int a ;
	private int b;
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("a + b = int , int "+(this.a+this.b));
	}
	public Addition( double a , double b) {
		super();
		this.a = (int) a;
		this.b = (int)b;
		System.out.println("a + b = D, D "+(this.a+this.b));
	}
	public Addition( String a , String b) {
		super();
		this.a =  Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("a + b = Str, Str "+(this.a+this.b));
	}
	
	

}
