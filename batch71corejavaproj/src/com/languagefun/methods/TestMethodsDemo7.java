package com.languagefun.methods;

import java.util.Scanner;

public class TestMethodsDemo7 {

	static void getAge(int age) {
		System.out.println(age);
	}

	static void getName(String name) {
		System.out.println(name);
	}

	static void getSalary(double sal) {
		System.out.println(sal);
	}

	public static void main(String[] args) {
		System.out.println("main method strated ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		System.out.println("Enter your name : ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.println("Enter your salary : ");
		double salary = sc.nextDouble();

		getAge(age);
		getName(name);
		getSalary(salary);

		sc.close();
		System.out.println("main method ended ");
	}
}
