package com.paolochang;

public class _04_String {
  public static void main(String[] args) throws Exception {
    String message = "Hello, World!";
    System.out.println(message);
    System.out.println(message.startsWith("!"));
    System.out.println(message.endsWith("!"));
    System.out.println(message.length());
    System.out.println(message.indexOf("H"));
    System.out.println(message.replace("!", "~"));
    System.out.println(message.toLowerCase());

    String space = "   message with spaces    ";
    System.out.println("|" + space + "|");
    System.out.println("|" + space.trim() + "|");
  }
}
