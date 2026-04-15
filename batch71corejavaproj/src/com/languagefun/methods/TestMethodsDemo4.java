package com.languagefun.methods;

//byte short int long float double 
//char --> int 
//While passing int value to char method is not working But char value we can send for int.
public class TestMethodsDemo4 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		getName("Srikanth");
		getName("Surya");
		method1('A');
		method1('C');
		method2('A');
		method2(100);
//		getName('s');/The method getName(String) in the type TestMethodsDemo4 is not applicable for the arguments (char)
	}

	static void getName(String name) {
		System.out.println("Good Morning Mr. :" + name);
	}

	static void method1(char c) {
		System.out.println(c);
	}

	static void method2(int c) {
		System.out.println(c);
	}

}
