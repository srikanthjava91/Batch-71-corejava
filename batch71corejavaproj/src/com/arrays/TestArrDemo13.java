package com.arrays;

//WAP to represent 3 rows and 3 columns of String content.
public class TestArrDemo13 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		String[][] names = new String[3][3]; // 0 1 2 --> 0 1 2

		names[0][0] = "Tilak";
		names[0][1] = "Rohit";
		names[0][2] = "Hardhik";

		names[1][0] = "Sanju";
		names[1][1] = "Dhoni";
		names[1][2] = "Ruthuraj";

		names[2][0] = "Kohli";
		names[2][1] = "Krunal";
		names[2][2] = "Patidhar";

		for (String[] n1 : names) {
			for (String n : n1) {
				System.out.print(n + " | ");
			}
			System.out.println();

		}

	}

}
