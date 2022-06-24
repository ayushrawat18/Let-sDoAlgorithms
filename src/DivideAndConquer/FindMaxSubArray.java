package DivideAndConquer;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Solution will find the maximum sum of subarray using Divide and Conquer technique
 */
public class FindMaxSubArray {

    public static void main(String args[]) {
        // In this array we need to find an subarray where sum is maximum
        //int arr[] = new int[] {13, -2 , -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7 };
        int arr[] = new int[] { 2, -7 ,-11, 4, 2 , 6};
       int sum =  _findMaxSubArray( 0, arr.length - 1, arr);
       System.out.println("Max sum is "+sum);

    }

    public static int _findMaxSubArray(int low, int high, int array[]) {
        if (low == high )
            return (array[low]);
        else {
            int mid = (low + high)/2;
            int lss = _findMaxSubArray(low, mid, array);
            int rss = _findMaxSubArray(mid+1, high, array);
            int css = _findMaxCrossingArraySum(low, mid, high, array);

            if (lss >= rss && lss >=css)
                return lss;
            else if (rss >= lss && rss >= css)
                return rss;
            else
                return css;

        }

    }

    public static int _findMaxCrossingArraySum (int low, int mid,  int high, int array[]) {
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= low ; i--) {
            sum = sum + array[i];
            if (sum > leftSum)
                leftSum = sum;
        }

        sum = 0;
        for (int i = mid + 1; i <= high ; i++) {
            sum = sum + array[i];
            if (sum > rightSum)
                rightSum = sum;
        }

        // return max of either (left sum, right sum, left + right)
        return Math.max(Math.max(leftSum, rightSum), leftSum+rightSum);
    }

}
