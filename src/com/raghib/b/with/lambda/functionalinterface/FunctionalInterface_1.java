package com.raghib.b.with.lambda.functionalinterface;

interface A1 {
	public abstract void m1();
}

public class FunctionalInterface_1 {
	public static void main(String[] args) {
		System.out.println("Interface A1 is a functional interface.\nIt is not a normal interface.\nBecause It contain only one abstract method.\n@FunctionalInterface annotation is OPTIONAL.");
		A1 a1Obj = () -> System.out.println("m1() method implemented by lambda expression.");
		a1Obj.m1();
	}
}
