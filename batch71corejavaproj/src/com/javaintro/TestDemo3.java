package com.javaintro;

public class TestDemo3 {

	static void welcome() {
		System.out.println("Welcome to Java World !!");
		System.out.println("Welcome to Java World !!");
		System.out.println("Welcome to Java World !!");
		System.out.println("Welcome to Java World !!");
		System.out.println("Welcome to Java World !!");
	}

	void hello() {
		int a = 10;
		System.out.println("Hello Good morning !!");
		System.out.println("Hello Good morning !!");
		System.out.println("Hello Good morning !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		System.out.println("Happy Ugadi !!!");

		// calling the method
		welcome();

		TestDemo3 t3 = new TestDemo3();

		// CE: Cannot make a static reference to the non-static method hello() from the
		// type TestDemo3
		t3.hello();

		System.out.println("main method ended !!");
	}

}
