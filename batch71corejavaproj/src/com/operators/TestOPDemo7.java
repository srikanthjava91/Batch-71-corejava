package com.operators;

//	6) Bitwise Operators 
//	& | ^ ~
public class TestOPDemo7 {

	public static void main(String[] args) {

		System.out.println("************Bitwise AND************");
		System.out.println(true & true);// 1 & 1 --> 1
		System.out.println(true & false);// 1 & 0 --> 0
		System.out.println(false & true);// 0 & 1 --> 0
		System.out.println(false & false);// 0 & 0 --> 0

		System.out.println(68 & 44);// 4
		System.out.println(45 & 33);// 33
		System.out.println(56 & 67);// 0
		System.out.println(76 & 44);// 12
		System.out.println("************Bitwise OR************");

		System.out.println(true | true);// 1 | 1 --> 1//
		System.out.println(true | false);// 1 | 0 --> 1
		System.out.println(false | true);// 0 | 1 --> 1
		System.out.println(false | false);// 0 | 0 --> 0

		System.out.println(68 | 44);// 108
		System.out.println(45 | 33);// 45
		System.out.println(56 | 67);// 123
		System.out.println(76 | 44);// 108
		System.out.println("************Bitwise XOR************");
		System.out.println(true ^ true);// false --> 1 ^ 1 - 0
		System.out.println(true ^ false);// true --> 1 ^ 0 --> 1
		System.out.println(false ^ true);// true --> 0 * 1 --> 1
		System.out.println(false ^ false);// false --> 0 ^ 0 --> 0

		System.out.println(89 ^ 54);// 111
		System.out.println(121 ^ 56);// 65
		System.out.println(75 ^ 87);// 28
		System.out.println(33 ^ 67);// 98

		System.out.println("Bitwise Xnor**********");
		System.out.println(~89);// -90--> -(n+1)

	}

}
