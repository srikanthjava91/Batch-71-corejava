package com.languagefun.constructors;

public class Customer {

	int cid;
	String cname;
	int age;
	long phone;

	// no arg constructor
	Customer() {
		System.out.println("no arg constructor called ");
	}

	// Parameterized constructor
	Customer(int cid, String cname, int age, long phone) {
		System.out.println("Parameterized constructor called ");
		this.cid = cid;
		this.cname = cname;
		this.age = age;
		this.phone = phone;
	}

	public static void main(String[] args) {
		System.out.println("main method strated ");

		Customer c1 = new Customer(7, "Dhoni", 42, 7777777777L);
		c1.show();

		Customer c2 = new Customer(18, "Kohli", 37, 8181818181L);
		c2.show();

		Customer c3 = new Customer(45, "Rohit", 38, 9454545454L);
		c3.show();

		Customer c4 = new Customer();
		System.out.println(c4.cid);
		System.out.println(c4.cname);

		System.out.println("main method ended ");

	}

	void show() {
		System.out.println("****************************");
		System.out.println("Customer ID : " + cid);
		System.out.println("Customer Name " + cname);
		System.out.println("Customer AGe : " + age);
		System.out.println("Phone : " + phone);
	}

}
