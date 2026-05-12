package com.logicalstatements;

import java.util.Scanner;

//WAP to print Weekday's Description Based on Week..?
public class TestLSDemo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Week day info : ");
		String week = sc.next().toUpperCase();

		switch (week) {
		case "MON" -> System.out.println("Mondays are always Lazy days ");
		case "TUE", "WED", "THU" -> System.out.println("These days are Routine days");
		case "FRI" -> System.out.println("Weekend mode started ");
		case "SAT", "SUN" -> System.out.println("Holidays and Entertainment days");
		default -> System.out.println("ENtered Week infonot available !!");
		}

		sc.close();
	}

}
