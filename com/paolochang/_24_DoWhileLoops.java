package com.paolochang;

import java.util.Scanner;

public class _24_DoWhileLoops {
  public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);
    String input = "";
    
    do {
      System.out.print("Input (q to quit): ");
      input = scanner.next().toLowerCase();
      System.out.println(input);
    } while (!input.equals("q"));
    scanner.close();
  }
}
