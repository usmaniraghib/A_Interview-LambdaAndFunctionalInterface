package com.raghib.b.with.lambda;

public class TestLambda {

	public static void main(String[] args) {
        // Using a lambda expression to implement the Runnable interface
        Runnable myRunnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Count: " + i);
            }
        };

        // Starting a new thread with the Runnable lambda
        Thread thread = new Thread(myRunnable);
        thread.start();
    }

}
