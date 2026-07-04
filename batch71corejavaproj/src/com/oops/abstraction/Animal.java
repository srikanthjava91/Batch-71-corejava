package com.oops.abstraction;

public interface Animal {

	public static final String ORGANISATION_NAME = "VCUBE";

	public static void main(String[] args) {
		System.out.println("Hello Chanukya !!");
	}

//	Abstract methods do not specify a body
	public abstract void sound();

	public abstract void eat();

	public abstract void walk();

	public abstract void sleep();

//	Why default methods .? 
//	To avoid backward compatibility problems from Classes and 
//	And provide utility Behavior for all classes we used default methods.

//	Can we Override default methods ..? Yes 
	public default void jump() {

		System.out.println("Some Animals can Jump !");
		hello();

	}

	public default String info() {
		hello();
		return "Animal info ";

	}

//	Why static methods..? 
//	To provide constant utility behavior from interface itself and 
//	No other class should not override the behavior from interface the we can go for static method
//	anyway we cannot override static methods if we use same method in child will consider as method Hiding.

	static void breath() {
		System.out.println("Every animal breaths to survival !!");
	}

//	 1.9 onwards introduced private methods 
//	to avoid duplicate code from default methods.
	private void hello() {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}

}
