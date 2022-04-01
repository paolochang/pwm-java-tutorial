package com.paolochang;

import java.util.Arrays;

public class _07_MultidimensionalArrays {
  public static void main(String[] args) throws Exception {
    int[][] array2d = new int[2][3];
    array2d[0][0] = 1;
    System.out.println(Arrays.deepToString(array2d));

    int[][] newArray = { { 1, 2, 3 }, { 4, 5, 6 } };
    System.out.println(Arrays.deepToString(newArray));

  }
}
