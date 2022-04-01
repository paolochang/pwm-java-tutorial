package com.paolochang;

import java.util.Date;

public class _02_VariablesType {
  public static void main(String[] args) throws Exception {
    /**
     * Primitive
     * - number
     * - character
     * - booleans
     */

    byte age = 30;
    long viewsCount = 3_123_456_789L;
    float price = 10.99F;
    char letter = 'A';
    boolean isEligible = false;

    System.out.printf("age: %d %n", age);
    System.out.printf("viewsCount: %d %n", viewsCount);
    System.out.printf("price: %f %n", price);
    System.out.printf("letter: %s %n", letter);
    System.out.printf("isEligible: %b %n", isEligible);

    /**
     * Reference
     * - date,
     * - mail message
     */
    Date now = new Date();
    System.out.printf("now: %tT %n", now);
  }
}
