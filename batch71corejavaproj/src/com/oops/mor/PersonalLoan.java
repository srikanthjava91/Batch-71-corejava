package com.oops.mor;

import java.io.IOError;
import java.io.IOException;

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

//	Rule4 : Private method we cannot Override 
//	Even though we have same private methods in Parent class and child class 
//	we cannot consider as MOR.
//	If we give @Override annotation in child class method we will get CE.

//	CE : The method hello() of type PersonalLoan must override or implement a supertype method

//	@Override
//	private void hello() {
//		System.out.println("Hello loan ");
//	}

//	Rule 5 : static methods we cannot Override
//	If the Parent class consist of static method, 
//	Even though we are Writing same method in child class with same return type+ arguments will not consider as MOR.
//	But will Consider as "Method Hiding."
//	static methods are loading when the class loads but MOR concept is working Based Object creation so static will not consider as MOR.

//	Rule 6 : final method we cannot override. But we can where ever you want !!
//	If we try to override we will get CE in child class like below.
//	CE : Cannot override the final method from Loan

//	Note : 
//	If the Parent class itself is final, all methods from that class are also final.
//	If the Parent class itself is final, all variables from that class are not final.
//	We can change variables from a final class, final class variables are not final.
	
//	Rule 7 : Exceptions related 
//	If the Parent class method throws any Exception while Overriding, 
//	The child class no need to throws the Exception.
//	But, If the child class method throws any Exception, 
//	the Parent class method must throws Same Exception or it's Parent Exception.
	
	
//	Rule 8 : Abstract related 
//	If the Parent class is abstract, inside we have abstract method, those abstract method we must need to Override it in the class.
//	A Parent class contains normal method, and The child class is abstract can also override it as abstract method.
	
	
	@Override
	public void welcome() throws IOException{
		System.out.println("Welcome to Exception Handling with Inheritance MOR");
	}
	

	@Override
	public Integer basicCibilInfo() {
		return 800;
	}

	@Override
	public Object helloUser(String message) {
		message = "Welcome to Personal Loan Banking !";
		return message;
	}

//	@Override
//	public double roi() {
//		return 8.5F;
//	}

	public static void main(String[] args) {
		PersonalLoan pl = new PersonalLoan();

		pl.getPersonalLoanInfo();
		System.out.println(pl.roi());
		System.out.println(pl.helloUser(""));

	}

}
