package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class TestExDemo12 {

	public static void main(String[] args) throws IOException {

		System.out.println("main method started ");

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test\\Hello.txt");

		f.createNewFile();////Unhandled exception type IOException
		// java.io.IOException: The system cannot find the path specified

		System.out.println("main method ended ");
		System.out.println("main method ended ");
		System.out.println("main method ended ");
	}

}
