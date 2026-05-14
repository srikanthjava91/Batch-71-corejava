package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print digit sum of a Given number  ..? 
//input is : 123 
//output is : 6

//input : 567 
//output is : 18 
public class TestLPDemo17 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to proceed :");
		int n = sc.nextInt();// 123
		int sum = 0;
		int r = 0;

		while (n > 0) {
			r = n % 10;// 123% 10 -> 3, 12%10 --> 2, 1%10 --> 1
			n = n / 10;// 123/10 --> 12. 12/10 --> 1, 1/10 --> 0
			sum = sum + r;// 3+2 = 5+1 = 6
		}

		System.out.println("sum : " + sum);

	}

}
