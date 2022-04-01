package com.paolochang;

public class _16_LogicalOperators {
  public static void main(String[] args) throws Exception {
    int temperature = 22;
    boolean isWarm = temperature > 20 && temperature <30;
    System.out.println("isWarm: " + isWarm);

    boolean hasHighIncome = false;
    boolean hasGoodCredit = true;
    boolean hasCriminalRecord = false;
    boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
    System.out.println("isEligible: " + isEligible);
  }
}
