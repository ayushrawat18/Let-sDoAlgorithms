package Array;

import java.util.Arrays;

public class MinimumArrayToBeSorted {

    public static void main(String args[]) {
        int arr[] = {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
        int indexArray[] = subarraySort(arr);
        System.out.println("["+indexArray[0]+", "+indexArray[1]+"]");
    }


    /*
        Time : O(nlog(n))
        Space : O(n) //copying the array

     */
    public static int[] subarraySort(int[] array) {

        int sortedArray[] = (Arrays.copyOf(array, array.length));
        Arrays.sort(sortedArray); //O(nLog(n))
        int minSubArrayIndex[] = {-1, -1};

        for(int i = 0; i < sortedArray.length; i++) {
            if(sortedArray[i] != array[i]) {
                minSubArrayIndex[0] = i;
                break;
            }
        }

        for(int i = sortedArray.length-1 ; i >=0; i--) {
            if(sortedArray[i] != array[i]) {
                minSubArrayIndex[1] = i;
                break;
            }
        }

        return minSubArrayIndex;
    }
}
