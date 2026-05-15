package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to find the Given number is Armstrong or not ..? 
///An Armstrong number is a number that equals the sum of its digits 
///each raised to the power of the total number of digits.
public class TestLPDemo21 {

	static boolean isArmStrongNumber(int n) {
		boolean status = false;
		int r = 0;
		int sumP = 0;
		int temp = n;

		String nStr = Integer.toString(n);
		int nLen  = nStr.length();

		// 123 --> 153
		while (n > 0) {
			r = n % 10;
			n = n / 10;
//			sumP = sumP + (r * r * r);//
			sumP = (int) (sumP + Math.pow(r, nLen));

		}

		if (sumP == temp) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		boolean status = isArmStrongNumber(n);

		if (status) {
			System.out.println("The Given number is Armstrong number ");
		} else {
			System.out.println("The Given number is not an Armstrong number ");
		}

	}
}
