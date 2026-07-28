package com.collections;

public class Laptop {

	String model;
	String brand;
	double price;

	@Override
	public String toString() {
		return "Mobile [model=" + model + ", brand=" + brand + ", price=" + price + "]";
	}

	public Laptop(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

}
