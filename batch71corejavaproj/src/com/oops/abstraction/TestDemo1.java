package com.oops.abstraction;

interface A {
	void method1();

	default void method2() {
		System.out.println("method2 called from interface A ");
	}

}

class B implements A {

	@Override
	public void method1() {
		System.out.println("methoda called from B ");
	}

	public void method2() {
		System.out.println("method2 called From B ");
	}

}

class C extends B implements A {
	
	@Override
	public void method2() {
		System.out.println("method2 called From C ");
	}
	
}

public class TestDemo1 {

	public static void main(String[] args) {

		A c = new C();
		c.method2();

	}

}
