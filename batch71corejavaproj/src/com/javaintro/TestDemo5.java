package com.javaintro;

public class TestDemo5 {

//	TestDemo5 t = new TestDemo5();

	int x = 100;

	void method1() {
		method2();
		System.out.println("method1 called !!");
	}

	void method2() {
		method3();
		System.out.println("method2 called !!");
	}

	void method3() {
		method4();
		System.out.println("method3 called !!");
	}

	void method4() {
//		TestDemo5 t = new TestDemo5();

		System.out.println("method4 called !!");
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {

		System.out.println("main method started!!");

		System.out.println(Thread.currentThread());

		TestDemo5 t = new TestDemo5();
		t.method1();
//		System.out.println(t.x);

		System.out.println("main method ended!!");
	}

}
