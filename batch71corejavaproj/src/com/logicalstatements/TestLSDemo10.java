package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo10 {

	static String weekInfo(int day) {

		return switch (day) {
		case 1 -> "Sunday";
		case 2 -> "Monday";
		case 3 -> "Tuesday";
		case 4 -> "Wednesday";
		case 5 -> "Thursday";
		case 6 -> "Friday";
		case 7 -> "Saturday";
		default -> "unknown";
		};

	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to give Week info : ");
		int num = sc.nextInt();
		System.out.println(weekInfo(num));
		sc.close();
	}
}
