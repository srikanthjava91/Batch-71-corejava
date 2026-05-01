package com.languagefun.constructors;

class Employee1 {
	int id;
	String name;
	double salary;

	Employee1() {
		this(101);
		System.out.println("Default constructor");
	}

	Employee1(int id) {
		this(id, "Unknown");
		System.out.println("ID constructor");
	}

	Employee1(int id, String name) {
		this(id, name, 30000);
		System.out.println("ID + Name constructor");
	}

	Employee1(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("Full constructor");
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Employee1 e = new Employee1();
		e.display();

		Employee1 e1 = new Employee1(102, "Srikanth", 50000.00);
		e1.display();

		System.out.println("main method ended ");
	}
}
