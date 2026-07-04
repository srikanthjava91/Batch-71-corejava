package com.oops02;

import java.util.Scanner;

//Parent or Super or Base 
public class LoanImpl implements Loan {

	static Scanner sc = new Scanner(System.in);

	@Override
	public String hello() {
		return "Hello Srikanth";
	}

	@Override
	public boolean validateAadhaar(String aadhaar) {
		return aadhaar.matches("\\d{12}");
	}

	// AMIPC1234G
	@Override
	public boolean validatePAN(String pan) {
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}

	@Override
	public boolean validatePhone(String phone) {
		return phone.matches("[6-9]{1}[0-9]{9}");
	}

	@Override
	public double getCustomerSalary() {
		System.out.println("Enter your salary ");
		double salary = sc.nextDouble();
		return salary;
	}

	@Override
	public int getCustomerAge() {
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		return age;
	}

	@Override
	public int getCibilScore() {
		System.out.println("Enter your Cibil Score ");
		int cibil = sc.nextInt();
		return cibil;
	}

	@Override
	public double roiInfo() {
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

	@Override
	public String getAddressInfo() {
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

}
