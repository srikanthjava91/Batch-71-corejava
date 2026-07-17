package com.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;;

public class TestExDemo13 {
	
	static int value() {
        int x = 5;
        try {
            return x;
        } finally {
            x = 20;
        }
    }

	public static void main(String[] args) throws IOException, FileNotFoundException, InterruptedException {

		System.out.println("main method started ");
		System.out.println(value());
		

//		try {
//			FileReader fr = new FileReader("abc.txt");
//		} catch (ArithmeticException e) {
//			System.out.println("Arithmetic");
//		}

//		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test\\Hello.txt");

//		try (FileReader fr = new FileReader(f)) {
//
//			int i = fr.read();// Reads a single character.
//
//			while (i != -1) {
//				System.out.print((char) i);
//				Thread.sleep(500);
//				i = fr.read();
//			}
//		}
	}
}
