package com.tnsif.third;

import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter a number : ");
          int a =sc.nextInt();
           if(a%2==0) {
        	   System.out.println("number is even :"+a);
           }else {
        	   System.out.println("number is odd :"+a);
           }
           sc.close();
	}

}
