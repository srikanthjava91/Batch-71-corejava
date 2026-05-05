package com.logicalstatements;

import java.util.Scanner;

//note : If we can write individually but else we cannot write without if.
public class TestLSDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Are you Attending classes Regularly ?");
		boolean areYouAttendingclasses = sc.nextBoolean();

		System.out.println("Are you Completing Daily Assignmnet ?");
		boolean areYouCompletingAssignments = sc.nextBoolean();

		System.out.println("Are you Attending Mock-UP Interviews ?");
		boolean areYouAttendingMocks = sc.nextBoolean();

		if (areYouAttendingclasses && areYouCompletingAssignments && areYouAttendingMocks) {
			System.out.println("Good !! You will get a High chances to get job in 6 months");
		} else {
			System.out.println("God will save you !!");
		}

	}

}
