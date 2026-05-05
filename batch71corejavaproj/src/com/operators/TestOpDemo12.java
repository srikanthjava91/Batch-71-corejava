package com.operators;

import javax.management.InstanceNotFoundException;

class A {
	
}


class B extends A {
	
}

public class TestOpDemo12 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

		Integer i1 = 10;

		System.out.println(i1 instanceof Integer);// true
		System.out.println(i1 instanceof Number);// true
		System.out.println(i1 instanceof Object);// true
		System.out.println(null instanceof Integer);// false

		Object obj = new Object();
		System.out.println(obj instanceof String);//

		// CE : Incompatible conditional operand types Integer and String
		Integer i2 = 20;
//		System.out.println(i2 instanceof String);
		System.out.println("*********************");
		A a = new A();
		B b = new B();
		
		System.out.println(a instanceof A);
		System.out.println(b instanceof B);
		System.out.println(b instanceof A);
		System.out.println(a instanceof B);

	}

}
