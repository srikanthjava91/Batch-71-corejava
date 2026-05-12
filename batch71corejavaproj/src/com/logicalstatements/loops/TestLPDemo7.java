package com.logicalstatements.loops;

import java.util.Scanner;

//9 X 1 = 9 
//9 X 2 = 18 
//9 X 3 = 27
public class TestLPDemo7 {

	static void multiplicationTable(int n, int n1) {
		for (int i = 1; i <= n1; i++) {
			System.out.println(n + " X " + i + " = " + (n * i));
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Which number you want to proceed with ?");
		int n = sc.nextInt();

		System.out.println("Up to where you want to print ..?");
		int n1 = sc.nextInt();

		multiplicationTable(n, n1);

		System.out.println("main method ended ");

	}

}
