package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumCostStairs {

    public static void main(String args[]) {
        Integer arr[] = {10,15,20};

        System.out.println(findMinimumCost(arr));
    }

    private static int findMinimumCost(Integer[] arr) {


        Integer[] cost = Arrays.copyOf(arr,arr.length+1);
        for (int i = arr.length-3; i >=0 ; i--) {
            cost[i] = Math.min(cost[i]+cost[i+1], cost[i]+cost[i+2]);
        }

        return Math.min(cost[0], cost[1]);

    }
}
