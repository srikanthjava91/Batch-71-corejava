package com.operators;

import java.util.Scanner;

//WAP to find the Eligibility of the User for Driving based on the age ..? 
public class TestOpDemo10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		String eligibility = (age > 18) ? "Yes Eligible for Driving " : "NOt Eligible for Driving";
		System.out.println(eligibility);
		sc.close();
	}
}
