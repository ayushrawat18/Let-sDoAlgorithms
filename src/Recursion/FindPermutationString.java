package Recursion;

import java.util.ArrayList;


public class FindPermutationString {
    public static void main(String args[]) {
        String str = "121";
        ArrayList<String> answer = new ArrayList<>();
        findPermutation(str.toCharArray(), 0, answer, new StringBuilder());
        System.out.println(answer);
    }

    private static void findPermutation(char str[], int idx,  ArrayList<String> answer, StringBuilder currStr) {

        if (idx == str.length) {
            answer.add(currStr.toString());
            return;
        }
        else {
            for (int i = idx; i < str.length; i++) {
                swap(i, idx, str);
                currStr.append(str[idx]);
                findPermutation(str, idx+1, answer, currStr);
                swap(i, idx, str);
                currStr.deleteCharAt(currStr.length()-1);
            }
        }

    }

    private static void swap(int idx1, int idx2, char str[]) {
        char temp  = str[idx1];
        str[idx1] = str[idx2];
        str[idx2] = temp;
    }
}