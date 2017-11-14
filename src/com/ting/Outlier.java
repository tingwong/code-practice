package com.ting;

// https://www.codewars.com/kata/5526fc09a1bbd946250002dc

public class Outlier {

    public static void main(String[] args) {
        int[] exampleTest1 = {2, 6, 8, -10, 3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        int[] exampleTest4 = {2, -6, 8, -10, -3};

        System.out.println(find(exampleTest4));

    }

    static int find(int[] integers) {
        // mostly evens
        int evenCounter = 0;
        int oddCounter = 0;

        for (Integer num : integers) {
            if (num % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }

        if (evenCounter > oddCounter) {
            for (Integer num : integers) {
                if (Math.abs(num % 2) == 1) {
                    return num;
                }
            }
        } else {
            for (Integer num : integers) {
                if (num % 2 == 0) {
                    return num;
                }
            }
        }

        return 0;
    }
}
