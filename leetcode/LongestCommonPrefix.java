/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * @author Ankita Oza
 * @version 1.0
 * @see https://leetcode.com/problems/longest-common-prefix/
 * @since Nov 13, 2021
 */
import java.util.*;

public class Test {

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length > 0) {

            Arrays.sort(strs);

            char[] firstStrChArray = strs[0].toCharArray();
            String lastStr = strs[strs.length - 1];
            String result = "";
            for (int i = 0; i < firstStrChArray.length; i++) {
                String finalStr = result + firstStrChArray[i];
                if (lastStr.startsWith(finalStr)) {
                    result += String.valueOf(firstStrChArray[i]);
                } else {
                    break;
                }

            }
            return result;

        }
        return "";

    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}