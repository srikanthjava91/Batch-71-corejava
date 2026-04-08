package com.languagefun;

public class TestLiteralsDemo2 {

	public static void main(String[] args) {
		float f1 = 100;// int --> float --> valid--> implicit type casting
//		float f2 = 123.0;//invalid //Type mismatch: cannot convert from double to float
		float f3 = 123.5F;// valid

		float f4 = 0123;
//		float f5 = 0123.5;//invalid
		float f6 = 0123.5F;

		float f7 = 123F;
		float f8 = 0123F;
		float f9 = 0x123;
		float f10 = 0x123F;
//		float f11  = 0x123.5F;//Invalid hex literal number

		double d1 = 123F;
		double d2 = 123.5F;
		double d3 = 123.9;
		double d4 = 123.5D;
		double d5 = 0x123F;

		System.out.println(f1);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f6);// 123.5
		System.out.println(f7);// 123.0
		System.out.println(f8);// 123.0
		System.out.println(f9);// 291.0
		System.out.println(f10);

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);

	}
}
