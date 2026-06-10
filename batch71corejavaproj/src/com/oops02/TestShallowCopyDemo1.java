package com.oops02;

class Student implements Cloneable {
	int id;
	String name;
	Address address;

	@Override
	protected Object clone()  throws CloneNotSupportedException {
		return super.clone();
	}

	public Student(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

}

class Address {
	String city;

	public Address(String city) {
		this.city = city;
	}

}

//Driver class 
public class TestShallowCopyDemo1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main method started !");

		Address add = new Address("Hyderabad");
		Student s1 = new Student(101, "Sekhar", add);

		System.out.println("Student ID : " + s1.id);//101
		System.out.println("Student Name : " + s1.name);//sekhar
		System.out.println("Student Address :" + s1.address.city);//hyd
		System.out.println("*******************************************");

		Student s2 = (Student) s1.clone();
		System.out.println("Student ID : " + s2.id);//101
		System.out.println("Student Name : " + s2.name);//Sekhar
		System.out.println("Student Address :" + s2.address.city);//hyd
		System.out.println("*******************************************");

		s2.name = "Srikanth";
		s2.address.city = "Banglore";
		System.out.println("Student ID : " + s2.id);// 101
		System.out.println("Student Name : " + s2.name);// Srikanth
		System.out.println("Student Address :" + s2.address.city);// Bangalore
		System.out.println("*******************************************");
		
		
		System.out.println("Student ID : " + s1.id);//101
		System.out.println("Student Name : " + s1.name);//Sekhar
		System.out.println("Student Address :" + s1.address.city);//Bangalore 
		System.out.println("*******************************************");
		

	}

}
