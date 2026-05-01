package com.languagefun;

public class TestMainDemo1 {

	static String name = "Srikanth";

	static {
		System.out.println("static block called ");
	}

	{
		System.out.println("instance block called ");
	}

	public static void main(String[] args) {
		System.out.println("main method strated from with args ");
		System.out.println(TestMainDemo1.name.length());
		System.out.println("main method ended ");
	}

	void main() {
		System.out.println("main method strated from no args ");
		System.out.println(TestMainDemo1.name.length());
		System.out.println("main method ended ");
	}
}
