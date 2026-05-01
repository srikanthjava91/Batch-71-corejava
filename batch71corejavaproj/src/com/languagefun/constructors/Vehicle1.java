package com.languagefun.constructors;

public class Vehicle1 {

	Vehicle1() {
		System.out.println("Vehicle1 constructor called ");
	}

	public static void main(String[] args) {
		System.out.println("main method strated from Vehicle1 class ");

		System.out.println("main method ended from Vehicle1 class ");
	}
}

class Bike1 extends Vehicle1 {

	Bike1() {
		
		System.out.println("Bike1 constructor called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Bike1 class ");

		Bike1 b1 = new Bike1();

		System.out.println("main method ended from Bike1 class ");
	}

}
