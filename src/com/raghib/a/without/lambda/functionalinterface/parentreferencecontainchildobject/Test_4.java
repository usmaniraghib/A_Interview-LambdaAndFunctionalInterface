package com.raghib.a.without.lambda.functionalinterface.parentreferencecontainchildobject;

@FunctionalInterface
interface A4 {
	public abstract void m1();
	public default void default_m2() {
		System.out.println("default_m2() of functional interface A4");
	}
	public default void default_m3() {
		System.out.println("default_m3() of functional interface A4");
	}
	public static void static_m4() {
		System.out.println("static_m4() of functional interface A4");
	}
	public static void static_m5() {
		System.out.println("static_m5() of functional interface A4");
	}
}

class B4 implements A4 {
	@Override
	public void m1() {
		System.out.println("m1() method implemented by class B4");
		
	}
}

public class Test_4 {
	public static void main(String[] args) {
		System.out.println("Interface A4 is a functional interface. \nIt is not a normal interface.\nHere we mark the interface as functional interface using annotation.\nHere we can write n number of default and static methods");
		A4 b4Obj = new B4();
		b4Obj.m1();
		b4Obj.default_m2();
		b4Obj.default_m3();
		A4.static_m4();
		A4.static_m5();
	}
}
