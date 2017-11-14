package com.ting;

public class Grading {

    public static void main(String[] args) {

        int[] grades = { 73, 67, 38, 33};

        int[] solvedGrades = solve(grades);

        for (Integer grade : solvedGrades) {
            System.out.println(grade);
        }

    }

    private static int[] solve (int[] grades) {
        int[] roundedGrades = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            roundedGrades[i] = rounding(grades[i]);
        }

        return roundedGrades;

    }

    private static int rounding(int grade) {

        if (grade < 38) {
            return grade;
        } else if (grade % 5 > 2) {
            return grade + (5 - grade % 5);
        }

        return grade;

    }
}
