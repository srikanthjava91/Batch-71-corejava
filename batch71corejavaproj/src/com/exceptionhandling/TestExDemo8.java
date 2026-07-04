package com.exceptionhandling;

public class TestExDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		try {
			System.out.println("int try !!");
			
//			Initiates the Runtime##shutdown shutdown sequence of the Java Virtual Machine
//			The argument serves as a status code. 
//			By convention, a nonzero status code indicates abnormal termination.
			System.exit(0);
		} catch (Exception e) {
			System.out.println("in catch !!");
		} finally {
			System.out.println("in finally !!");
		}
		
		System.out.println("main method ended ");
	}
}
