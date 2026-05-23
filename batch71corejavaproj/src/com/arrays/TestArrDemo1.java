package com.arrays;

//Q) WAP to print 10 student ages using arrays..? 
//CE : Variable must provide either dimension expressions or an array initializer
public class TestArrDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		// Declaration & Creation
		int[] ages = new int[5];
		System.out.println(ages);// Address of the Object Array :[I@2b2fa4f7

		// Initialization
		ages[0] = 21;
		ages[1] = 22;
		ages[2] = 23;
		ages[3] = 21;
		ages[4] = 24;

		// Representation
		for (int i = 0; i < ages.length; i++) {
			if (ages[i] % 2 == 0) {
				System.out.println(ages[i]);
			}
		}

//		for (int age : ages) {
//			if (age % 2 == 0) {
//				System.out.println(age);
//			}
//
//		}

	}

}
