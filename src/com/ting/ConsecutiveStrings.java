package com.ting;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveStrings {

    public static void main(String[] args) {
        System.out.println(longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2));
    }

    public static String longestConsec(String[] strarr, int k) {

        if (strarr.length == 0 || k < 1 || k > strarr.length) {
            return "";
        }

        int[] lengthArray = calcLengthOfNStrings(strarr, k);
        Integer maxLengthIndex = null;
        Integer max = null;

        for (int i = 0; i < lengthArray.length; i++) {
            if (max == null || lengthArray[i] > max) {
                max = lengthArray[i];
                maxLengthIndex = i;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = maxLengthIndex; i < maxLengthIndex + k; i++) {
            sb.append(strarr[i]);
        }

        return sb.toString();


    }

    private static int[] calcLengthOfNStrings(String[] strArray, int n) {
        int indexToStop = strArray.length - n;
        List<Integer> lengthOfConsecutiveWord = new ArrayList<>();

        for (int i = 0; i < indexToStop + 1; i++) {
            int length = 0;
            for (int j = i; j < i + n; j++) {
                length += strArray[j].length();
            }
            lengthOfConsecutiveWord.add(length);
        }

        int[] returnArray = new int[lengthOfConsecutiveWord.size()];

        for (int i = 0; i < lengthOfConsecutiveWord.size(); i++) {
            returnArray[i] = lengthOfConsecutiveWord.get(i);
        }

        return returnArray;

    }
}
