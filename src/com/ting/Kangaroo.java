package com.ting;

public class Kangaroo {

    public static void main(String[] args) {

        System.out.println(kangaroo(21, 6, 47, 3));

    }


    private static String kangaroo(int x1, int v1, int x2, int v2) {

        int currentValue1 = x1;
        int currentValue2 = x2;

        if (v1 == v2 && x1 == x2) {
            return "YES";
        }

        if (v2 > v1) {

            while (currentValue2 < currentValue1) {

                numberCheck(currentValue1,currentValue2,v1,v2);

            }

            return "NO";

        } else if (v1 > v2) {
            while (currentValue1 < currentValue2) {

                numberCheck(currentValue1,currentValue2,v1,v2);
            }
            return "NO";
        }


    return "NO";

    }

    private static String numberCheck(int currentValue1, int currentValue2, int v1, int v2) {


        currentValue1 += v1;
        currentValue2 += v2;

        if (currentValue1 == currentValue2) {
            return "YES";
        }

        return "NO";

    }




}
