package com.oops.abstraction;

public class Monkey implements Animal {

	@Override
	public void sound() {
		System.out.println("Quack kich kich !!!");
	}

	@Override
	public void eat() {
		System.out.println("Monkey eats mosly eat fruits like Banana !!");
	}

	@Override
	public void walk() {
		System.out.println("Monkey can walks and also Jumps !");
	}

	@Override
	public void sleep() {
		System.out.println("Almost SImlir to Humans ");
	}

	@Override
	public void jump() {
		System.out.println("Monkey can Jump like anything when it see Trees ");
	}

}
