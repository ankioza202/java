/**
 * Roman to Integer
 *
 * @author Ankita Oza
 * @version 1.0
 * @see https://leetcode.com/problems/roman-to-integer/
 * @since Sep 02, 2021
 */

import java.util.HashMap;

class RomanToInteger {

    public static int romanToInt(String s) {

        char[] charString = s.toCharArray();
        int sum = 0;
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("I", 1);
        myMap.put("V", 5);
        myMap.put("X", 10);
        myMap.put("L", 50);
        myMap.put("C", 100);
        myMap.put("D", 500);
        myMap.put("M", 1000);
        int currKeyVal = 0;
        for (int i = 0; i < charString.length; i++) {
            if (i > 0) {
                if (myMap.get(String.valueOf(charString[i])) > myMap.get(String.valueOf(charString[i - 1]))) {
                    currKeyVal = myMap.get(String.valueOf(charString[i])) - myMap.get(String.valueOf(charString[i - 1]));
                    sum -= myMap.get(String.valueOf(charString[i - 1]));

                } else {
                    currKeyVal = myMap.get(String.valueOf(charString[i]));
                }

            } else {
                currKeyVal = myMap.get(String.valueOf(charString[i]));
            }
            sum += currKeyVal;
        }
        return sum;

    }


    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

}