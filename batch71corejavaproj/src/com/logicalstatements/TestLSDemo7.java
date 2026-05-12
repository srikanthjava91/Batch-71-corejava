package com.logicalstatements;

import java.util.Scanner;

//WAP to find T-Shirt Description based on the T-Shirt size.?
public class TestLSDemo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a T-shirt size : ");
		int t_size = sc.nextInt();

		switch (t_size) {

		case 38 -> {
			System.out.println("The T-shirt is Small");
			System.out.println("The T-shirt is Small");
		}
		case 40 -> 
			System.out.println("The T-shirt is Medium");
		case 42 -> 
			System.out.println("The T-shirt is Large");
		case 44 -> 
			System.out.println("The T-shirt is X-Large");
		default -> 
			System.out.println("The Entered T-shirt is Out of stock");

		}

	}
}
