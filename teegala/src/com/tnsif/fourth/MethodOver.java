package com.tnsif.fourth;

public class MethodOver {
	    public void show(int a, int b) {
	        System.out.println("Method with two int parameters: " + a + ", " + b);
	    }

	    public void show(double a, double b) {
	        System.out.println("Method with two double parameters: " + a + ", " + b);
	    }

	    public void show(int a, double b) {
	        System.out.println("Method with int and double parameters: " + a + ", " + b);
	    }

	    public void show(double a, int b) {
	        System.out.println("Method with double and int parameters: " + a + ", " + b);
	    }
}
