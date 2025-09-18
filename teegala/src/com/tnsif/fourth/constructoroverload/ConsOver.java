package com.tnsif.fourth.constructoroverload;

public class ConsOver {
	    String name;
	    int age;
	    String course;

	    public ConsOver() {
	        name = "Unknown";
	        age = 0;
	        course = "Not Assigned";
	    }
	    public ConsOver(String n) {
	        name = n;
	        age = 18; 
	        course = "Not Assigned";
	    }
	    public ConsOver(String n, int a) {
	        name = n;
	        age = a;
	        course = "Not Assigned";
	    }
	    public ConsOver(String n, int a, String c) {
	        name = n;
	        age = a;
	        course = c;
	    }
	    public void show() {
	        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
	    }
	}


