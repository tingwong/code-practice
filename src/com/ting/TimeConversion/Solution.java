package com.ting.TimeConversion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {

        String time1 = "12:05:45PM";
        String time2 = "12:05:45AM";
        System.out.println(timeConversion(time1));
        System.out.println(timeConversion(time2));

    }

    private static String timeConversion(String s) {

        String timeOfDay = s.substring(8);
        s = s.substring(0,8);
        String[] time = s.split(":");

        if (timeOfDay.equals("PM")) {
            int newTime = (Integer.parseInt(time[0]) + 12);
            String newHour;
            if (newTime >= 24) {
                newHour = "12";
            } else {
                newHour = Integer.toString(newTime);
            }

            time[0] = newHour;
        } else {

            if (Integer.parseInt(time[0]) == 12) {
                time[0] = "00";
            }

        }

        String finalTime = Arrays.stream(time)
                .collect(Collectors.joining(":"));

        return finalTime;


    }
}
