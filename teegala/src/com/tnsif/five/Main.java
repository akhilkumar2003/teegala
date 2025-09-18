package com.tnsif.five;

public class Main {
    public static void main(String[] args) {
        GetAndSet o = new GetAndSet();

        o.setName("Akhil");
        o.setAge(22);

        System.out.println("Name: " + o.getName());
        System.out.println("Age: " + o.getAge());
    }
}