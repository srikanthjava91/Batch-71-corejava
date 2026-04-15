package com.languagefun.methods;

//WAP to print addition subtraction multiplication division modulus with methods.
// no return type + no arguments
//SimpleCalculator 
//Arithmetic Operators --> + -  * / % 
public class TestMethodsDemo2 {

	// Sum
	static void add() {
		int a = 100;
		int b = 200;
		System.out.println("SUM of two numbers : " + (a + b));
	}

	// diff
	static void sub() {
		int a = 100;
		int b = 200;
		System.out.println("Diffferences of Two number s: " + (b - a));
	}

	// product
	static void mul() {
		int a = 100;
		int b = 200;
		System.out.println("Product of the Two numbers " + (b * a));
	}

	// quotient
	static void div() {
		int a = 100;
		int b = 5;
		System.out.println("Quotient of two numbers: " + a / b);
	}

	// Reminder
	static void mod() {
		int a = 98;
		int b = 5;
		System.out.println("Reminder of two numbers: " + a % b);
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

//		 calling the methods
		add();
		sub();
		mul();
		div();
		mod();

		System.out.println("main method ended ");
	}

}
