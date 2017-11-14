package com.ting;

public class IncreasingCount {

    public static void main(String[] args) {
        int[] numbers = {5, 7, 9, 10, 12, 30, 2, 3, 10, -3, 0, 1};
        System.out.println(increasingCount(numbers));
    }

    public static int increasingCount (int[] numbers) {

        int counter = 1;
        int maxCounter = 0;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > numbers[i-1]) {
                counter++;
            } else {

                if (maxCounter < counter) {
                    maxCounter = counter;
                }

                counter = 1;
            }

        }

        return maxCounter;
    }

}
