package Array;

import java.util.HashMap;
import java.util.Map;

public class ContinousSubArray {

    public static void main(String args[]) {
        int arr[] = {-1,-1,1};
        System.out.println(subarraySum(arr, 0));

    }


        public static int subarraySum(int[] nums, int k) {

            int cSum = 0, ways =0;
            Map<Integer, Integer> sum = new HashMap<>();
            sum.put(0,1);
            for(int i=0; i<nums.length; i++) {
                cSum = cSum + nums[i];
                if(sum.containsKey(cSum - k)) {
                    ways = ways + sum.get(cSum - k);
                }
                sum.put(cSum, sum.getOrDefault(cSum,0)+1);
            }

            return ways;
        }
}
