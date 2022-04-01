package com.paolochang;

public class _05_EscapeSequences {
  public static void main(String[] args) throws Exception {
    String message = "Hello, \"Paolo\"!";
    System.out.println(message);

    // In Windows path: c:\Windows\...
    String path = "c:\\Windows\\...";
    System.out.println(path);

    String newlines = "line1\nline2";
    System.out.println(newlines);

    String txtwTab = "\tTab!";
    System.out.println(txtwTab);
  }
}
