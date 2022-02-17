package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static void main(String args[]) {
        int arr[] = {2,3,6,7,8};
        int targetSum = 8;
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), arr, targetSum, 0);
        System.out.println(ans);
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start) {
        if(remain < 0)
            return;
        else if(remain == 0)
            list.add(new ArrayList<>(tempList));
        else {
            for(int i = start; i < nums.length && remain >= nums[i]; i++) {
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
