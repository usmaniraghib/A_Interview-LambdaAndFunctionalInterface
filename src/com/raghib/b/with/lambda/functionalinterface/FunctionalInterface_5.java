package com.raghib.b.with.lambda.functionalinterface;

@FunctionalInterface
interface A6 {
	public abstract String m1(String source, String destination);
}

public class FunctionalInterface_5 {
	public static void main(String[] args) {
		System.out.println("Interface A6 is a functional interface. "
				+ "\nIt is not a normal interface."
				+ "\nHere we mark the interface as functional interface using annotation."
				+ "\nHere we write parametrize method with return type of string."
				+ "\nNo need to provide data type for parameter, under lambda expression.");
		
		A6 a6Obj = (source, destination) -> 
		{
			System.out.println("SOURCE : "+source +" -> " +"DESTINATION : "+destination);
			return "Travel Cost Rs.999";
		};
		System.out.println(a6Obj.m1("Bangalore","Patna"));
	}
}
