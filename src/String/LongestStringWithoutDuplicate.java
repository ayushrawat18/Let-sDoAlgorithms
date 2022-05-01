package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestStringWithoutDuplicate {

    public static void main (String args[]) {
        String str = "pwwkew";
        System.out.println(findLongestSubString(str));

        int[][] arr = { { 1, 2 , 3}, { 4, 5, 6 } };
        int first[] = arr[0];
    }

    /*
        This is the brute force approach solution runs on O(n2) | Space : O(n)
     */
    public static String findLongestSubString(String str) {
        StringBuilder longestStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
              String subStr = str.substring(i,j+1);
              if (subStr.length() > longestStr.length() && !checkDuplicate(subStr)) {
                longestStr.replace(0,longestStr.length(),subStr);
              }

            }
        }
        return longestStr.toString();
    }

    private static boolean checkDuplicate(String subStr) {
        Set<Character> s = new HashSet<>();
        for (int i = 0; i < subStr.length(); i++) {
            if(s.contains(subStr.charAt(i)))
                return true;
            else
                s.add(subStr.charAt(i));
        }
        return false;
    }

/***
 * We will solve this problem in
 * O(n), using two pointer approach
 */


public String findLongestSubStr(String str) {


    return null;
}

}
