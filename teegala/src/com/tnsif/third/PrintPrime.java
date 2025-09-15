package com.tnsif.third;

public class PrintPrime {

	public static void main(String[] args) {
              System.out.println("prime numbers from 1 To 100 :");
              for(int a=1;a<=100;a++) {
            	  if(a %2 ==0) {
            		  System.out.println("number is notprime:"+a);
            	  }
            	  else {
            		  System.out.println("number is  prime:"+a);
            	  }
              }
	}
}
