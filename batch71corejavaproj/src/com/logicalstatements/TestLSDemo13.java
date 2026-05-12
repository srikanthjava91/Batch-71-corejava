package com.logicalstatements;

public class TestLSDemo13 {

	public static void main(String[] args) {

		int percentage = 67;

		String grade = switch (percentage / 10) {

		case 10, 9 -> "Grade A";

		case 8, 7 -> {
			System.out.println("Good Performance");
			yield "Grade B";
		}

		case 6 -> {
			System.out.println("Average");
			yield "Grade C";
		}

		case 5, 4, 3 -> "Grade D";

		default -> "Fail";
		};

		System.out.println("Result : " + grade);
	}
}
