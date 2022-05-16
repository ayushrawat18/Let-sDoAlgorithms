package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPermutationWithRepeation {

    public static void main(String args[]) {

        int arr[] = {1,2,1};

        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> currPer = new ArrayList<>();
        generatePermutaion(arr, 0, currPer,  answer);
        System.out.println(answer);
    }

    private static void generatePermutaion(int[] arr, int idx, List<Integer> currPer, List<List<Integer>> answer) {
        if (idx == arr.length) {
            answer.add(new ArrayList<>(currPer));
            return;
        } else {
            Set<Integer> s = new HashSet<>();
            for (int i = idx; i < arr.length; i++) {
                if (s.contains(arr[i]))
                    continue;
                else {
                    s.add(arr[i]);
                    swap(i, idx, arr);
                    currPer.add(arr[idx]);
                    generatePermutaion(arr, idx + 1, currPer, answer);
                    currPer.remove(currPer.size() - 1);
                    swap(i, idx, arr);
                }
            }
        }
    }

    private static void swap(int idx1, int idx2, int str[]) {
        int temp  = str[idx1];
        str[idx1] = str[idx2];
        str[idx2] = temp;
    }
}
