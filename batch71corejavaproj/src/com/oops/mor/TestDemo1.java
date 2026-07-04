package com.oops.mor;

public class TestDemo1 {

	void main(String[] args) {
		System.out.println("main method started from TestDemo1");
		hello();
		
		Loan l = new Loan();
		System.out.println(l.roi());
	}

	public static void hello() {
		System.out.println("Hello ");
	}

}

class TestDemo2 extends TestDemo1 {

//	If we use @Overrdie for thos method we will get CE : 
//	The method main(String[]) of type TestDemo2 must override or implement a supertype method
	@Override
	void main(String[] args) {
		System.out.println("main method started from TestDemo2");
		hello();
	}

//	@Override
	public static void hello() {
		System.out.println("Hello Good evening ");
	}
}
