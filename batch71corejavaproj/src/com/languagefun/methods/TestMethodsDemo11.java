package com.languagefun.methods;

import java.util.Scanner;

public class TestMethodsDemo11 {
	
//	var arg
//	void hello(int ... a){
//		
//	}

//	To interact with any other languages through java we need to have native method with native libraries.
	native void method8();

	// Native methods do not specify a body
//	native void method8() {
//		
//	}

	// If we want to call instance methods inside a static we must need to create a
	// Object.

	static void method1() {
		TestMethodsDemo11 t = new TestMethodsDemo11();
		t.method3();
		System.out.println("method1 called ");
	}

	// in instance methods, can we call static methods directly..?Yes without a
	// doubt
	void method2() {
		method1();
		System.out.println("method2 called ");
	}

//	in instance method, we can call instance methods directly.
	void method3() {
		method4();
		System.out.println("method3 called ");
		method6();

	}

	// in static methods, we can call static methods directly.
	static void method4() {
		System.out.println("method4 called ");
		method5();
	}

	static void method5() {
		System.out.println("method5 called ");

	}

	void method6() {
		System.out.println("method6 called ");
	}

	public static void main(String[] args) {
		System.out.println("main method strated ");

		TestMethodsDemo11 t = new TestMethodsDemo11();
		t.method2();
		
//		Scanner sc = new Scanner();

		System.out.println("main method ended ");

	}

}
