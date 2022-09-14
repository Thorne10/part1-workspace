package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

  private double salary;

  public SalariedEmployee() {
  }

  public SalariedEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  public SalariedEmployee(String name, LocalDate hireDate, double salary){
    super (name, hireDate);
    setSalary(salary);
  }

  private void setSalary(double salary) {
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  public String toString() {
    return String.format("%s, salary=%.2f", super.toString(), salary);
  }


}
