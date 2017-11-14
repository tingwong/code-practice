package com.ting;

// https://www.codewars.com/kata/554ca54ffa7d91b236000023/train/java

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeleteOccurrences {

    public static void main(String[] args) {

        deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3);

    }


    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        Map<Integer, Integer> freqHash = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        for (Integer element : elements) {

            int frequency = freqHash.getOrDefault(element, 0);

            if (frequency < maxOccurrences) {
                freqHash.put(element, frequency + 1);
                resultList.add(element);
            }
        }

        int[] result = new int[resultList.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
            System.out.println(result[i]);
        }

        return result;

    }

}
