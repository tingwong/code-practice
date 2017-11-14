package com.ting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WildWest {

    public static void main(String[] args) {

        System.out.println(WildWest.dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"}));

    }

    public static String[] dirReduc(String[] arr) {

        List<String> arrayAsList = new ArrayList<>();

        for (String direction : arr) {
            arrayAsList.add(direction);
        }

        int currentArrayLength = arr.length;
        int newArrayLength = 0;
        List<String> newDirections = arrayAsList;

        while (currentArrayLength != newArrayLength) {
            currentArrayLength = newDirections.size();
            newDirections = removeOpposites(newDirections);
            newArrayLength = newDirections.size();
        }

        String[] finalDirections = new String[newDirections.size()];

        for (int i = 0; i < finalDirections.length; i++){
            finalDirections[i] = newDirections.get(i);
        }

        return finalDirections;
    }

    private static List<String> removeOpposites(List<String> numbersList) {

        Map<String, String> directionScore = new HashMap<>();
        directionScore.put("NORTH", "SOUTH");
        directionScore.put("SOUTH", "NORTH");
        directionScore.put("WEST", "EAST");
        directionScore.put("EAST", "WEST");

        List<String> adjacentOppositesRemoved = new ArrayList<>();

        int i = 0;
        while (i + 1 < numbersList.size()) {
            if (numbersList.get(i + 1) == directionScore.get(numbersList.get(i))) {
                i += 2;
            } else {
                adjacentOppositesRemoved.add(numbersList.get(i));
                i++;
            }
        }

        if (i < numbersList.size()) {

            adjacentOppositesRemoved.add(numbersList.get(numbersList.size() - 1));
        }

        return adjacentOppositesRemoved;
    }


}
