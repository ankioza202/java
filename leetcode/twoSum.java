/**
 * Write a method that accepts a number as input and prints whether the number is odd or even using an if/else statement as well as a ternary expression.
 * @author  Ankita Oza
 * @version 1.0
 * @since   Aug 30, 2021
 * @see https://leetcode.com/problems/two-sum/
 */
]=

import java.util.Arrays;

class TwoSum {
    
    public static int[] sumTwo(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i] + nums[i + 1];
            if (sum == target) {
                return new int[]{i, i + 1};
            }
        }
        return new int[]{0, 1};
    }

    public static void main(String[] args) {
        int[] indicesTwoNumbs = sumTwo(new int[]{2,7,11,15}, 18);
        System.out.println(Arrays.toString(indicesTwoNumbs));
    }

}