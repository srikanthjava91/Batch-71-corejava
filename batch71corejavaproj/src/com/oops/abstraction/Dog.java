package com.oops.abstraction;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Dog sounds like Bow bow !!");
	}

	@Override
	public void eat() {
		System.out.println("Dog eats only Non-veg !!");
	}

	@Override
	public void walk() {
		System.out.println("Dog walks and Run like anything !");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub

	}

	@Override
	public String info() {
		return "Dog info";
	}

	public static void breath() {
		System.out.println("dog breath method called !");
	}

}
