package Recursion.practice;

import java.util.List;

public class PalindromicDecomposition {

    public static void main(String[] args) {
        String  s = "abracadabra";
        String slate = s.charAt(0) + "";
        String lastStr = s.charAt(0) + "";
        palindromicDecompositionHelper(s, 1, slate, lastStr);

    }

    private static void palindromicDecompositionHelper(String str, int idx, String slate, String lastStr) {
        if (idx == str.length()) {
            if (isPalindrome(lastStr)) {
                System.out.println(slate);
            }
            return;
        }
        //recursive case : concatination
        palindromicDecompositionHelper(str, idx+1, slate+str.charAt(idx), lastStr+str.charAt(idx));

        //partition
        if (!isPalindrome(lastStr))
            return;
        lastStr = str.charAt(idx) + "";
        palindromicDecompositionHelper(str, idx+1, slate+"|"+str.charAt(idx), lastStr);
    }

    private static boolean isPalindrome(String str) {
        int left = 0, right = str.length()-1;

        while(left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
