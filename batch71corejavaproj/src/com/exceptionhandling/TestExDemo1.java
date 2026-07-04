package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		long a = sc.nextInt();

		System.out.println("Enter b number ");
		long b = sc.nextInt();

//		if (b != 0) {
//			System.out.println(a / b);
//		}else {
//			System.out.println("you entered, zero dont send zeros !!");
//		}
//No exception of type Object can be thrown; 
//		an exception type must be a subclass of Throwable
		
		try {
			System.out.println("in try");
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("in catch");
			e.printStackTrace();
		}

		System.out.println("Hello Guys, Good Morning !!");
		System.out.println("Hello Guys, Good Evening !!");
		System.out.println("main method ended ");

	}

}
