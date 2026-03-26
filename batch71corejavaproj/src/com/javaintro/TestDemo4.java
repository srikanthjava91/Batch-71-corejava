package com.javaintro;

public class TestDemo4 {

	// static method
	// if we want to call instance methods inside a static area, we must need to
	// create object.
	static void method1() {
		System.out.println("method1 called !!");
		TestDemo4 t4 = new TestDemo4();
		t4.method2();
	}

	// instance method
	// in instance methods, Yes We can call instance methods directly.
	void method2() {
		System.out.println("method2 called !!");
		method4();

	}

	static void method3() {
		System.out.println("method3 called !!");

	}

	// instance method
	// In instance method, we can call static methods also directly
	void method4() {
		System.out.println("method4 called !!");
		method5();

	}

	static void method5() {
		System.out.println("method5 called !!");

		TestDemo4 t = new TestDemo4();
		t.method6();

	}

	void method6() {
		System.out.println("method6 called !!");
	}

	// main method
	// in static we can call static methods directly !!
	public static void main(String[] args) {
		System.out.println("main method started !!");
		method1();
		
		System.out.println("main method ended !!");
	}

}
