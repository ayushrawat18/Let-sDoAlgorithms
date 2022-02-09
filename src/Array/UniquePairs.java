package Array;

import java.util.HashMap;
import java.util.Map;

public class UniquePairs {
    public static void main(String args[]) {
        int arr[] = {1,1,1,1,1};

        int count = findPairs(arr, 0);
        System.out.println(count);
    }

    private static int findPairs(int[] arr, int diff) {
        if (arr.length == 0 || diff < 0)
            return 0;

        int count = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0)+1);
        }

        for (Integer key : counts.keySet()) {
            if (diff == 0) {
                if (counts.get(key) >= 2) {
                    count ++;
                }
            } else if(counts.containsKey(key + diff)) {
                  count++;
            }
        }
        return count;
    }
}
