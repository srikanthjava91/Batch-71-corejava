package com.javaintro;

public class Student {
	static Student s1 = new Student();

	// static Blocks
	static {
		System.out.println("Hello static1 ");
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		System.out.println("main method ended !!");
	}

	// instance blocks
	{
		System.out.println("Hello instance ");
		Student s1 = new Student();
	}

}
