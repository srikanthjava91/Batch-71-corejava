package com.languagefun.methods;

import java.util.Scanner;

//3) with return type + No arguments 
public class TestMethodsDemo6 {

	static Scanner sc = new Scanner(System.in);

	static double getEmpSalInfo() {
		System.out.println("Enter salary ");
		double sal = sc.nextDouble();// 5000
		return sal;
	}

	static double getBonus() {
		System.out.println("Enter Bonus ");
		double bonus = sc.nextDouble();// 1000
		return bonus;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		double salary = getEmpSalInfo();
		double bonus = getBonus();

		System.out.println("Total Salary is : " + (salary + bonus));
		System.out.println("main method ended ");
	}

}
