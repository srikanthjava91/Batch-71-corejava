package com.logicalstatements;

import java.util.Scanner;

//WAP to get the details of Vegetables and Fruits info based on category ..? 
public class TestLSDemo9 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Category :");
		String catg = sc.next().toLowerCase();// veg fruits

		switch (catg) {

		case "veg" -> {
			System.out.println("Enter item : ");
			String item = sc.next();

			switch (item) {
			case "tmt" -> System.out.println("Tomato : 1kg 50rs");
			case "brg" -> System.out.println("Brinjal : 1kg 45 rs ");
			case "ptt" -> System.out.println("Potato : 1kg 65 rs");
			case "drm" -> System.out.println("Drumsticks : 10p -> 30 rs");
			default -> System.out.println("Entered Item is not available ");

			}
		}
		case "fruits" -> {
			System.out.println("Enter item : ");
			String item = sc.next();

			switch (item) {
			case "orn" -> System.out.println("Oranage  1kg -> 100 ");
			case "mng" -> System.out.println("Mango  1kg -> 150 ");
			case "bnn" -> System.out.println("Banana  12p -> 50 ");
			case "grp" -> System.out.println("Grapes  1kg -> 100 ");
			default -> System.out.println("Entered Item is not available ");
			}

		}

		}

	}

}
