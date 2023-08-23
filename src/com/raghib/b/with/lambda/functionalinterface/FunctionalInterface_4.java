package com.raghib.b.with.lambda.functionalinterface;

@FunctionalInterface
interface A5 {
	public abstract String m1(String source, String destination);
}

public class FunctionalInterface_4 {
	public static void main(String[] args) {
		System.out.println("Interface A5 is a functional interface. "
				+ "\nIt is not a normal interface."
				+ "\nHere we mark the interface as functional interface using annotation."
				+ "\nHere we write parametrize method with return type of string.");
		
		A5 a5Obj = (String source, String destination) -> 
		{
			System.out.println("SOURCE : "+source +" -> " +"DESTINATION : "+destination);
			return "Travel Cost Rs.999";
		};
		System.out.println(a5Obj.m1("Bangalore","Patna"));
	}
}
