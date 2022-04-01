package com.paolochang;

import java.text.NumberFormat;
import java.util.Scanner;

public class _27_MortgageCalculator {
  public static void main(String[] args) throws Exception {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;
    int principal;
    Scanner scanner = new Scanner(System.in);
    while(true) {
      System.out.print("Principal ($1k to $1M): ");
      principal = scanner.nextInt();
      if (1000 <= principal && principal <= 1000000) break;
      System.out.println("Enter a number between 1,000 and 1,000,000");
    } 

    float annualInterst;
    float monthlyInterest;
    while(true) {
      System.out.print("Annual Interest Rate: ");
      annualInterst = scanner.nextFloat();
      monthlyInterest = annualInterst / PERCENT / MONTHS_IN_YEAR;
      if (0 < annualInterst && annualInterst <= 30) break;
      System.out.println("Enter a value greater than 0 and less than or equal to 30");
    }

    byte period;
    int numPayment;
    while(true) {
      System.out.print("Period (Years): ");
      period = scanner.nextByte();
      numPayment = period * MONTHS_IN_YEAR;
      if (0 < period && period <= 30) break;
      System.out.println("Enter a value between 1 and 30");
    }

    double mortgage = principal * 
      (monthlyInterest * Math.pow((1+monthlyInterest), numPayment) 
      / (Math.pow((1+monthlyInterest), numPayment) - 1));

    NumberFormat mortgageFormat = NumberFormat.getCurrencyInstance();
    System.out.println("Mortgage: " + mortgageFormat.format(mortgage));
    scanner.close();
  }
}
