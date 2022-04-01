package com.paolochang;

import java.awt.Point;

public class _03_ReferenceType {
  public static void main(String[] args) throws Exception {
    /**
     * Primitive type has different address 
     * x and y have the different memory location (completely independent each other)
     */
    byte x = 1;
    byte y = x;
    x = 2;
    System.out.println(y);

    /**
     * Reference type has the same address
     * pointX and pointY are referencing the exact same point object in the memory
     */
    Point pointX = new Point(x=1, y=1);
    Point pointY = pointX;
    pointX.x = 2;
    System.out.println(pointY);
  }
}
