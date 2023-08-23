package com.raghib.a.without.lambda.functionalinterface.parentreferencecontainchildobject;

interface A2 {
	public abstract void m1();
	public abstract void m2();
}

class B2 implements A2 {

	@Override
	public void m1() {
		System.out.println("m1() method implemented by class B2");
		
	}

	@Override
	public void m2() {
		System.out.println("m2() method implemented by class B2");
		
	}
	
}

public class Test_2 {
	public static void main(String[] args) {
		System.out.println("Interface A2 is not a functional interface. \nIt is a normal interface.\nBecause It contain more then one abstract method.");
		A2 b2Obj = new B2();
		b2Obj.m1();
		b2Obj.m2();
	}
}
