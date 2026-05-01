package com.languagefun.constructors;

class Student1 {
	int id;
	String name;
	int age;

	// Default constructor
	Student1() {
		this(101); // calling parameterized constructor
		System.out.println("Default constructor");
	}

	// Constructor with 1 parameter
	Student1(int id) {
		this(id, "Unknown"); // calling another constructor
		System.out.println("One parameter constructor");
	}

	// Constructor with 2 parameters
	Student1(int id, String name) {
		this(id, name, 20);
		System.out.println("Two parameter constructor");
	}

	// Constructor with 3 parameters
	Student1(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		System.out.println("All parameters constructor");
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		Student1 s = new Student1();
		s.display();
		System.out.println("main method ended !");
	}
}
