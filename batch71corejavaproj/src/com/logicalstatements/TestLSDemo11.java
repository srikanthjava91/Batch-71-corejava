package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo11 {

	public static void main(String[] args) {

		Object role = "Developer";
		switch (role) {
		case String s when s.equals("Manager") -> System.out.println("Bonus = 5000");
		case String s when s.equals("Developer") -> System.out.println("Bonus = 3000");
		default -> System.out.println("No Bonus");
		}
	}
}
