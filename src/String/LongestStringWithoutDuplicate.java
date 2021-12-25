package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestStringWithoutDuplicate {

    public static void main (String args[]) {
        String str = "ayushrawat"; // the output should be "ayush"
        System.out.println(findLongestSubString(str));

    }

    /*

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


}
