package com.logicalstatements.loops;

///WAP to print digit sum of a Given number  ..? 
import java.util.Scanner;

public class TestLPDemo18 {

	static int findDigitSum(int n) {
		int sum = 0;
		int r = 0;

		while (n > 0) {
			r = n % 10;// 3 2 1
			n = n / 10;
			sum = sum + r;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to proceed :");
		int n = sc.nextInt();// 123
//		 calling findDigitSum
		int digitSum = findDigitSum(n);
		System.out.println("DIgit SUm : " + digitSum);
		sc.close();
	}
}
