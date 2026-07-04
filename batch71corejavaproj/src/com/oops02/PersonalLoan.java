package com.oops02;

//Sub Child Derived
//Note we have 4 scenarios to create Objects for Parent child classes.
public class PersonalLoan extends LoanImpl {

	void getPersonalLoanDocmentInfo() {
		System.out.println("All Personal Loan documents have been Verified  ");
	}

	@Override
	public String hello() {
		return "Hello Java Srikanth";
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube banking Personal Loan Department");

//		Scenario 1: By using Child Object & Child Reference 
//		We can call both Parent & child class functionalities.
		PersonalLoan pl = new PersonalLoan();

//		Scenario 2: By using, Parent Object & Parent Reference 
//		We can call only Parent class Functionalities.
		Loan l1 = new LoanImpl();

//		Scenario 3: By using, Child Object with Parent Reference 
//		We can call Only Parent class FUnctionalities.
//		But we can call child functionalities with help of Overriding.(Dynamic Dispatching )

//		Then why we need to Store Child Object in Parent Reference ? To Achieve Dynamic Dispatching  
//		Dynamic Dispatching means, If the child class Override Parent class Functionalities then 
//		by using Child Object parent reference we can access child functionalities only.
		
//		Q) Can we Store Child Object in Parent reference ..? Yes, this is called Up-casting
//		By Using U-Casting, We will Achieve Abstraction.
		Loan l2 = new PersonalLoan();
		System.out.println(l2.hello());// Hello Srikanth --> Hello Java Srikanth
		
//		Q) Can we Store Parent Object in Child reference --> No 
//		Type mismatch: cannot convert from Loan to PersonalLoan
//		In Java, Down-Casting is not possible.
		
//		If we do Explicit Type-cast with Child class the code compiles successfully.
//		but it throws java.lang.ClassCastException
		PersonalLoan pl2 =(PersonalLoan)new LoanImpl();
		
//		Object obj = new Loan();
		
		

//		The method getPersonalLoanDocmentInfo() is undefined for the type Loan
//		l1.getPersonalLoanDocmentInfo();

		double salary = pl.getCustomerSalary();
		int cibil = pl.getCibilScore();
		int age = pl.getCustomerAge();

		System.out.println("Enter Aadhar Details : ");
		String aadhar = sc.next();

		System.out.println("Enter PAN number ");
		String pan = sc.next();

		System.out.println("Enter Phone numbe r: ");
		String phone = sc.next();

		if (salary >= 1000000.00 && (cibil >= 300 && cibil <= 900) && age >= 25 && pl.validateAadhaar(aadhar)
				&& pl.validatePAN(pan) && pl.validatePhone(phone)) {
			System.out.println("Congratulations !!!! ");
			System.out.println("You are Eligible for Personal Loan !");
			System.out.println("Your Loan ROI is  :" + pl.roiInfo());
			System.out.println("Enter Address Details ");
			String address = pl.getAddressInfo();

			System.out.println("Customer Address is : " + address);
			pl.getPersonalLoanDocmentInfo();

		} else {
			System.out.println("You are not Eligible for Personal Loan Try after sometime !");
		}

	}

}
