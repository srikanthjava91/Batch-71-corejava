package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo2 {

	public static void main(String[] args) {

		Collection<String> teamA = new ArrayList<>();

		teamA.add("Priyansh");
		teamA.add("SooryaVamsi");
		teamA.add("Ashok ");
		teamA.add("PrabhuSimran");
		teamA.add("Ansul");
		teamA.add("Jurel");
		teamA.add("Harsh Dube");

		System.out.println(teamA);

		Collection<String> teamB = new ArrayList<>();

		teamB.add("Shubham Gill");
		teamB.add(" Rohit Sharma");
		teamB.add("Virat Kohli ");
		teamB.add("Tilak  Varma");
		teamB.add("Hardhik Pandya");
		teamB.add("Abhishek  Sharma");
		teamB.add("Shreyash Ayer");
		teamB.add("Sanju Samson");
		teamB.add("Bhumrah");
		teamB.add("Srikanth");

		System.out.println(teamB);

		Collection<String> indianTeam = new ArrayList<>();
		indianTeam.addAll(teamA);
		indianTeam.addAll(teamB);
		System.out.println(indianTeam);

//		teamA.clear();
		System.out.println("--------------------------------");
		System.out.println(indianTeam);//

		System.out.println(teamA);
		System.out.println(teamA.contains("Ansul"));// false
		System.out.println(indianTeam.containsAll(teamA));
		
		Collection<String> teamC = new ArrayList<>();//
		teamC.add("Priyansh");
		teamC.add("SooryaVamsi");
		teamC.add("Ashok ");
		teamC.add("PrabhuSimran");
		teamC.add("Ansul");
		teamC.add("Jurel");
		teamC.add("Harsh Dube");
		
		System.out.println(indianTeam.containsAll(teamC));//
		System.out.println("-----------------------------------");
		System.out.println(indianTeam);
		
		indianTeam.removeAll(teamA);
		
		System.out.println(indianTeam);
		

	}

}
