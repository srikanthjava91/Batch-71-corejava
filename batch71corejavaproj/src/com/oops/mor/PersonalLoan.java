package com.oops.mor;

public class PersonalLoan extends Loan {

	void getPersonalLoanInfo() {
		System.out.println("Personal Loan information ");
	}

//	Rule1: Method signature must be same.
//	method signature means method name + arguments but not return type.

//	Rule2 :Method return type must be same until 1.4 version, 
//	But From 1.5 version onwards Java introduced co-varient return type.

//	Note : If the Parent class return type is primitive data type 
//	the child class method return type must be same return type even after 1.5 version
//	Co-varient return types are applicable only Object return types.

//	Co-varient return type means ..? 
//	If the Parent class method return any Object data type the child can return same Object data type 
//	or it's sub type or sub class. 
	
//	Parent-Number ---> Child-Number or Integer or Double or Long 
//	Parent Object --> Child Object or String or Integer or Any Object....
	
//	scope : public > protected > default > private 
//	Rule 3: Method Scope Should not be reduce.
	
//	If the Parent class is public --> child class must be public only.
//	If the Parent class is protected --> child class can be protected or public.
//	If the Parent class is <default> --> child class can be <default> or protected or public.
//	If the Parent class is private --> private methods we cannot override.
//	Note  : private scope is within the class, we cannot override.
	
//	Even though we have same private methods in Parent class and child class 
//	we cannot consider as MOR.
//	If we give @Override annotation in child class method we will get CE.
	
	
//	CE : The method hello() of type PersonalLoan must override or implement a supertype method
//	@Override
//	private void hello() {
//		System.out.println("Hello loan ");
//	}

	@Override
	public Integer basicCibilInfo() {
		return 800;
	}

	@Override
	public Object helloUser(String message) {
		message = "Welcome to Personal Loan Banking !";
		return message;
	}

	@Override
	public double roi() {
		return 8.5F;
	}

	public static void main(String[] args) {
		PersonalLoan pl = new PersonalLoan();

		pl.getPersonalLoanInfo();
		System.out.println(pl.roi());
		System.out.println(pl.helloUser(""));

	}

}
