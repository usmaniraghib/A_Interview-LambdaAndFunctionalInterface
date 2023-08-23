package com.raghib.a.without.lambda.functionalinterface;

interface A1 {
	public abstract void m1();
}

class B1 implements A1 {

	@Override
	public void m1() {
		System.out.println("m1() method implemented by class B1");
		
	}
	
}

public class Test_1 {
	public static void main(String[] args) {
		System.out.println("Interface A1 is a functional interface.\nIt is not a normal interface.\nBecause It contain only one abstract method.\n@FunctionalInterface annotation is OPTIONAL.");
		B1 b1Obj = new B1();
		b1Obj.m1();
	}
}
