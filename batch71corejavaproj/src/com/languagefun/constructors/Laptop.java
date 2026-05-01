package com.languagefun.constructors;

public class Laptop {

	String model;
	String brand;
	double price;
	String color;

	Laptop() {
		this("unknown", "unknown");
		color = "unknown";
		price = 0;
	}

	Laptop(String model, String brand) {
		this(model, brand, 0.0);
	}

	Laptop(String model, String brand, double price) {
		this(model, brand, price, "unknown");
	}

	Laptop(String model, String brand, double price, String color) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;

	}

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Laptop l1 = new Laptop();
		l1.display();

		Laptop l2 = new Laptop("Intel Graphics", "DELL");
		l2.display();

		Laptop l3 = new Laptop("Intel ", "DELL", 70000.00);
		l3.display();
//		
		Laptop l4 = new Laptop("Thinkpad ", "Lenovo", 85000.00,"Black");
		l4.display();
		
		System.out.println("main method ended ");
	}

	void display() {
		System.out.println("Laptop Model : " + model);
		System.out.println("Laptop Brand : " + brand);
		System.out.println("Laptop Price : " + price);
		System.out.println("Laptop Color : " + color);
		System.out.println("****************************");
	}

}
