package com.paolochang;

public class _19_TernaryOperator {
  public static void main(String[] args) throws Exception {
    int income = 80_000;
    String className = (income > 100_000) ? "First" : "Economy";
    System.out.println("className: " + className);
  }
}
