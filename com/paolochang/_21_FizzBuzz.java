package com.paolochang;

import java.util.Scanner;

public class _21_FizzBuzz {
  public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Number: ");
    int input = scanner.nextInt();

    if (input % 3 == 0 && input % 5 == 0) 
      System.out.println("FizzBuzz");
    else if (input % 5 == 0)
      System.out.println("Fizz");
    else if (input % 3 == 0)
      System.out.println("Buzz");
    else
      System.out.println(input);
      
    scanner.close();
  }
}
