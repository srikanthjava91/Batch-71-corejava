package com.accessmodifers01;

//If we use private for a class, we will get below CE.
//Illegal modifier for the class TestAccDemo1; 
//only <default>, public, strictfp, abstract & final are permitted

//Note : <default> means undefined, 
//whenever we are not giving any access modifiers for class or 
//data members then will consider that as a <default> or undefined

//Illegal modifier for the interface In1; 
//only <default>, public, strictfp & abstract are permitted

//Inner classes : A class inside the class will consider as Inner classes.
//For providing temporary solutions for Outer classes we need to use Inner classes.
interface In1 {

}

public class TestAccDemo1 {

	static {
		System.out.println("static block called");
	}

	{
		System.out.println("instanec block called ");
	}

//	private Data members 
	private int a1 = 18;
	private String name1 = "Virat";

//	No arg constructor with the scope of <default>
//	TestAccDemo1(){
//		System.out.println("TestAccDemo1 constructor called !");
//	}

//	No arg constructor with the scope of private
//	If the constructor is private, we cannot create Objects outside of the classes.
//	Whenever, we want to create Only one object for multiple Requests 
//	then we can go for the concept called Singleton Design pattern, 
//	If we want to achieve this pattern we must need to keep your classes constructor as private
//	private TestAccDemo1() {
//		System.out.println("TestAccDemo1 constructor called !");
//	}

	private void method1() {
		System.out.println("method1 called ");
	}

	// default data members
	int a2 = 7;
	String name2 = "Dhoni";

	void method2() {
		System.out.println("method2 called ");
	}

//	 protected data members
	protected int a3 = 45;
	protected String name3 = "Rohit";

	protected void method3() {
		System.out.println("method3 called ");
	}

	// public data members

	public int a4 = 1;
	public String name4 = "Rahul";

	public void method4() {
		System.out.println("method4 called ");
	}

	public TestAccDemo1() {

	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		// Creating an Object of TestAccDemo1
		TestAccDemo1 t1 = new TestAccDemo1();

//		Accessing the private data Within the class.
		System.out.println(t1.a1);
		System.out.println(t1.name1);
		t1.method1();

//		Access the default data members within the class.
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();

//		Access the protected data members within the class.
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();

//		Access the public data members within the class.
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();

	}

	// Inner classes
	private class TestInc1 {

	}

}
