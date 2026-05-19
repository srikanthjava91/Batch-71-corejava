package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLpDemo27 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		String yn = "";

		do {
			System.out.println("Enter a number 1");
			int n1 = sc.nextInt();

			System.out.println("Enter a number 2");
			int n2 = sc.nextInt();

			System.out.println("Enter a Symbol ");
			String symb = sc.next();

			switch (symb) {
			case "+" -> System.out.println(n1 + n2);
			case "-" -> System.out.println(n1 - n2);
			case "*" -> System.out.println(n1 * n2);
			case "/" -> System.out.println(n1 / n2);
			case "%" -> System.out.println(n1 % n2);
			default -> System.out.println("Unknown symbol to proceed ");
			}

			System.out.println("Click Y to proceed N for exit");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("Y"));

	}

}
