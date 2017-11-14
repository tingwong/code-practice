package com.ting.BirthdayCakeCandles;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {

        int[] ar = { 5, 6, 9, 9, 1};
        System.out.println(birthdayCakeCandles(ar));

    }

    private static int birthdayCakeCandles(int[] ar) {
        Map<Integer, Integer> freqHash = freqHash(ar);

        int maxInteger = Arrays.stream(ar)
                .max()
                .getAsInt();

        return freqHash.get(maxInteger);


    }

    private static Map<Integer, Integer> freqHash (int[] ar) {

        Map<Integer, Integer> freqHash = new HashMap<>();

        for (Integer integer : ar) {

            if (freqHash.containsKey(integer)) {
                freqHash.put(integer, freqHash.get(integer) + 1);
            } else {
                freqHash.put(integer, 1);
            }

        }

        return freqHash;

    }
}
