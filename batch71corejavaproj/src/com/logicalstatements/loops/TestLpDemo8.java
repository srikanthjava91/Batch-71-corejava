package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print Factors or Divisors of a Given number ..?  
//A factor in mathematics is a number or algebraic expression 
//that divides another number or expression exactly, leaving no remainder.
//input : 6 
//output : 1 2 3 6 

//input : 12 
//output : 1 2 3 4 6 12 

//input : 28
//output : 1 2 4 7 14  28

public class TestLpDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to proceed : ");
		int n = sc.nextInt();

		// 6%1 ==0 -> true
		// 6%2 ==0 -> true
		// 6%3 ==0 -> true
		// 6%4 ==2 -> false
		// 6%5 ==1 -> false
		// 6%6 ==0 --> true
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(n);

	}

}
