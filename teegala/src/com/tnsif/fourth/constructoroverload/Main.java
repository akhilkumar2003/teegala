package com.tnsif.fourth.constructoroverload;

public class Main {
	 public static void main(String[] args) {
		 ConsOver s1 = new ConsOver();
		 ConsOver s2 = new ConsOver("Akhil");
	     ConsOver s3 = new ConsOver("Ravi", 21);
	     ConsOver s4 = new ConsOver("Sita", 22, "Computer Science");

	        s1.show();
	        s2.show();
	        s3.show();
	        s4.show();
	    }

}
