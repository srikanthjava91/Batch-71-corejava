package com.oops.abstraction;

public class TestAbsDemo1 {

	public static void main(String[] args) {

		
//		TestAbs t = new TestAbs();//Cannot instantiate the type TestAbs
		
		TestAbs t1 = new Test1();
		t1.method1();
		t1.method2();
		t1.method3();
		t1.welcome();

		TestAbs t2 = new Test2();
		t2.method3();
		t2.method6();

		TestAbs t3 = new Test3();
		t3.method4();
		t3.method5();

	}

}
