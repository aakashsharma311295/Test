package binarysearch;

import java.util.ArrayList;
import java.util.List;

public class StringExpression {
    private static final String[] list = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    // Helper function to convert a string expression to its corresponding number
    // e.g., "nine" -> 9
    private static int getValue(String temp) {
        for (int x = 0; x < 10; x++) {
            if (temp.equals(list[x])) {
                return x;
            }
        }
        return -1;
    }

    // Helper function to convert a character digit to its string expression
    // e.g., '4' -> "four"
    private static String getExpression(char digit) {
        int index = digit - '0';
        return list[index];
    }

    public static String stringExpression(String str) {
        String temp = "";
        String number = "";
        List<Integer> numberList = new ArrayList<>();

        for (int x = 0; x < str.length(); x++) {
            temp += str.charAt(x);

            int value = getValue(temp);
            if (value >= 0 && value <= 9) {
                number += value;
                temp = "";
            }

            if (temp.equals("plus") || temp.equals("minus") || x == str.length() - 1) {
                int result = Integer.parseInt(number);
                numberList.add(result);
                number = "";

                if (temp.equals("plus")) {
                    numberList.add(0);
                } else if (temp.equals("minus")) {
                    numberList.add(1);
                }
                temp = "";
            }
        }

        int total = numberList.get(0);
        for (int x = 1; x < numberList.size() - 1; x += 2) {
            if (numberList.get(x) == 0) {
                total += numberList.get(x + 1);
            } else {
                total -= numberList.get(x + 1);
            }
        }

        String finalString = "";

        if (total < 0) {
            finalString += "negative";
        }

        String totalStr = Integer.toString(Math.abs(total));
        for (int x = 0; x < totalStr.length(); x++) {
            finalString += getExpression(totalStr.charAt(x));
        }

        return finalString;

    }

    public static void main(String[] args) {
        System.out.println(stringExpression("onezeropluseight")); // oneeight
        System.out.println(stringExpression("oneminusoneone")); // negativeonezero
        System.out.println(stringExpression("foursixminustwotwoplusonezero")); // threefour
    }
}
