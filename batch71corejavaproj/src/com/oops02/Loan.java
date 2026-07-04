package com.oops02;

public interface Loan {

	String hello();

	boolean validateAadhaar(String aadhaar);

	boolean validatePAN(String pan);

	boolean validatePhone(String phone);

	double getCustomerSalary();

	int getCustomerAge();

	int getCibilScore();

	double roiInfo();

	String getAddressInfo();

}
