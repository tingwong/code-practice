package com.ting.FindMedian;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] array = {1};
        System.out.println(findMedian(array));
        int[] array2 = {1,2};
        System.out.println(findMedian(array2));

    }

    private static Double findMedian(int[] numberArray) {

        Arrays.sort(numberArray);
        double median;
        int index = numberArray.length / 2;

        if (numberArray.length % 2 == 1) {

            median = numberArray[index];
            return median;
        } else if (numberArray.length % 2 == 0) {
            int secondIndex = index - 1;
            double sum = numberArray[index] + numberArray[secondIndex];
            median = sum / 2;
            return median;
        }

        return null;

    }

}
