package SortingAlgo.SortingInDetails;

import commons.Commons;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSort {

    /**
     * Merge sort
     * Time complexity : O(n log(n))
     * Space Complexity : O(n)
     * Merge sort takes an auxillary array of total size (n) and makes recurrsive calls which could be imagined as binary tree
     * so total space complexity is O(n)
     * @param args
     */
    public static void main(String args[]) {
        int arr[] = {4, 0, -1, 3, -90, 40, 90};
        mergeSortHelper(arr, 0, arr.length - 1);
        Commons.printArray(arr);
    }

    private static void mergeSortHelper(int[] arr, int startIdx, int endIdx) {
        if (startIdx >= endIdx)
            return;

        int mid = (startIdx + endIdx)/2;

        mergeSortHelper(arr, startIdx, mid);
        mergeSortHelper(arr, mid+1, endIdx);

        ArrayList<Integer> aux = new ArrayList<>();

        int i = startIdx, j = mid + 1;
        while (i <= mid && j <= endIdx) {
            if (arr[i] <= arr[j]) {
                aux.add(arr[i]);
                i++;
            } else {
                aux.add(arr[j]);
                j++;
            }
        }

        while (i <= mid) {
            aux.add(arr[i]);
            i++;
        }

        while (j <= endIdx) {
            aux.add(arr[j]);
            j++;
        }

        for (int k = startIdx; k <= endIdx; k++ ) {
            arr[k] = aux.get(k - startIdx);
        }
    }

}
