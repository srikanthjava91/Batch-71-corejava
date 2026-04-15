package com.languagefun.methods;

//3) with return type + No arguments 
public class TestMethodsDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		double salary = getEmpSalInfo();
		double bonus = getBonus();
		
		System.out.println("Total Salary is : " + (salary + bonus));

		System.out.println("main method ended ");
	}

	static double getEmpSalInfo() {
		double sal = 50000.00;
		return sal;
	}

	static double getBonus() {
		double bonus = 4000.00;
		return bonus;

	}

}
