package com.exceptionhandling;

import java.util.Scanner;

public class TestCustomDemo1 {

	public static void main(String[] args) {
		System.out.println("main mehods started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age");
		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("Congrtualtions !!");
			System.out.println("You are Eligible for Voting & Driving ");
		}else {
			throw new VamsiException("Babu niku inka time undi ra !");
		}
		
		
		System.out.println("main mehods ended ");

	}

}
