package com.ting.Implementation;

import java.util.*;

public class MigratoryBirds {

    public static void main(String[] args) {

        int[] birds = {1, 4, 4, 4, 5,5,5, 3};
        System.out.println(migratoryBirds(birds));

    }

    public static int migratoryBirds(int[] ar) {
        Map<Integer, Integer> freqHash = freqHash(ar);

        Integer maxFreq = null;
        Integer minValue = null;

        for (Map.Entry<Integer, Integer> entry : freqHash.entrySet()) {

            if (maxFreq == null || entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                minValue = entry.getKey();
            } else if (entry.getValue() == maxFreq && entry.getKey() < minValue) {
                minValue = entry.getKey();
            }

        }

        return minValue;

    }

    private static Map<Integer, Integer> freqHash(int[] ar) {

        Map<Integer, Integer> freqHash = new HashMap<>();

        for (Integer arrayNumber : ar) {
                freqHash.put(arrayNumber, freqHash.getOrDefault(arrayNumber, 0) + 1);
        }

        return freqHash;

    }


}
