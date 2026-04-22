package com.languagefun.methods;

//To hide the implementation we go with abstract methods.
interface In1 {
	public abstract void method1();
}

abstract class TestAbs {
	public abstract void method2();
}

public class TestMethodsDemo12 {

	int a = 10, b = 20;

//	The abstract method method1 in type TestMethodsDemo12 can only be defined by an abstract class
//	abstract void method1();

	static String hello() {
		return getName();
	}

	static String getName() {
		return "Vishwa";
	}

	static Object[] getTotalPrice(int qty, double price, String name) {

		Object[] data = new Object[2];// 0 1
		double totalPrice = qty * price;
		String productName = name;

		data[0] = totalPrice;
		data[1] = productName;

		return data;
	}

	static void prodctInfo(Object[] data) {
		System.out.println("ALl products total price is : " + data[0]);
		System.out.println("Product name is : " + data[1]);

	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Object[] data = getTotalPrice(5, 20000, "Mobile");

		prodctInfo(data);
		System.out.println(hello());

		System.out.println("main method ended ");
	}

}
