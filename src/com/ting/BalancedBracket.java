package com.ting;

import java.util.*;

public class BalancedBracket {

    public static boolean isBalanced(String expression) {

        // Early fail: if expression length isn't an even number it must not be balanced
        int length = expression.length();
        if (length % 2 != 0) {
            return false;
        }

        Map<Character, Character> complementaryBrackets = new HashMap<>();
        complementaryBrackets.put('{', '}' );
        complementaryBrackets.put('}', '{');
        complementaryBrackets.put('[', ']');
        complementaryBrackets.put(']', '[');
        complementaryBrackets.put('(', ')');
        complementaryBrackets.put(')', '(');

        char[] expressionArray = expression.toCharArray();

        Stack<Character> bracketPairs = new Stack<>();

        for (int i = 0; i < expressionArray.length; i++) {
            char bracketType = expressionArray[i];

            if (bracketPairs.empty()) {
                bracketPairs.push(bracketType);
            } else if (bracketPairs.peek() == complementaryBrackets.get(bracketType)) {
                    bracketPairs.pop();
            } else {
                bracketPairs.push(bracketType);
            }
        }

        if (bracketPairs.empty()) {
            return true;
        } else {
            return false;
        }

    }


    public static void main(String[] args) {

        System.out.println(isBalanced("{)[](}]}]}))}(())("));
        System.out.println(isBalanced("}][}}(}][))]"));
        System.out.println(isBalanced("{{[[(())]]}}"));

    }
}