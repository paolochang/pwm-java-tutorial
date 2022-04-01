package com.paolochang;

import java.text.NumberFormat;
import java.util.Scanner;

public class _14_MortgageCalculator {
  public static void main(String[] args) throws Exception {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Principal: ");
    int princal = scanner.nextInt();

    System.out.print("Annual Interest Rate: ");
    float annualInterst = scanner.nextFloat();
    float monthlyInterest = annualInterst / PERCENT / MONTHS_IN_YEAR;

    System.out.print("Period (Years): ");
    byte period = scanner.nextByte();
    int numPayment = period * MONTHS_IN_YEAR;

    double mortgage = princal * 
      (monthlyInterest * Math.pow((1+monthlyInterest), numPayment) 
      / (Math.pow((1+monthlyInterest), numPayment) - 1));

    NumberFormat mortgageFormat = NumberFormat.getCurrencyInstance();
    System.out.println("Mortgage: " + mortgageFormat.format(mortgage));
    scanner.close();
  }
}
