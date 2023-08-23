package com.raghib.b.with.lambda.functionalinterface.staticmethod;

@FunctionalInterface
interface A3 {
	public abstract void m1();
	public static void static_m2() {
		System.out.println("static_m2() of functional interface A3");
	}
	public static void static_m3() {
		System.out.println("static_m3() of functional interface A3");
	}
}

public class FunctionalInterfaceWithStaticMethod {
	public static void main(String[] args) {
		System.out.println("Interface A3 is a functional interface. "
				+ "\nIt is not a normal interface."
				+ "\nHere we mark the interface as functional interface using annotation."
				+ "\nHere we can write n number of static methods");
		
		A3 a3Obj = () -> System.out.println("m1() method implemented by lambda expression.");
		a3Obj.m1();
		A3.static_m2();
		A3.static_m3();
	}
}
