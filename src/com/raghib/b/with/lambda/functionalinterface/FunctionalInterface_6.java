package com.raghib.b.with.lambda.functionalinterface;

@FunctionalInterface
interface A7 {
	public abstract String m1();
}

public class FunctionalInterface_6 {
	public static void main(String[] args) {
		System.out.println("Interface A7 is a functional interface. "
				+ "\nIt is not a normal interface."
				+ "\nHere we mark the interface as functional interface using annotation."
				+ "\nHere we write a method with return type of string."
				+ "\nPrinting return statement without return keyword and curly brace");
		
		A7 a7Obj = () -> "Travel Cost Rs.999";
		
		System.out.println(a7Obj.m1());
	}
}
