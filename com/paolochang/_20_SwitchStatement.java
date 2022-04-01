package com.paolochang;

public class _20_SwitchStatement {
  public static void main(String[] args) throws Exception {
    String role = "moderator";
    
    switch(role) {
      case "admin":
        System.out.println("You're an admin");
        break;
      case "moderator":
        System.out.println("You're a moderator");
        break;
      default:
        System.out.println("You're a guest");
    }
  }
}
