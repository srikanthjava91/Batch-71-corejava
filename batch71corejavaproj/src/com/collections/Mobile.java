package com.collections;

public class Mobile implements Comparable<Mobile> {

	String model;
	String brand;
	double price;

	@Override
	public String toString() {
		return "Mobile [model=" + model + ", brand=" + brand + ", price=" + price + "]";
	}

	public Mobile(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public int compareTo(Mobile o) {

//		if (this.price < o.price) {
//			return -1;
//		} else if (this.price > o.price) {
//			return 1;
//		} else {
//			return 0;
//		}

		return -this.brand.compareTo(o.brand);

	}

}
