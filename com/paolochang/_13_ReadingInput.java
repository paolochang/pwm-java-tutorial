package com.paolochang;

import java.util.Scanner;

public class _13_ReadingInput {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Name: ");
    String name = scanner.nextLine().trim();
    System.out.print("Age: ");
    byte age = scanner.nextByte();
    System.out.println("Welcome, " + name + ", you are " + age);
    scanner.close();
  }
}
