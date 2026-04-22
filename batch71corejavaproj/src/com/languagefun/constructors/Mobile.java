package com.languagefun.constructors;

public class Mobile {

	String brand;
	String operating_Syste;
	int ram_Memory;
	String cpu_Model;
	double cpu_Speed;

	public static void main(String[] args) {

		System.out.println("main method strated ");
		Mobile m = new Mobile();
		m.info();
		System.out.println("main method ended ");

	}

	void info() {
		System.out.println("Brand : " + brand);
		System.out.println("operating_Syste :" + operating_Syste);
		System.out.println("Ram Memory  :" + ram_Memory);
		System.out.println("cpu_Model :" + cpu_Model);
		System.out.println("cpu_Speed :" + cpu_Speed);

	}

}
