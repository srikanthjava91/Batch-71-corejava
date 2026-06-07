package com.accessmodifers01;

public class TestAccDemo2 {

	public static void main(String[] args) {

		TestAccDemo1 t1 = new TestAccDemo1();
//		Access the default data members outside of  the classes possible within the same package.
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();

//		Access the protected data members outside of the class.
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();

//		Access the public data members outside the class.
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();

//		The constructor TestAccDemo1() is not visible
//		TestAccDemo1 t1 = new TestAccDemo1();

//		Accessing the data outside of  the class by using Object Reference variable is not possible.
//		With private keyword, we are stopping the direct access.
//		NOte : So, private data we cannot access outside of the classes. 
//		System.out.println(t1.a1);// The field TestAccDemo1.a1 is not visible
//		System.out.println(t1.name1);// The field TestAccDemo1.name1 is not visible
//		t1.method1();//The method method1() from the type TestAccDemo1 is not visible

	}

}
