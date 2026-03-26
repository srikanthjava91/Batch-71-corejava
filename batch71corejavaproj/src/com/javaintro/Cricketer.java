package com.javaintro;

//JVM will provide default values for class level data.
//For int --> 0 
//for String --> null 
//How can we access instance data in static area ..? 
//ans : By Creating a Object and by using Object reference variable 
//we can access instance data in static area.

//static vs instance 
//Whenever the data is same for every object then will choose those variables are static.
//countryID & countryName will be same for all the objects in our Example.

//Whenever the data is changing from Object to Object then will choose variables are instance.
//jno & name will be changing from Object to Object so we took as instance.

//All the static & class related information will store it in Method Area. 
//All the instance % Object related information will store it in Heap area.

//For static data we cannot create Object to load
//For instance data we must need to create Object to load.

//Whenever we create Object the new instance copy will create.
//Whereas for static its using same copy

public class Cricketer {

	// Declaration
	// instance variables or non-static variables
	int jerseyNumber;
	String cricketerName;

	// static variables
	static int countryId;
	static String countryName;

	public static void main(String[] args) {
		System.out.println("main method started !");
		System.out.println("Representing Indian Cricket Team Info !");

		// static data Initialization

		countryId = 91;
		countryName = "India";

		// Object creation
		// LHS : Cricketer is a class name & msd is a Reference variable name of your
		// object
		// RHS :(Object) new is keyword to create Object & Cricketer() is a constructor
		// calling is equals to Object
		System.out.println("Object1 info **************");
		Cricketer msd = new Cricketer();

//		 Accessing static data directly
//		+ is a concatenation operator 
		System.out.println("Country ID : " + countryId);
		System.out.println("Cuntry Name : " + countryName);

		// Initializing instance data
		msd.jerseyNumber = 7;
		msd.cricketerName = "Mahendra Singh Dhoni";

//		 Accessing instance data by using Object reference variable
//		 Cannot make a static reference to the non-static field jerseyNumber
		System.out.println("Jersey Number : " + msd.jerseyNumber);
//		Cannot make a static reference to the non-static field cricketerName
		System.out.println("Name  : " + msd.cricketerName);

		System.out.println("********************************");
		System.out.println("Object2 info **************");
		Cricketer abhi = new Cricketer();
		System.out.println("Country ID : " + countryId);// 91
		System.out.println("Cuntry Name : " + countryName);// India

		abhi.jerseyNumber = 4;
		abhi.cricketerName = "Abhishek Sharma";
		System.out.println("Jersey Number : " + abhi.jerseyNumber);// 0
		System.out.println("Name  : " + abhi.cricketerName);// null

		System.out.println("********************************");
		System.out.println("Object3 info **************");

		Cricketer sanju = new Cricketer();
		System.out.println("Country ID : " + countryId);// 91
		System.out.println("Cuntry Name : " + countryName);// India

		sanju.jerseyNumber = 9;
		sanju.cricketerName = "Sanju Samson";
		System.out.println("Jersey Number : " + sanju.jerseyNumber);// 9
		System.out.println("Name  : " + sanju.cricketerName);// Sanju Samson

		System.out.println("********************************");
		System.out.println("Object4 info **************");

		Cricketer ish = new Cricketer();

		countryId = 92;
		countryName = "Bharath";

		System.out.println("Country ID : " + countryId);// 92
		System.out.println("Cuntry Name : " + countryName);// Bharath

		ish.jerseyNumber = 23;
		ish.cricketerName = "Ishan Kishan";
		System.out.println("Jersey Number : " + ish.jerseyNumber);// 23
		System.out.println("Name  : " + ish.cricketerName);// Ishan Kishan

		System.out.println("********************************");
		System.out.println("Object5 info **************");
		Cricketer vk = new Cricketer();

		System.out.println("Country ID : " + countryId);// 92
		System.out.println("Cuntry Name : " + countryName);// Bharath

		vk.jerseyNumber = 18;
		vk.cricketerName = "Virat Kohli";
		System.out.println("Jersey Number : " + vk.jerseyNumber);// 18
		System.out.println("Name  : " + vk.cricketerName);// Virat Kohli

		System.out.println("********************************");
		System.out.println("Object5 info **************");
		Cricketer vv = new Cricketer();

		System.out.println("Country ID : " + countryId);//
		System.out.println("Cuntry Name : " + countryName);//

		System.out.println("Jersey Number : " + vv.jerseyNumber);//
		System.out.println("Name  : " + vv.cricketerName);//

		System.out.println("main method ended !");
	}

}
