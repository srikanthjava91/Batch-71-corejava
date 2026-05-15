package com.logicalstatements.loops;

/// WAP to print Reverse Number of a Given Number ..?
///input : 345 
///output : 543 
import java.util.Scanner;

public class TestLpDemo19 {

	static int findReverseNum(int n) {
		int rev = 0;
		int r = 0;

		while (n > 0) {
			r = n % 10;// 123 % 10 --> 3, 12%10--> 2, 1%10 --> 1
			n = n / 10;// 123/10--> 12 ,12/10-> 1, 1/10 --> 0
			rev = rev * 10 + r;// 3 --> 32 --> 321
		}

		return rev;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		int rev = findReverseNum(n);
		System.out.println("Reverse number of a Given number  : " + rev);
		sc.close();
	}
}
