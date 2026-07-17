package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo15 {

	public static void main(String[] args) throws ArithmeticException{

		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();

		System.out.println("Enter another number ");
		int b = sc.nextInt();

		if (b != 0) {
			System.out.println(a / b);
		} else {
			 throw new ArithmeticException("Arey Babu Chitti Dont send zero's !!");
//			System.out.println();//Unreachable code
		}

		System.out.println("main method ended ");
	}

}
