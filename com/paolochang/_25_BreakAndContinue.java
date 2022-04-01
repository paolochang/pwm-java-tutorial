package com.paolochang;

import java.util.Scanner;

public class _25_BreakAndContinue {
  public static void main(String[] args) throws Exception {
    
    Scanner scanner = new Scanner(System.in);
    String input = "";
    
    while(true) {
      System.out.print("Input (q to quit, p to pass): ");
      input = scanner.next().toLowerCase();
      if (input.equals("p"))
        continue;
      if (input.equals("q"))
        break;
      System.out.println(input);
    }
    scanner.close();
  }
}
