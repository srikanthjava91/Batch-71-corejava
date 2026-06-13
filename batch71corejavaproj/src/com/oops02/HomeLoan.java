package com.oops02;


//Sub Child Derived
public class HomeLoan extends Loan {

	public static void main(String[] args) {

		System.out.println("Welcome to Vcube banking Home Loan Department");

		HomeLoan pl = new HomeLoan();

		double salary = pl.getCustomerSalary();
		int cibil = pl.getCibilScore();
		int age = pl.getCustomerAge();

		System.out.println("Enter Aadhar Details : ");
		String aadhar = sc.next();

		System.out.println("Enter PAN number ");
		String pan = sc.next();

		System.out.println("Enter Phone numbe r: ");
		String phone = sc.next();

		if (salary >= 600000.00 && (cibil >= 300 && cibil <= 900) && age >= 24 && pl.validateAadhaar(aadhar)
				&& pl.validatePAN(pan) && pl.validatePhone(phone)) {
			System.out.println("Congratulations !!!! ");
			System.out.println("You are Eligible for Home Loan !");
			System.out.println("Your Loan ROI is  :" + pl.roiInfo());
			System.out.println("Enter Address Details ");
			String address = pl.getAddressInfo();

			System.out.println("Customer Address is : " + address);
			pl.getHomeLoanDocmentInfo();

		} else {
			System.out.println("You are not Eligible for Home Loan Try after sometime !");
		}

	}

	void getHomeLoanDocmentInfo() {
		System.out.println("All Home Loan documents have been Verified  ");
	}

}
