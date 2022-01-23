package Array;

import commons.Commons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreeNumberSum {

    public static void main(String args[]) {

        int arr[] = new int[]{12, 11, 1, 2, -6, 5, -8, 6};
       List<List<Integer>> list =  findTriplets(arr ,0 );
        System.out.println(list);

    }


    private static List<List<Integer>> findTriplets(int[] arr, int sum) {

        List<List<Integer>> arrList = new ArrayList<>();
        for (int i=0; i<arr.length-2; i++) {
            int currentNumber = arr[i];
            Set<Integer> set = new HashSet<>();
            for (int j = i+1; j < arr.length; j++) {
                int diff = sum - (currentNumber + arr[j]);
                if (set.contains(diff)) {
                    arrList.add(Arrays.asList(currentNumber, arr[j], diff-sum));

                } else
                    set.add(arr[j]);
            }
        }
            return arrList;
        }
    }

