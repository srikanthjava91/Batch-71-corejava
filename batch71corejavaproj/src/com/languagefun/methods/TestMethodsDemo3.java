package com.languagefun.methods;

//No return type + with arguments 
//byte -short - int - long - float - double 
public class TestMethodsDemo3 {

	static void addition(int a, int b) {
		System.out.println("Addition :" + (a + b));// 600
	}

	static void subtraction(float a, float b) {
		System.out.println("subtraction " + (a - b));
	}

	public static void main(String[] args) {
		System.out.println("main method strated ");

		// Calling the method with values or parameters
		// Call By Value
		addition(10, 50);
		addition(1000, 5000);

		subtraction(600, 300);
		subtraction(6000, 3000);
		System.out.println("main method ended ");

	}

}
