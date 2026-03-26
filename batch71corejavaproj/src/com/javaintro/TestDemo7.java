package com.javaintro;

class Customer {
	int a = 10;
	String name = "Srikanth";

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called !");
	}
}

public class TestDemo7 {

	public static void main(String[] args) {

		Customer c1 = new Customer();
		Customer c2 = new Customer();
//		System.out.println(c1);// Address of the Object : 7ad041f3 --> 5kb
//		System.out.println(c2);// 251a69d7 --> 5kb

//		c1 = null;
//		c2 = null;

		System.gc();// this method requesting JVM to Process Garbage Collector(JVM may Ignore)

		System.out.println(c1);
		System.out.println(c2);
		Customer c3 = new Customer();
		System.out.println(c3);

	}

}
