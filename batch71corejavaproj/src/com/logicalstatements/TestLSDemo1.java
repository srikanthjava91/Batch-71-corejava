package com.logicalstatements;

import java.util.Scanner;

//WAP to find the ELigibility for a Voting Based on your age..?
//Whenever the condition is true then only if block will execute otherwise no!!
//Whenever we have only one statement after condition trye then we can use with out {}.
//Without {} will consider only one statement.

public class TestLSDemo1 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age  :");
		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("Congratulations !!");
			System.out.println("You are Eligible for Voting !");
		}

		else {
			System.out.println("Niku inka time undi ra ");
		}

		System.out.println("main method ended ");

	}

}
