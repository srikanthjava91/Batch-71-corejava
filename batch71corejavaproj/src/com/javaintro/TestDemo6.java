package com.javaintro;

public class TestDemo6 {

	void method1() {
		System.out.println("method1 called !");
	}
	
	//Native methods do not specify a body
	native void method2();

	public static void main(String[] args) {

		System.out.println("main method started ");
		TestDemo6 t = new TestDemo6();
		t.method1();
		t.method2();

	}

}
