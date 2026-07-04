package com.oops.abstraction;

public class TestAnimal {

	public static void main(String[] args) {
		System.out.println("Welcome Animal Park !!");

//		Animal a = new Animal();//Cannot instantiate the type Animal

		System.out.println("Dog information !!");
		Animal d = new Dog();
		d.sound();
		d.walk();
		d.eat();
		d.jump();
//		d.breath();//This static method of interface Animal can only be accessed as Animal.breath
		System.out.println(d.info());
		Animal.breath();
		Dog.breath();
		System.out.println(d.ORGANISATION_NAME);
		System.out.println("****************");

		System.out.println("Cat information !!");
		Animal c = new Cat();
		c.eat();
		c.sound();
		c.walk();
		c.jump();
		Animal.breath();
		System.out.println(c.info());
		
		System.out.println("****************");
		System.out.println("Monkey Info ");
		Monkey m = new Monkey();
		m.sleep();
		m.sound();
		m.eat();
		m.walk();
		m.jump();
		System.out.println(m.info());
		System.out.println("****************");
	}

}
