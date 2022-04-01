package com.paolochang;

import java.util.Scanner;

public class _23_WhileLoops {
  public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);
    String input = "";
    
    while(!input.equals("q")) {
      System.out.print("Input (q to quit): ");
      input = scanner.next().toLowerCase();
      if (!input.equals("q"))
        System.out.println(input);
    }
    scanner.close();
  }
}
