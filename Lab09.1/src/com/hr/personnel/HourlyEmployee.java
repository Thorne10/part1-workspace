package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public class HourlyEmployee extends Employee  {

  private double rate;
  private double hours;

  public HourlyEmployee() {
  }

  public HourlyEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours){
    super(name, hireDate);
    setRate(rate);
    setHours(hours);
  }

  public void paytaxes() {
    System.out.printf("%s, paid taxes of %,.2f%n, ", getName(), getHours(),getRate() * TaxPayer.HOURLY_TAX_RATE);

  }

  public void pay(){
    System.out.printf("%s is paid hourly, for a total of  %,.2f%n,", getName(),getHours() * getRate());
  }

  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public double getHours() {
    return hours;
  }

  public void setHours(double hours) {
    this.hours = hours;
  }

  @Override
  public String toString() {
    return super.toString()+ ", rate=" + rate +". hours=" + hours;
//    return String.format("%s, rate=%.2f, hours=%.1f", super.toString(), rate, hours);
  }

  @Override
  public void payTaxes() {

  }
}

// TODO: 9/13/2022 Declare and implement a constructor that takes name, hire date, rate, and hours as parameters.
// TODO: 9/13/2022 Generate setters and getters for rate and hours.
// TODO: 9/13/2022  Overide to string
