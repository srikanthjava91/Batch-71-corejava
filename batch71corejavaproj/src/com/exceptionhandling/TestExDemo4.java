package com.exceptionhandling;

class A {

	void hello() {
		System.out.println("Hello A");
	}
}

class B extends A {
	
	void hello() {
		System.out.println("Hello B");
	}

}

public class TestExDemo4 {

	public static void main(String[] args) {
		System.out.println("main method staretd ");
		try {
			B b = (B) new A();//java.lang.ClassCastException:
			b.hello();
		}catch(ClassCastException cc) {
			cc.printStackTrace();
		}
		

		String name = "Srikanth";
		try {
			System.out.println("in try");
			System.out.println(name.charAt(5));// t --> Index 10 out of bounds for length 8
		} catch (StringIndexOutOfBoundsException s) {
			System.out.println("in catch");
			System.err.println(s.getMessage());
			System.err.println(s.getCause());
			System.err.println(s.toString());
		}

		System.out.println("main method ended ");
		System.out.println("main method ended ");
		System.out.println("main method ended ");
		System.out.println("main method ended ");
		System.out.println("main method ended ");
		System.out.println("main method ended ");
	}

}
