package com.operators;

//3) Unary Operators 
//+ - 
//++ -- 

//ex: Pre Increment ++a= a= a+1  , post Increment a++--> a= a+1 
//ex: pre decrement --a= a= a-1 , post decrement a--= a= a-1
public class TestOpDemo3 {

	public static void main(String[] args) {

		int a = 5;
		int b = 6;

//		System.out.println(+a);// 10
//		System.out.println(-b);// -20

		System.out.println(++a);// 6
		System.out.println(++b);// 7

		System.out.println(a++);// 6 --> 7
		System.out.println(++b);// 8

		System.out.println(a++);// 7 --> 8
		System.out.println(--a);// 7
		System.out.println(--b);// 7
		System.out.println(b++);// 7 --> 8
		System.out.println(++a);// 8
		System.out.println(++a);// 9
		System.out.println(++b);// 9
		System.out.println(a--);// 9 --> 8
		System.out.println(b--);// 9 --> 8

		System.out.println("A value : " + a);// 8
		System.out.println("B value :" + b);// 8

	}

}
