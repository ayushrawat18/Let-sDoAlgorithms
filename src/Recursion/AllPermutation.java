package Recursion;

import java.util.ArrayList;

public class AllPermutation {
    public static void main(String[] args) {
        String str = "helo";
        findPermutationReptationAllowed(str.toCharArray(), 0, new ArrayList<Character>());
    }

    private static void findPermutationReptationAllowed(char[] str, int idx, ArrayList<Character> slate) {
        //base
        if (idx == str.length) {
            System.out.println(slate);
            return;
        }

        for (int i = 0; i < str.length; i++) {
            slate.add(str[i]);
            findPermutationReptationAllowed(str, idx+1, slate);
            slate.remove(slate.size()-1);
        }
    }
}
