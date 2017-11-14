package com.ting;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        int number = 9119;
        String numberString = String.valueOf(number);
        List<Integer> digits = new ArrayList<>();
        List<Integer> squaredDigits = new ArrayList<>();

        for (int i = 0; i < numberString.length(); i++) {
            digits.add(Character.getNumericValue(numberString.charAt(i)));
        }

        for (Integer digit : digits) {
            squaredDigits.add(digit * digit);
        }

        StringBuilder sb = new StringBuilder();
        String joinedDigits;

        for (Integer digit : squaredDigits) {
            sb.append(digit);
        }

        System.out.println(sb);

    }

}
