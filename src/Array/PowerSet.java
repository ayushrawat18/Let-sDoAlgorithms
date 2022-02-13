package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {

    public static void main(String args[]) {

        int array[] = new int[]{1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        findPowerSet(array, ans);
        System.out.println(ans);

    }

    private static void findPowerSet(int[] array, List<List<Integer>> ans) {
        ans.add(new ArrayList<>());
        for (int i = 0; i < array.length; i++) {
            ans.add(new ArrayList<>(Arrays.asList(array[i])));
            List<Integer> powerSet = new ArrayList<>();
            powerSet.add(array[i]);
            for (int j = i+1; j < array.length; j++) {
                powerSet.add(array[j]);
                ans.add(new ArrayList<>(Arrays.asList(array[i], array[j])));
            }
            if (powerSet.size() > 2)
                ans.add(powerSet);
        }
    }
}
