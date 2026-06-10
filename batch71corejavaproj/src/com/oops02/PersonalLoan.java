package com.oops02;

import java.util.Scanner;

public class PersonalLoan {
	static Scanner sc = new Scanner(System.in);
	
	
	boolean validateAadhaar(String aadhaar) {
	    return aadhaar.matches("\\d{12}");
	}
	
	//AMIPC1234G
	boolean validatePAN(String pan) {
	    return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}
	
	boolean validatePhone(String phone) {
	    return phone.matches("[6-9]{1}[0-9]{9}");
	}

	double getCustomerSalary() {
		System.out.println("Enter your salary ");
		double salary = sc.nextDouble();
		return salary;
	}

	int getCustomerAge() {
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		return age;
	}

	int getCibilScore() {
		System.out.println("Enter your Cibil Score ");
		int cibil = sc.nextInt();
		return cibil;
	}

	double roiInfo() {
		double roi = 12.0;

		int cibilScore = getCibilScore();

		if (cibilScore >= 300 && cibilScore <= 599) {
			System.out.println(
					"Poor score; high risk for lenders, loan applications may be rejected or approved at high interest rates ");
			roi = 11.0;
		} else if (cibilScore >= 600 && cibilScore <= 699) {
			System.out.println("Fair score; moderate risk, may face stricter loan terms");
			roi = 10.0;
		} else if (cibilScore >= 700 && cibilScore <= 749) {
			System.out.println("Good score; better chances of loan approval with favorable interest rates");
			roi = 9.0;
		} else if (cibilScore >= 750 && cibilScore <= 900) {
			System.out.println(
					"Excellent score; lowest risk, easier loan approval, and potential for higher loan amounts at lower interest rates ");
			roi = 8.0;
		} else {
			System.out.println("Invalid Cibil info ");
		}

		return roi;

	}

	String getAddressInfo() {
		String address = "";

		System.out.println("Enter flat number : ");
		String flat = sc.next();

		System.out.println("Plot name");
		sc.nextLine();
		String plot = sc.nextLine();

		System.out.println("Enter Street Name : ");
		String street = sc.nextLine();

		System.out.println("Enter City Name: ");
		String city = sc.nextLine();

		System.out.println("Enter Pin code");
		long pin = sc.nextLong();

		System.out.println("Enter State : ");
		sc.nextLine();
		String state = sc.nextLine();

		address = "Flat No : " + flat + ", Plot name : " + plot + ", Street : " + street + ", City : " + city
				+ ", PIN : " + pin + ", State : " + state;

		return address;
	}
	
	void getPersonalLoanDocmentInfo(){
		System.out.println("All Personal Loan documents have been Verified  ");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube banking Personal Loan Department");

		PersonalLoan pl = new PersonalLoan();

		double salary = pl.getCustomerSalary();
		int cibil = pl.getCibilScore();
		int age = pl.getCustomerAge();
		
		System.out.println("Enter Aadhar Details : ");
		String aadhar = sc.next();
		
		System.out.println("Enter PAN number ");
		String pan = sc.next();
		
		System.out.println("Enter Phone numbe r: ");
		String phone = sc.next();
		
		

		if (salary >= 1000000.00 && (cibil >= 300 && cibil <= 900) && age >= 25 
				&& pl.validateAadhaar(aadhar)
				&& pl.validatePAN(pan)
				&& pl.validatePhone(phone)) {
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
