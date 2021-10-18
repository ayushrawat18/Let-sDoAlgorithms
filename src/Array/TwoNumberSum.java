package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoNumberSum {

    public static void main (String args[]) {

        int arr[] = new int[]{1,2,3,45,6,78,9};
        int target = 46;

        int pairs[] = findPairIndex(arr, target);

        Map<String, HashSet<Integer>> h = new HashMap<>();
        Map<String, HashMap<String, Integer>> hh = new HashMap<>();


        if(pairs.length == 0)
            System.out.println("Pair not found");
        for (int i=0; i< pairs.length; i++)
            System.out.println("pairs "+pairs[i]);
    }


    public static int [] findPairIndex(int arr[], int target) {

        Set<Integer> s = new HashSet<>();
        int numbers[] = new int[2];
        List<Integer> l = new ArrayList<>();


        for (int i =0 ; i<arr.length ; i++) {
            int potentialNumber = target - arr[i];
            if(s.contains(potentialNumber))
                return new int[]{arr[i], potentialNumber};
            else
                s.add(arr[i]);
        }

        return new int[0];
    }


    public static int [] findPairIndex2(int arr[], int target) {

        int left = 0;
        int right = arr.length-1;
        Arrays.sort(arr);

        while (left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target ) {
                return new int[]{left, right};
            } else if (sum > target) {
                right --;
            } else
                left ++;
        }
        return new int[0];

    }

}
