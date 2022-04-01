package com.paolochang;

public class _10_OrderOfOperations {
  public static void main(String[] args) throws Exception {
    int x = 10 + 3 * 2;
    int y = (10 + 3) * 2;
    System.out.println(x);
    System.out.println(y);

    // Implicit casting
    // byte > short > int > long > float > double
    short a = 1;
    int b = a + 2;
    System.out.println(b);

    double c = 1.1;
    double d = c + 2; // 2.0
    int e = (int)c + 2;
    System.out.println(d);
    System.out.println(e);

    String f = "1";
    int g = Integer.parseInt(f) + 2;
    System.out.println(g);

    String h = "1.1";
    double i = Double.parseDouble(h) + 2;
    System.out.println(i);

  }
}
