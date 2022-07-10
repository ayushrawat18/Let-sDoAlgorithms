package Recursion.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSetGeneration {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        generatePowerSet(arr,0,new ArrayList<Integer>(), result);
        System.out.println(result);
    }

    /**
     * space : O(2^n)
     * time : O(n*2^n)
     */
    private static void generatePowerSet(int[] arr, int idx, ArrayList<Integer> slate, List<List<Integer>> result) {
        if (idx == arr.length) {
            result.add(new ArrayList<>(slate));
            return;
        }

        //exclusion
        generatePowerSet(arr, idx+1, slate, result);

        //inclusion
        slate.add(arr[idx]);
        generatePowerSet(arr, idx+1, slate, result);
        slate.remove(slate.size()-1);
    }


}
