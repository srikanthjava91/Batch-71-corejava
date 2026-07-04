package com.oops.abstraction;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("Cat sounds like meow meow !!");
	}
	
	@Override
	public void eat() {
		System.out.println("Cat can eat rat !!");
	}
	
	@Override
	public void walk() {
		System.out.println("Cat can walk like cat !!");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

}
