package com.oops.mor;

import java.io.IOError;
import java.io.IOException;

//RBI Guidelines  
public class Loan {

	private void hello() {
		System.out.println("Hello loan ");
	}
	
	public void welcome() throws IOException{
		System.out.println("Welcome to MOR with EX handling !!");
	}

	protected Object helloUser(String message) {
		message = "Welcome to Loan Banking !";
		return message;
	}

	public Number basicCibilInfo() {
		return 600;
	}

	final double roi() {
		return 10.5;
	}

	public static void main(String[] args) {

	}
}
