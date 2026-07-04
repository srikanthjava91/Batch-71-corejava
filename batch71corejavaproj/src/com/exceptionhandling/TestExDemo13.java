package com.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;;

public class TestExDemo13  {

	public static void main(String[] args) throws IOException, FileNotFoundException, InterruptedException {

		System.out.println("main method started ");
		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test\\Hello.txt");
		FileReader fr = new FileReader(f);

		int i = fr.read();// Reads a single character.

		while (i != -1) {
			System.out.print((char) i);
			Thread.sleep(500);
			i = fr.read();
		}

	}

}
