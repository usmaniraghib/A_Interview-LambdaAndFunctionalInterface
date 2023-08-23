package com.raghib.b.with.lambda.functionalinterface;

@FunctionalInterface
interface A2 {
	public abstract void m1();
}

public class FunctionalInterface_2 {
	public static void main(String[] args) {
		System.out.println("Interface A2 is a functional interface. \nIt is not a normal interface.\nHere we mark the interface as functional interface using annotation.");
		A2 a2Obj = () -> System.out.println("m1() method implemented by lambda expression.");
		a2Obj.m1();
	}
}
