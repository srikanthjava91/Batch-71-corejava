package com.oops.abstraction;

//interfaces providing multiple Inheritance because we have unique implementation in Implemented class
interface Interf1 {
	void method1();

	void method2();

	default void method4() {
		System.out.println("method4 info ");
	}
}

interface Interf2 {
	void method2();

	void method3();

	default void method4() {
		System.out.println("method4 info ");
	}

}

interface In3 extends Interf2, Interf1 {
	@Override
	default void method4() {
		System.out.println("method4 info from In3");
	}
}

class TestIn3Impl implements In3 {

	@Override
	public void method1() {
		System.out.println("method1 called ");

	}

	@Override
	public void method2() {
		System.out.println("method2 called ");
	}

	@Override
	public void method3() {
		System.out.println("method3 called ");
	}

}

public class TestAbsDemo3 {

	public static void main(String[] args) {

		Interf2 t = new TestIn3Impl();
//		t.method1();
		t.method2();
		t.method3();
		t.method4();

	}

}
