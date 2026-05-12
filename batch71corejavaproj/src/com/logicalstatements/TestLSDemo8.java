package com.logicalstatements;

import java.util.Scanner;

//WAP to print the result based on the symbol.
//Like if my symbol is + --> addition 
//Like if my symbol is - --> subtraction 
///Cannot switch on a value of type double. 
///Only convertible int values, strings or enum variables are permitted
public class TestLSDemo8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("main method started ");
		System.out.println("Calculation process : ");
		
		String yn = "";
		
		do {
			System.out.println("Enter a Number-1");
			int num1 = sc.nextInt();
			System.out.println("Enter a Number-2");
			int num2 = sc.nextInt();

			System.out.println("Enter a symbol like + - * / %");
			String symb = sc.next();
			double result = 0;

//			boolean status = true;
//			double height = 5.5;

			switch (symb) {
			case "+" -> result = num1 + num2;
			case "-" -> result = num1 - num2;
			case "*" -> result = num1 * num2;
			case "/" -> result = num1 / num2;
			case "%" -> result = num1 % num2;
			default -> System.out.println("Unknow symbol to proceed ");

			}

			System.out.println("Resulted value is : " + result);
			
			System.out.println("Do you want to continue ..? CLick Y for Yes N fo No");
			yn = sc.next();

		}while(yn.equalsIgnoreCase("Y"));
	}

}
