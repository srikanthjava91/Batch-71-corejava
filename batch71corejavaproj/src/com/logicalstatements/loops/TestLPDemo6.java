package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print Multiplication Table..?
//input : number : 8
//output : 8 X 1 = 8 
//output : 8 X 2 = 16 
//output : 8 X 3 = 24 
//output : 8 X 4 = 32 
//output : 8 X 5 = 40
//--------------------
//-------------------
//output : 8 X 20 = 160
public class TestLPDemo6 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number for which table ro proceed: ");
		int n = sc.nextInt();
		System.out.println("Please enter a number for up to where you want print ");
		int n1 = sc.nextInt();

		for (int i = 1; i <= n1; i++) {
			System.out.println(n + " X " + i + "= " + (n * i));
		}

	}

}
