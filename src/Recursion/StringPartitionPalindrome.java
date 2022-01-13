package Recursion;

import java.util.ArrayList;

import java.util.List;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class StringPartitionPalindrome {

    public static void main(String args[]) {

        String str = "aabb";


        Map<String, Integer> s = new HashMap<>();
        s.isEmpty();

        List<List<String>> ans = new ArrayList<>();
        List<String> current = new ArrayList<>();

        getPalindromicPartition(str, ans, current);

        System.out.println(" "+ans.toString());
    }

    private static void getPalindromicPartition(String str, List<List<String>> ans, List<String> current ) {

        if (str.length() == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String partitionStr = str.substring(0, i+1);
            String remStr = str.substring(i+1);

            if (isPalindrome(partitionStr)) {
                current.add(partitionStr);
                getPalindromicPartition(remStr, ans, current);

                current.remove(current.size()-1);
            }
        }

    }

    private static boolean isPalindrome(String partitionStr) {
        int i = 0;
        int j = partitionStr.length()-1;

        while (i<j) {
            if (partitionStr.charAt(i) != partitionStr.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
