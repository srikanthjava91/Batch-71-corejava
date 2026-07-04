package com.exceptionhandling;

public class TestExDemo7 {

	int hello() {

		try {
			System.out.println(10/0);
			return 10;
		} catch (Exception e) {
			return 20;
		} finally {
			return 30;
		}

	}

	void main() {
		System.out.println("main method started ");
		System.out.println(hello());
	}

}
