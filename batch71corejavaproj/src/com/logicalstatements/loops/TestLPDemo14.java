package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print Prime numbers from a Given Range ..? 
public class TestLPDemo14 {

	static boolean isPrime(int n) {
		boolean flag = true;

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}

		return flag;

	}

	public static void main(String[] args) {
		System.out.println("main method started !");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number up to where you want to from 0 ?");
		int n = sc.nextInt();// 100
		int count = 0;

		for (int i = 0; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count++;
				System.out.println("-" + count);
			}
		}

	}

}
