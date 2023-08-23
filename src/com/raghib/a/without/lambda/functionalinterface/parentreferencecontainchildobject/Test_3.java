package com.raghib.a.without.lambda.functionalinterface.parentreferencecontainchildobject;

@FunctionalInterface
interface A3 {
	public abstract void m1();
}

class B3 implements A3 {
	@Override
	public void m1() {
		System.out.println("m1() method implemented by class B3");
		
	}
}

public class Test_3 {
	public static void main(String[] args) {
		System.out.println("Interface A3 is a functional interface. \nIt is not a normal interface.\nHere we mark the interface as functional interface using annotation.");
		A3 b3Obj = new B3();
		b3Obj.m1();
	}
}
