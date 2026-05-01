package com.languagefun.constructors2;

public class Movie {

	String director;
	String producer;
	String hero;
	String name;
	String heroin;
	double budget;

	public Movie() {
		System.out.println("no arg constructor !!");
	}

	Movie(String director, String producer) {
		this.director = director;
		this.producer = producer;
	}

	Movie(Movie m2, String hero, String heroin) {

		this.director = m2.director;
		this.producer = m2.producer;
		this.hero = hero;
		this.heroin = heroin;

	}

	Movie(Movie m, String name, double budget) {
		this.budget = budget;
		this.name = name;
		this.director = m.director;
		this.producer = m.producer;
		this.hero = m.hero;
		this.heroin = m.heroin;
	}

	public static void main(String[] args) {
		System.out.println("main method strated !");

		Movie m1 = new Movie();
		m1.show();

		Movie m2 = new Movie("S S Rajamouli", "S S Karthikeya");
		m2.show();

		Movie m3 = new Movie(m2, "Mahesh Babu", "Priynaka Chopra");
		m3.show();

		Movie m4 = new Movie(m3, "VARANASI", 56577654356754.00);
		m4.show();

		System.out.println("main method ended !");
	}

	void show() {
		System.out.println("Dircetor of the Movie :" + director);
		System.out.println("Producer of the Movie :" + producer);
		System.out.println("Hero of the movie : " + hero);
		System.out.println("Heroin of the movie : " + heroin);
		System.out.println("Budget of the movie : " + budget);
		System.out.println("Name of the Moview : " + name);
		System.out.println("******************************");
	}

}
