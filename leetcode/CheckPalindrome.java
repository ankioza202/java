/**
 * Given an integer x, return true if x is palindrome integer.
 * @author Ankita Oza
 * @version 1.0
 * @see https://leetcode.com/problems/palindrome-number/
 * @since Aug 31, 2021
 */
class CheckPalindrome {

    static int reverse = 0;

    public static boolean isPalindrome(int number) {
        int reminder = 0;
        if (number != 0) {
            reminder = number % 10;
            reverse = (reverse * 10) + reminder;
            isPalindrome(number / 10);
        }

        if (reverse == number && number > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean b = isPalindrome(-121);
        System.out.println(b);
    }

}