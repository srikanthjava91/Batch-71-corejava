package com.languagefun.constructors2;

public class Product {

	String name;
	double price;

	Product() {
		System.out.println("no args constructor called from Product");
	}

	Product(String name, double price) {
		System.out.println("parameterized constructor called from Product");
		this.price = price;
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println("main method called from Parent !!");
	}
}

class Laptop extends Product {

	public Laptop(String name, double price) {
		super(name, price);
//		this();
		System.out.println("Laptop parameterized  constructor called !");

	}

	public Laptop() {
		 System.out.println("Laptop no arg  constructor called !");
	}
	
	public static void main(String[] args) {
		System.out.println("main method strated from Child !!");

		Laptop l1 = new Laptop("Dell", 75000.00);
		l1.show();

		System.out.println("main method ended from Child !!");
	}

	void show() {
		System.out.println("Name of the product  : " + name);
		System.out.println("Price of the Product : " + price);
	}

}
