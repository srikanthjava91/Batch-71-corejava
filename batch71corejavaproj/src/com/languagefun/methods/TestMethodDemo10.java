package com.languagefun.methods;

class Student {
	public static void main(String[] args) {
		System.out.println("main method strated from Student ");
	}
}

public class TestMethodDemo10 {

	void hello() {
		System.out.println("Hello method called ");
	}

	public static void main(String[] args) {
		System.out.println("main method strated from TestMethodDemo10 ");

		String[] names = { "Srikanth", "Vishwanth", "Ramesh" };
		Student.main(names);
		Student.main(names);

		TestMethodDemo10 t = new TestMethodDemo10();
		t.hello();
	}
}
