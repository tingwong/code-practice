package com.ting.Staircase;

public class Solution {

    public static void main(String[] args) {

        StairCase(4);

    }


    public static void StairCase(int n) {

        String[][] matrix = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int k = n - 1 - i;

                if (j < k) {
                    matrix[i][j] = " ";
                } else {
                    matrix[i][j] = "*";
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

}
