package com.languagefun;

class Address {
	String flat = "401";
	String street = "KPHB";
	String city = "HYD";

}

class Student {

	int sid = 101;
	String name = "Srikanth";
	int age = 21;
	Address address = new Address();

}

public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student();
		System.out.println(s1.sid);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.address.flat);
		System.out.println(s1.address.street);
		System.out.println(s1.address.city);

	}

}
