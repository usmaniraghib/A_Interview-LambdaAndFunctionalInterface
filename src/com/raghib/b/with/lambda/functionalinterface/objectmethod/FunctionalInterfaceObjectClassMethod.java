package com.raghib.b.with.lambda.functionalinterface.objectmethod;

/**
 * Reference;
 * ChatGPT - how to use object class method into functional interface
 * @author Asus
 *
 */
@FunctionalInterface
interface MyFunctionalInterface {
    void performAction(String input);
}

public class FunctionalInterfaceObjectClassMethod {
    public static void main(String[] args) {
        MyFunctionalInterface myFunction = input -> {
            // Using Object class methods within the functional interface implementation
            System.out.println("Input: " + input);
            System.out.println("Hash Code: " + input.hashCode());
            System.out.println("String Representation: " + input.toString());
            
            // You can also use the equals method to compare objects
            boolean isEqual = input.equals("Hello");
            System.out.println("Is equal to 'Hello'? " + isEqual);
        };
        
        myFunction.performAction("Hello, world!");
    }
}