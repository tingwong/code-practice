package com.ting;

import java.util.Arrays;

public class MiniMaxSum {

    public static void main(String[] args) {

        long[] integers = {769082435, 210437958, 673982045, 375809214, 380564127};

        MaxMinSum(integers);

    }

    public static void MaxMinSum(long[] integers) {

        Arrays.sort(integers);

        long totalSum = Arrays.stream(integers)
                        .sum();

        long maxSum = totalSum - integers[integers.length - 1];
        long minSum = totalSum - integers[0];

        System.out.print(maxSum + " ");
        System.out.print(minSum);

    }

}
