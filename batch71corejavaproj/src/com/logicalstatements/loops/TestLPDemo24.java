package com.logicalstatements.loops;

import java.util.Scanner;

//     256 128 64 32 16 8 4 2 1
//------------------------------------
//                      1 0 1 0   --> input is 10 
//					 1  1 0 0 0   --> input is 24 
// 				1 1  0  0 1 0 0   --> input is 100 
//                1  0  1 1 0 1   --> input is 45
//                   1  0 0 1 0   --> input is 18

//Q) Convert Decimal number to Binary number ..? 
//input is : 10
//output : String like : 1010 
public class TestLPDemo24 {

	static void decimalToBinary(int n) {
		int r = 0;
		String bn = "";

		while (n != 0) {
			r = n % 2;// 18%2=0, 9%2=1, 4%2=0, 2%2=0, 1%2= 1
			n = n / 2;// 18/2=9, 9/2=4, 4/2 =2, 2/2 =1, 1/2=0
			bn = r + " " + bn;// 10010
		}

		System.out.println("Binary Number of a Given number is  :" + bn);

	}

	public static void main(String[] args) {

		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();

		decimalToBinary(n);

		System.out.println("main method started ");

	}

}
