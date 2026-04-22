package com.languagefun.constructors;

public class Car {

	String model;
	String brand;
	double price;
	String color;

	Car(){
		System.out.println("no arg constructor called !");
	}
	
	public Car(String model, String brand, double price, String color) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public static void main(String[] args) {
		System.out.println("main method strated");

		Car c = new Car("Sonet", "KIA", 1500000.00, "RED");
		c.display();
		
		Car c1 = new Car();
		c1.display();
		
		System.out.println("main method ended");

	}

	void display() {
		System.out.println("****************************");
		System.out.println("Model of the Car : " + model);
		System.out.println("Brand of the Car : " + brand);
		System.out.println("Price of the Car : " + price);
		System.out.println("Color of the car : " + color);
	}

}
