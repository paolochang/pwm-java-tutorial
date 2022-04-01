package com.paolochang;

import java.text.NumberFormat;

public class _12_FormattingNumbers {
  public static void main(String[] args) throws Exception {
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String result1 = currency.format(1234567.891);
    System.out.println(result1);

    // method chaining
    String result2 = NumberFormat.getPercentInstance().format(0.1);
    System.out.println(result2);
  }
}
