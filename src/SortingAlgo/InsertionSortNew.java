package SortingAlgo;

import commons.Commons;

public class InsertionSortNew {

    public static void main(String args[]) {
        int arr[] = {3,2,1,0,9,3,10};
       int sortedArray[] = insertionSort(arr);
       Commons.printArray(sortedArray);
    }

    private static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]) {
               Commons.swap(j, j-1, arr);
               j--;
            }
        }
        return arr;
    }


}
