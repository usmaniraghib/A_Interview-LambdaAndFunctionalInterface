package com.raghib.b.with.lambda.functionalinterface.defaultmethod;

/**
 * REFERENCE;
 * https://www.geeksforgeeks.org/default-methods-java/
 * @author Asus
 *
 */
@FunctionalInterface
interface A8 {
	public abstract void abstract_m1();
	public default void default_m2() {
		System.out.println("default_m2() of functional interface A8");
	}
	public static void static_m3() {
		System.out.println("static_m3() of functional interface A8");
	}
}

public class FunctionalInterfaceWithDefaultMethod implements A8 {
	
	@Override
	public void abstract_m1() {
		System.out.println("abstract_m1() method implemented by implemented class.");
		
	}
	
	public static void main(String[] args) {
		System.out.println("Interface A8 is a functional interface. "
				+ "\nIt is not a normal interface."
				+ "\nHere we mark the interface as functional interface using annotation."
				+ "\nHere we can write n number of default and static methods");
		
		FunctionalInterfaceWithDefaultMethod test8Obj = new FunctionalInterfaceWithDefaultMethod();
		test8Obj.abstract_m1();
		test8Obj.default_m2();
		A8.static_m3();
	}
}
