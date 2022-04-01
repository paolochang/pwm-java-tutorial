package com.paolochang;

public class _09_ArithmeticExpressions {
  public static void main(String[] args) throws Exception {
    int result1 = 10 + 3;
    System.out.println(result1);

    double result2 = (double)10 / (double)3;
    System.out.println(result2);

    int x = 1;
    int y = x++;
    int z = ++x;
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);

    x += 2;
    System.out.println(x);
  }
}
