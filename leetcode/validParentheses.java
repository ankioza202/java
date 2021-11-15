/**
 * Valid Parentheses
 *
 * @author Ankita Oza
 * @version 1.0
 * @see https://leetcode.com/problems/valid-parentheses/
 * @since Nov 14, 2021
 */

import java.util.*;

public class Test {

    public static boolean isValid(String s) {

        if (s == null || s.trim().length() == 0 || s.trim().length() == 1) return false;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            Character curr = s.charAt(i);
            if (curr == '(' || curr == '{' || curr == '[') stack.push(curr);
            else if (curr == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            } else if (curr == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            } else if (curr == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(isValid("{{}}()[()]"));
        long time = System.currentTimeMillis() - start;
        System.out.println("Execution time in milliseconds: " + time + "ms");
    }
}
