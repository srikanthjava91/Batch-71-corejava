package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print Fibonacci Series..?
//input  -->  10
//output --> 0 1 1 2 3 5 8 13 21 34
public class TesLPDemo12 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to print as a series : ");
		int n = sc.nextInt();// 10

		int n1 = 0;
		int n2 = 1;

		System.out.println(n1 + " " + n2);// 0 1
		for (int i = 1; i <= n; i++) {
			int n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;

		}

	}

}
