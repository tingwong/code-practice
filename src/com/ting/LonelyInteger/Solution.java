package com.ting.LonelyInteger;

import java.util.HashMap;
import java.util.Map;

//Consider an array of  integers, , where all but one of the integers occur in pairs.
// In other words, every element in  occurs exactly twice except for one unique element.

public class Solution {

    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2};
        int[] integerArray1 = {1};
        System.out.println(oddOneOut(integerArray));
        System.out.println(oddOneOut(integerArray1));
    }


    private static Integer oddOneOut(int[] arrayOfIntegers) {

        if (arrayOfIntegers.length == 1) {
            return arrayOfIntegers[0];
        }

        Map<Integer, Integer> freqMap = new HashMap<>();
        freqMap = createFreqMap(arrayOfIntegers);

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }

    private static Map<Integer, Integer> createFreqMap(int[] arrayOfIntegers) {

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < arrayOfIntegers.length; i++) {
            int integerKey = arrayOfIntegers[i];
            if (freqMap.containsKey(integerKey)) {
                freqMap.put(integerKey, freqMap.get(integerKey) + 1);
            } else {
                freqMap.put(integerKey, 1);
            }
        }

        return freqMap;

    }
}
