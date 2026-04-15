package com.languagefun;

public class Student1 {

	// Global Variables
	// instance + primitive variable
	int sid;

	// instance + Object variable
	String name;

	// static + primitive variable
	static int collegeID = 555;

//	 static + Object variable
	static String collegeName = "Vcube";

//	var name1 = "Srikanth";//'var' is not allowed here

	void show() {
		System.out.println("Show method called **********");
//		String name  = "Srikanth";

		var name = "Srikanth";
		var id = 10;
		var height = 5.9F;
		var salary = 100000.00;

		System.out.println(name);
		System.out.println(id);
		System.out.println(height);
		System.out.println(salary);
		System.out.println("Show method ended **********");

	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		System.out.println("Student info ");

//		Local Variables : JVM Does not provide default values for local variables.
		int x;
//		System.out.println(x);//CE : The local variable x may not have been initialized

//		NOte : The Only modifier for a local variable is final.
		int a = 100;
		System.out.println(a);

		int collegeID = 666;
		String collegeName = "VSS";

//		Instance data we can access through Object Reference variable.
//		Whenever the data is changing from Object to Object then will choose that as instance.
		Student1 s1 = new Student1();
		s1.show();
		s1.sid = 101;
		s1.name = "Srinu";
		System.out.println("Student ID : " + s1.sid);// 0
		System.out.println("Student Name: " + s1.name);// null

		// static data we can access directly or by using class name.
//		Whenever the data is same for all the Objects then will choose that as static.
		System.out.println("College ID : " + Student1.collegeID);// 555 666
		System.out.println("College Name : " + Student1.collegeName);// Vcube VSS

//		Q) Can we access static data by using Object Reference variables ..? 
//		yes !! We can access but, will get a Warning : The static field Student1.collegeID should be accessed in a static way
		System.out.println(s1.collegeID);
		System.out.println(s1.collegeName);

		System.out.println("main method ended !!");

		System.out.println("*****************************************");
		Student1 s2 = null;
		System.out.println(s2.collegeID);
		System.out.println(s2.collegeName);

//		System.out.println(s2.sid);//NPE : NullPointerException

	}

}
