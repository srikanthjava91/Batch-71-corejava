package com.oops.mor;

public abstract class TestDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started from TestDemo3 ");
	}

	// Abstract methods do not specify a body
	abstract void method1();

}

class TestDemo4 extends TestDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started from TestDemo4 ");
		TestDemo4 t = new TestDemo4();
		t.method1();

	}

	@Override
	void method1() {
		System.out.println("Hello method1 !!");

	}

}


abstract class TestDemo5 extends TestDemo4{
	public static void main(String[] args) {
		System.out.println("main method started from TestDemo5 ");
	}
	
	@Override
	abstract void method1();

}
