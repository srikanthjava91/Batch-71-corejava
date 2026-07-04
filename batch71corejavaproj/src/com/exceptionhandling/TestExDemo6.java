package com.exceptionhandling;

public class TestExDemo6 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		try {
			System.out.println("in try ");
			int a = 10 / 2;
			System.out.println("Hello");
			String s = "Sri";
			System.out.println(s.charAt(a));
			System.out.println("Good morning");

		} catch (ArithmeticException | StringIndexOutOfBoundsException | NullPointerException | ArrayIndexOutOfBoundsException s) {
			System.err.println("in catch of ex1 ");
			System.err.println(s.getMessage());
		} catch (Exception ne) {
			System.err.println("in catch of E ");
		}

		finally {
			System.out.println("in finally ");
		}

		System.out.println("main method ended ");
	}
}
