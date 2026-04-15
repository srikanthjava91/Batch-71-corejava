package com.languagefun.methods;

public class TestMethodsDemo1 {

	// static
	// no return type + no arguments
	static void show() {
		System.out.println("Show your ID card !");
	}

	// instance method
	// no return type + no arguments
	void displayStudentInfo() {
		System.out.println("Student info ");
	}

	// static
	// no return type + with args
	public static void main(String[] args) {
		System.out.println("main method started !");

		TestMethodsDemo1 t1 = new TestMethodsDemo1();

		// calling the static method
		TestMethodsDemo1.show();

		// calling the instance method
		t1.displayStudentInfo();

		System.out.println("main method ended !");
	}
}
