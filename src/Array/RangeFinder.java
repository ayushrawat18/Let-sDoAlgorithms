package Array;

import commons.Commons;

import java.util.Arrays;

public class RangeFinder {


    public static void main(String args[]) {

        //int arr[] = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
        int arr[] = {-7, -7, -7, -7, 8, -8, 0, 9, 19, -1, -3, 18, 17, 2, 10, 3, 12, 5, 16, 4, 11, -6, 8, 7, 6, 15, 12, 12, -5, 2, 1, 6, 13, 14, -4, -2};
        int ansList[]= largestRange(arr);

        Commons.printArray(ansList);

    }

    /**
     * Time : O(nLog(n))
     * Space : O(n) : Arrays.sort uses the Dual pivot Quick sort algorithm
     * @param arr
     * @return
     */
    public static int[] largestRange(int[] arr) {
        Arrays.sort(arr);
        int ansList[] = new int[]{arr[0], arr[0]};
        int startRange = arr[0], endRange, nextNum = arr[0] + 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1])
                continue;
            if (arr[i] == nextNum ) {
                nextNum = nextNum + 1;
                endRange = arr[i];
                if ( Math.abs((ansList[1]) - (ansList[0])) <= Math.abs((endRange) - (startRange))) {
                    ansList[0] = startRange;
                    ansList[1] = endRange;
                }
                continue;
            }

            startRange = arr[i];
            nextNum = arr[i] + 1;

        }

        return ansList;
    }

}
