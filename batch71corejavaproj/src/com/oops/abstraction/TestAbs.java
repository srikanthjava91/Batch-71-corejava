package com.oops.abstraction;

public abstract class TestAbs implements In1 {
	
	static String name ="Test";
	int a  =10;
	
	TestAbs(){
		System.out.println("constructor called ");
	}
	
	abstract void hello();
	
	void welcome(){
		System.out.println("welcome !!");
	}

	@Override
	public void method1() {

		System.out.println("method1 called from Abs");
	}

	@Override
	public void method2() {

		System.out.println("method2 called from Abs");
	}

	@Override
	public void method3() {
		System.out.println("method3 called from Abs");

	}

	@Override
	public void method4() {
		System.out.println("method4 called from Abs");

	}

	@Override
	public void method5() {
		System.out.println("method5 called from Abs");
	}

	@Override
	public void method6() {
		System.out.println("method6 called from Abs");
	}

	@Override
	public void method7() {
		System.out.println("method7 called from Abs");
	}

	@Override
	public void method8() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method9() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method10() {
		// TODO Auto-generated method stub

	}

}
