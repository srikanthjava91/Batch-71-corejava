package com.accessmodifiers02;

import com.accessmodifers01.TestAccDemo1;

//SUb class or Child class or Derived class
public class TestAccDemo3 extends TestAccDemo1 {

	public static void main(String[] args) {

		TestAccDemo1 t1 = new TestAccDemo1();

//		Access the public data members Outside of the packages
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();

//		 Access the default data outside of the packages ..? is not possible 
//		Even though the class is public, we cannot access default data outside of the packages.
//		System.out.println(t1.a2);
//		System.out.println(t1.name2);
//		t1.method2();

//		If we want to access protected data members, outside of the packages, 
//		we can access through only sub class object reference 
//		System.out.println(t1.a3);
//		System.out.println(t1.name3);
//		t1.method3();

//		We can able to access protected data members outside of the packages of sub classes with sub class object reference only
		TestAccDemo3 t3 = new TestAccDemo3();
		System.out.println(t3.a3);
		System.out.println(t3.name3);
		t3.method3();
	}

}
