package com.exceptionhandling;

public class TestExDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		try {
			System.out.println("In try1 ");

			try {
				System.out.println("In try2");
				System.out.println(10 / 0);
			} catch (Exception e) {
				System.out.println("In catch 2");
				System.out.println(10 / 0);
			} finally {
				System.out.println("in finally 2");
			}

		} catch (Exception e) {
			System.out.println("catch 1");
			try {
				System.out.println("in try");
				System.out.println(10 / 0);
			}catch(Exception e1) {
				System.out.println("in catch 3");
			}
		} finally {
			System.out.println("finally1 ");
			System.out.println("catch 4");
			try {
				System.out.println("in try4");
				System.out.println(10 / 0);
			}catch(Exception e1) {
				System.out.println("in catch 4");
			}
		}

		System.out.println("main method ended ");
	}

}
