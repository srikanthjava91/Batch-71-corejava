package com.arrays;

import java.util.Scanner;

//WAP to read the elements from the console for 2D Arrays..? 
public class TestArrDemo14 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Row size : ");
		int r = sc.nextInt();

		System.out.println("Enter the column size : ");
		int c = sc.nextInt();

		String[][] names = new String[r][c];// 3 2 --> 0 1 2 -- 0 1

		System.out.println("Read the elements from console : ");
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				names[i][j] = sc.next();
			}
		}

		System.out.println("Represent an Array : ");

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.print(names[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("main method ended ");
	}

}
