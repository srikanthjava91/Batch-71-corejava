package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to find the Given number is Armstrong or not ..?
//input is : 153= 1^3 + 5^3 + 3^3 --> number 
//output is : true or false --> boolean 
/////An Armstrong number is a number that equals the sum of its digits 
///each raised to the power of the total number of digits.

public class TestLPDemo23 {

	static boolean isArmStrongNumber(int n) {
		boolean status = false;
		int r = 0;
		int sumP = 0;
		int temp = n;
		
		
//		//Finding the count 
//		int n1=n;
		int count = 0;
//		while (n1 > 0) {
//			int r1 = n1 % 10;
//			n1 = n1 / 10;
//			count++;
//		}
		
		String cs = Integer.toString(n);
		count = cs.length();

		while (n > 0) {
			r = n % 10;// 153%10 --> 3, 15%10 --> 5, 1%10 --> 1
			n = n / 10;// 153/10 = 15, 15/10 --> 1, 1/10 --> 0
//			sumP = sumP + (r * r * r);// 0+ 27 + 125, 1= 153
			sumP = (int) (sumP + Math.pow(r, count));
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
		boolean flag = isArmStrongNumber(n);

		if (flag) {
			System.out.println("The Given number is ArmStrong number ");
		} else {
			System.out.println("The Given numnber is Not an Armstrong ");
		}

	}

}
