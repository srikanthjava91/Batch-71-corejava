package com.operators;

import java.util.Scanner;

//1) Arithmetic Operators
//+ - * / % 
//BODMAS 
public class TestOpDemo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int a = sc.nextInt();

		System.out.println("enter b number ");
		int b = sc.nextInt();

		System.out.println("enter c number ");
		int c = sc.nextInt();

		System.out.println("enter d number ");
		int d = sc.nextInt();

		System.out.println("Addition with SUm :" + (a + b));// 300

//		The operator - is undefined for the argument type(s) String, int
//		System.out.println("subtraction " + b -a);//CE

		System.out.println("subtraction with Difference : " + (b - a));// CE
		System.out.println("Multiplication with Product: " + a * b);// 200
		System.out.println("Division with quotient : " + c / d);// 24
		System.out.println("Modulus with Reminder : " + c % d);// 2
	}
}
