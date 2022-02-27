package slidingwindow;

public class FindMaxSumOfSizeK {

    public static void main(String args[]) {
        int arr[] = {10,20,30,40,50}; // Max sum should be 90
        System.out.println(findMaxSumOfSizeK(arr, 4));
    }

    /**
     * Sliding window problem
     * Time O(n)
     * Space O(1)
     * @param arr
     * @param k
     * @return
     */
    private static int findMaxSumOfSizeK(int[] arr, int k) {
        int res = 0;
        int currentWindowSize = -1;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = max + arr[i];
            currentWindowSize ++;
            if (currentWindowSize == k-1) {
               res = Math.max(res, max);
               max = max - arr[i - k +1];
               currentWindowSize --;
            }
        }

        return res;
    }
}
