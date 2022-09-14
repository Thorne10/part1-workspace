/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);


        dept.addEmployee(new HourlyEmployee("Jason", LocalDate.of(1990, 8, 24)));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2)));

        dept.addEmployee(new HourlyEmployee("Tamieka", LocalDate.of(2022, 04,02), 21, 40));
        dept.addEmployee(new SalariedEmployee("Jonathan", LocalDate.of(2022, 02, 01), 45000));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        //Pay its employees
        System.out.println("\nPay employees");
        dept.payEmployees();
    }
}