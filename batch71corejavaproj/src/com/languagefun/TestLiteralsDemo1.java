package com.languagefun;

//Integral Literals : 

//Decimal Literals : the base is 10 the values we can keep 0 to 9.
//OCtal Literals   : Any number starts with 0 will consider as Octal 
//					   : the base is 8 & the vlues we can keep 0 to 7.	
//Hexa Decimal Literals : Any number starts with 0x or 0X will consider as Hexa Decimal.
//						: the base is 16 & the values from 0 to 9& a-f or A-F 
//						: a=10, b=11, c =12, d=13, e=14, f=15

//Binary Literals  	: Any number starts with 0b will consider as Binary.
//					: the base is 2  the values are 0 and 1.

public class TestLiteralsDemo1 {

	public static void main(String[] args) {

		// Decimal Literals
		int a1 = 123;
		int a2 = 1230;

		// OCtal Literlas
		// 1*8^2 +2*8^1 +3*8^0
		// 64 + 16 + 3 = 83
		int a3 = 0123;

		int a4 = 0765;// 501
//		int a5 = 0864;//564//The literal 0864 of type int is out of range 
		int a6 = 0437;// 287

		// 1*16^2 +2*16^1 +3*16^0 = 291
		int a7 = 0x123;

		int a8 = 0X345;
		int a9 = 0x999;

		// 10 1 11 2
		int a10 = 0xa1b2;
		int a11 = 0XDAD;
		int a12 = 0xBEe;
//		int a13 = 0xBeer;//Syntax error on token "r", delete this token

		int a13 = 0b1010;
		int a14 = 0b101010;

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);// 83
		System.out.println(a4);
		System.out.println(a6);
		System.out.println(a7);

		System.out.println(a8);// 837
		System.out.println(a9);// 2457
		System.out.println(a10);// 2457
		System.out.println(a11);
		System.out.println(a12);
		System.out.println(a13);//10
		System.out.println(a14);//10
		
		

	}

}
