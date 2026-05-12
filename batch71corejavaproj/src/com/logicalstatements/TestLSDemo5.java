package com.logicalstatements;

import java.util.Scanner;

//WAP to find the Cricketer details based his jersey number ..? 
public class TestLSDemo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Jersey number : ");
		int jno = sc.nextInt();

		switch (jno) {
		case 7:
			System.out.println("Thala for a Reason !!");
			System.out.println("Mahendr Singh Dhoni !!");
			System.out.println("The Cool captain !");
			break;
		case 18:
			System.out.println("King Kohli");
			System.out.println("The most Consistent Player ");
			break;
		case 45:
			System.out.println("Hitman");
			System.out.println("Rohit Sharma");
			System.out.println(" A Talented Batsman ");
			break;
		case 1:
			System.out.println("Lokesh Rahul");
			System.out.println("The Cool Batsman");
			break;
		default:
			System.out.println("Entered Jersey details are not available !!");

		}
		sc.close();

	}
}
