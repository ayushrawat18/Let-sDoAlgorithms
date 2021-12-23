package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidatePermutation {

    public static void main(String args[]) {
        String str1 = "icemann";
        String str2 = "anmicen";

        System.out.println(validatePermutation(str1, str2));
        System.out.println(validatePermutations(str1, str2));
        System.out.println(validatePermutationOptimized(str1, str2));
    }

    private static boolean validatePermutationOptimized(String str1, String str2) {

        if (str1.length() != str2.length())
            return false;

        int countChar[] = new int[256];
        int index;
        for (int i = 0; i < str1.length(); i++) {
            index = str1.charAt(i);
            countChar[index] = countChar[index] + 1;
        }

        for (int i = 0; i < str2.length(); i++) {
            index = str2.charAt(i);
            countChar[index] = countChar[index] - 1;
            if(countChar[index] < 0)
                return false;
        }
        return true;
    }

    private static boolean validatePermutations(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        Map<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            count.put(str1.charAt(i), count.getOrDefault(str1.charAt(i), 0)+1);
            count.put(str2.charAt(i), count.getOrDefault(str2.charAt(i), 0)-1);
        }

        for (int i : count.values()) {
            if(i != 0)
                return false;
        }
            return true;
    }

    /*
        Space : O(n)
        Time : O(nlogn)
     */
    private static boolean validatePermutation(String str1, String str2) {

        if(str1.length() != str2.length())
            return false;

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < ch1.length; i++) {
            if(ch1[i] != ch2[i])
                return false;
        }

        return true;
    }





}
