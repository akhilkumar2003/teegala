package com.tnsif.third;

public class CheckPrime {
    public static void main(String[] args) {
        int num = 19;  
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is Not a Prime number");
        }
    }
}
