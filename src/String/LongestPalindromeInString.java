package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestPalindromeInString {

    public static void main(String args[]) {
//        String str = "ddabbad";
//        String subStr = findLongestPalindrome(str); // O(n3)
//        System.out.println(longestPalindrome(str)); //O(n2)
//        System.out.println(subStr);


        Set<Character> s = new HashSet<>();
        s.add('c');
        s.add('d');

    }

    public static String findLongestPalindrome(String str) {

        StringBuilder longestPalindrome = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            temp.setLength(0);
            for (int j = i; j < str.length(); j++) {
                temp = temp.append(str.charAt(j));
                if(temp.length() > longestPalindrome.length() && isPlaindrome(temp))  {
                    longestPalindrome = new StringBuilder(temp);
                }
            }
        }
        return longestPalindrome.toString();
    }

    public static boolean isPlaindrome(StringBuilder temp) {
       Palindrome p = new Palindrome();
       return p.checkPalindrome(temp.toString());
    }

    public static String longestPalindrome(String str) {

        int longestPalindrome[] = new int[]{0,1};
        for (int i = 1; i < str.length(); i++) {
            int odd[] = getLongestPalindrome(str, i-1, i+1);
            int even[] = getLongestPalindrome(str, i-1, i);

            int oddLength = odd[1] - odd[0];
            int evenLength = even[1] - even[0];
            int longestLength = longestPalindrome[1] - longestPalindrome[0];
            if(oddLength > longestLength)
                longestPalindrome = odd;
            else if (evenLength > longestLength)
                longestPalindrome = even;

        }
        return str.substring(longestPalindrome[0], longestPalindrome[1]);
    }

    private static int[] getLongestPalindrome(String str, int left, int right) {
        while (left >= 0 &&  right < str.length() && left < right ) {
            if (str.charAt(left) != str.charAt(right))
                break;
            left --;
            right ++;
        }
        return new int[]{left + 1, right};
    }


}
