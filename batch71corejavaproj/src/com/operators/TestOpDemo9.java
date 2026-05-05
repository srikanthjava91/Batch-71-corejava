package com.operators;

import java.util.Scanner;

//WAP to find the max number from given numbers ..? 
public class TestOpDemo9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();

		System.out.println("Enter b number : ");
		int b = sc.nextInt();

		int max = (a > b) ? a : b;
		System.out.println("Max number is : " + max);

	}

}
