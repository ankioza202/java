/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * @author Ankita Oza
 * @version 1.0
 * @see https://leetcode.com/problems/reverse-integer/
 * @since Aug 30, 2021
 */


class ReverseInteger {


    static int reverse = 0;

    public static int reverse(int number) {
        int reminder = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        if (number >= min && number <= max) {
            /**
             * Reverse number using while loop
             */
            while (number != 0) {
                reminder = number % 10;
                reverse = (reverse * 10) + reminder;
                number = number / 10;
            }

            /**
             * Reverse number using for loop
             */
            for (; number != 0; number /= 10) {
                reminder = number % 10;
                reverse = (reverse * 10) + reminder;
            }

            /**
             * Reverse number using Recursive method call
             */
            if (number != 0) {
                reminder = number % 10;
                reverse = (reverse * 10) + reminder;
                reverse(number / 10);
            }
            return reverse;
        } else {
            return 0;
        }


    }

    public static void main(String[] args) {
        int reverseNumber = reverse(259);
        System.out.println(reverseNumber);
    }

}