package com.logicalstatements.loops;

//Q) WAP to swap two numbers using temp variable & without using third variable & using Bitwise Operators.
public class TestOpDemo28 {

	public static void main(String[] args) {

		int a = 20;
		int b = 10;
		int temp = 0;

		temp = a;
		a = b;
		b = temp;

		System.out.println("A value is : " + a);
		System.out.println("B value is : " + b);
		System.out.println("****************************");

		int x = 10;
		int y = 20;

		x = x + y;// 30
		y = x - y;// 30-20 = 10
		x = x - y;// 30-10= 20

		System.out.println("X value : " + x);
		System.out.println("Y value : " + y);
		System.out.println("*******************************");

		int m = 10;
		int n = 20;

		m = m ^ n;//30 
		n = m ^ n;//30 20 --> 10 
		m = m ^ n;//30 ^10 

		System.out.println("M value : " + m);
		System.out.println("N value : " + n);

	}

}
