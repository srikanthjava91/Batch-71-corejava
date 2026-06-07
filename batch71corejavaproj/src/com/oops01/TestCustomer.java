package com.oops01;

public class TestCustomer {

	public static void main(String[] args) {
		System.out.println("Customer Details : !");

		Customer c1 = new Customer();

//		Modifying the data 
		c1.setName("Srikanth");
		c1.setAge(22);
		c1.setUsername("Java");
		c1.setPassword("JavaIsSimplle@Vcube");

//		Reading the data 
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getUsername());
		System.out.println(c1.getpassword());

//		(Stopping Direct access )
//		Accessing the data directly in outside of the classes is not possible if the data is private 
//		c1.name = "Srikanth";
//		c1.age = 22;
//		c1.username= "java";
//		c1.password= "JavaisSimple";
//		
//		System.out.println(c1.name);
//		System.out.println(c1.age);
//		System.out.println(c1.username);
//		System.out.println(c1.password);

	}

}
