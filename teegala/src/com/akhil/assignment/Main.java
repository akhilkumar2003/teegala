package com.akhil.assignment;

import com.akhil.assignment.employees.*;
import com.akhil.assignment.utilities.*;

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Akhil", 101, 75000, "HR Dept");
        Developer d = new Developer("Saketh", 102, 60000, "Java");

        EmployeeUtils.printEmployeeDetails(m);
        System.out.println("-------------------");
        EmployeeUtils.printEmployeeDetails(d);
    }
}
