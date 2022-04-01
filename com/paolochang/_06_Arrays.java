package com.paolochang;

import java.util.Arrays;

public class _06_Arrays {
  public static void main(String[] args) throws Exception {
    // Java array has fixed length
    int[] numbers = new int[5];
    numbers[0] = 1;
    numbers[1] = 2;

    System.out.println(Arrays.toString(numbers));

    int[] numArrays = { 2, 3, 5, 1, 4 };

    System.out.println(numArrays.length);
    System.out.println(Arrays.toString(numArrays));
    Arrays.sort(numArrays);
    System.out.println(Arrays.toString(numArrays));
  }
}
