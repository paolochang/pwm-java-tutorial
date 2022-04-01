package com.paolochang;

public class _11_MathClass {
  public static void main(String[] args) throws Exception {
    int a = Math.round(1.1F);
    int b = (int)Math.ceil(1.1F);
    int c = (int)Math.floor(1.1F);
    int d = Math.max(1,2);
    int e = Math.min(1,2);
    double f = Math.random();
    int g = (int)Math.round(Math.random() * 100);

    System.out.println("round:\t" + a);
    System.out.println("ceil:\t" + b);
    System.out.println("floor:\t" + c);
    System.out.println("max:\t" + d);
    System.out.println("min:\t" + e);
    System.out.println("random:\t" + f);
    System.out.println("random:\t" + g);
  }
}
