package Recursion.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class GeneratePermutationOfString {
    public static void main(String[] args) {
        String str = "abc";
        generatePermutationHelper(str.toCharArray(), 0, new ArrayList<Character>());
        Arrays.asList(str.toCharArray());
        String str1 = "aab";
        generatePermutationContainsDupHelper(str.toCharArray(), 0, new ArrayList<Character>());
    }

    private static void generatePermutationHelper(char[] str, int idx, ArrayList<Character> slate) {

        if (slate.size() == str.length) {
            System.out.println(slate);
            return;
        }


        for (int i = idx; i < str.length; i++) {
            slate.add(str[i]);
            swap(idx, i, str);
            generatePermutationHelper(str, idx+1, slate);
            slate.remove(slate.size()-1);
            swap(idx, i, str);
        }

    }



    private static void generatePermutationContainsDupHelper(char[] str, int idx, ArrayList<Character> slate) {

        if (slate.size() == str.length) {
            System.out.println(slate);
            return;
        }

        for (int i = idx; i < str.length; i++) {
            slate.add(str[i]);
            swap(idx, i, str);
            generatePermutationHelper(str, idx+1, slate);
            slate.remove(slate.size()-1);
            swap(idx, i, str);
        }

    }

    private static void swap(int idx1, int idx2, char[] str) {
        char ch = str[idx1];
        str[idx1] = str[idx2];
        str[idx2] = ch;
    }


}
