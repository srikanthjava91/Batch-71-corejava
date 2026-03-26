package com.javaintro;

//Fully Qualified name of the class means : Package name + class name 
public class TestDemo2 {

	public static void main(String[] args) throws ClassNotFoundException {

		System.out.println("main method started !!");

		Class.forName("com.javaintro.Cricketer");
		Class.forName("java.lang.System");
		Class.forName("java.lang.String");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("main method ended !!");
	}
}
