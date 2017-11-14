package com.ting;

public class DivisibleBy {

    public static void main(String[] args) {
        System.out.println(thirt(8529));
    }

    public static long thirt(long n){

        long remainder = 0;
        long newRemainder = n;
        while (remainder != newRemainder) {
            remainder = newRemainder;
            newRemainder = once(newRemainder);
        }
        return newRemainder;

    }

    public static long once(long n) {
        long remainder = 0;

        int numberOfDigits = String.valueOf(n).length();
        int[] remainders = {1, 10, 9, 12, 3, 4};
        int newN = (int) n;
        int lastDigit = 0;

        for (int i = 0; i < numberOfDigits; i++) {
            lastDigit = newN % 10;
            remainder += lastDigit * remainders[i % remainders.length];
            newN = newN / 10;
        }
        return remainder;

    }
}
