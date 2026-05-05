package com.logicalstatements;

import java.util.Scanner;

//WAP to work with a simple matrimonial related info validation check..?
public class TestLSDemo4 {

	public static void main(String[] args) {
		System.out.println("Welcome to VCube matrimonial Validation ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Can you enter Full Name : ");
		String name = sc.nextLine();
		System.out.println("Welcome Mr." + name);

		System.out.println("Enter your assets & salary information ");
		double assets = sc.nextDouble();

		System.out.println("Enter salary : ");
		double salary = sc.nextDouble();

		if (assets >= 50000000.00 || salary >= 1500000.00) {
			System.out.println("Oh Great !! Will continue the discussion ");

			System.out.println("Enter your age : ");
			int age = sc.nextInt();

			if (age > 26 && age <= 30) {
				System.out.println("Your age is matching with our profile lets continue !");

				System.out.println("Enter your weight & height ");
				float height = sc.nextFloat();

				if (height >= 5.4F && height <= 5.9) {
					System.out.println("Okay to cintinue !!");

					System.out.println("Enter weight : ");
					double weight = sc.nextDouble();

					if (weight >= 62 && weight <= 72) {
						System.out.println("Okay Good to go !!");

						System.out.println("Do you have any siblings : ");

						boolean sibStatus = sc.nextBoolean();

						if (!sibStatus) {
							System.out.println("We are Okay to communicate later !");
						} else {
							System.out.println("OMG, will connect later ");
						}

					} else {
						System.out.println("You must need to join in GYm !!");
					}

				} else {
					System.out.println("You are too short or too long ");
				}

			} else {
				System.out.println("Your age does not match with our profile !!");
			}

		} else {
			System.out.println("You can leave for the day !!");
		}

		sc.close();
	}

}

///
///🚕 Ride Booking – Simple Console Scenarios (if-else based)
//🔹 1. Check Service Availability
//Ask user: Enter city / area
//If area is serviceable → continue
//Else → “Service not available in your location”
//🔹 2. Driver Availability Check
//Ask: number of drivers available
//If drivers > 0 → allow booking
//Else → “No drivers available”
//🔹 3. Distance-Based Ride Eligibility
//Ask: distance in KM
//If distance < 2 → “Minimum distance not met”
//If distance within limit → continue
//If too long → “Outstation ride not supported”
//🔹 4. Fare Calculation (Basic)
//Input: distance
//If distance ≤ 5 → fixed fare
//Else → per km pricing
//🔹 5. Surge Pricing Check
//Ask: peak time? (true/false or 1/0)
//If peak → increase fare (e.g., +50%)
//Else → normal fare
//🔹 6. User Ride Confirmation
//Show fare
//Ask: confirm booking?
//If yes → proceed
//Else → cancel ride
//🔹 7. Driver Acceptance Simulation
//Ask: driver accepted? (true/false)
//If yes → ride starts
//Else → “Searching for another driver”
//🔹 8. Cancellation Scenario
//Ask: cancel ride?
//If yes:
//If before driver assigned → no charge
//Else → show cancellation fee
//🔹 9. Vehicle Type Selection
//Ask: Bike / Auto / Car
//If Bike → low fare
//If Car → higher fare
//If invalid → show error
//🔹 10. Payment Scenario
//Ask: payment method (Cash / Online)
//If online:
//Ask: payment success?
//If no → “Retry payment”
//Else → “Pay cash to driver”
//🔹 11. Rating System
//Ask rating (1–5)
//If rating < 3 → “We will improve”
//Else → “Thanks for feedback”
//🔹 12. Final Ride Completion
//If ride completed → show summary
//Else → “Ride not completed properly”
