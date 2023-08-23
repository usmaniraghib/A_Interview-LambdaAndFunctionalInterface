package com.raghib.b.with.lambda.functionalinterface;

@FunctionalInterface
interface A4 {
	public abstract void m1(String source, String destination);
}

public class FunctionalInterface_3 {
	public static void main(String[] args) {
		System.out.println("Interface A4 is a functional interface. "
				+ "\nIt is not a normal interface."
				+ "\nHere we mark the interface as functional interface using annotation."
				+ "\nHere we write parametrize method");
		
		A4 a4Obj1 = (String source, String destination) -> System.out.println("SOURCE : "+source +" -> " +"DESTINATION : "+destination);
		a4Obj1.m1("Bangalore","Patna");
	}
}
