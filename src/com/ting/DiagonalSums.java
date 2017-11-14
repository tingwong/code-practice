package com.ting;

public class DiagonalSums {

    public static void diagonalDifference (int[][] matrix) {

        int rightDiagonalSum = 0;
        int leftDiagonalSum = 0;

        for (int i = 0; i < matrix[0].length; i++) {

            rightDiagonalSum += matrix[i][i];
            leftDiagonalSum += matrix[i][matrix[0].length - 1 - i];
        }

        System.out.print(Math.abs(rightDiagonalSum - leftDiagonalSum));

    }
}
