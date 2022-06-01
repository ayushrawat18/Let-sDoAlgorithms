package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {


    public static void main(String args[]) {
        String str1 = "hello i";
        String str2 = "elloh i";

        Boolean isAnagrams = checkAnagrams(str1, str2);
        Boolean isAnagram =  checkStringsAnagrams(str1, str2);

        System.out.println("Is Anagrams "+isAnagrams);
        System.out.println("Is Anagrams "+isAnagram);
    }

    /*
        Algorithm will run on O(nlog(n))
     */
    private static Boolean checkAnagrams(String str1, String str2) {

        if(str1.length() != str2.length())
            return false;

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i <ch1.length; i++) {
            if(ch1[i] != ch2[i])
                return false;
        }
        return true;
    }

    /*
        Time complexity : O(n)
        Space complexity : O(n)

     */
    public static Boolean checkStringsAnagrams(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;

        Map<Character, Integer> chars = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            chars.put(str1.charAt(i), chars.getOrDefault(str1.charAt(i), 0)+1);
            chars.put(str2.charAt(i), chars.getOrDefault(str2.charAt(i), 0 )-1);
        }

        for (Character c : chars.keySet()) {
            if (chars.get(c) != 0)
                return false;
        }
        return true;
    }
}
