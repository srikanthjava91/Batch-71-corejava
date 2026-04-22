package com.languagefun.constructors;

//this, super we can use only in instance area but not in static area, 
//where main method is static so we cannot use this or super here.

//Parent or Super or Base 
class Vehicle {
	String name = "Yamaha";
	String brand = "FZ-S";
}

//Child oe sub or Derived 
public class Bike extends Vehicle {

	String name = "RE";
	String brand = "Classic-300";

	public static void main(String[] args) {

		Bike b = new Bike();
		b.show();
	}

	void show() {
		System.out.println(this.brand);
		System.out.println(this.name);
		System.out.println("****************");
		System.out.println(super.brand);
		System.out.println(super.name);
	}

}
