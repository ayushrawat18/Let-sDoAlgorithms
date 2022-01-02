package SortingAlgo;

import commons.Commons;

public class BubbleSort {

    public static void main(String args[]) {

        int arr[] = {5,4,2,1,8,9,0};
        int sortedArray[] = bubbleSort(arr);
        Commons.printArray(sortedArray);
    }

    private static int [] bubbleSort(int[] arr) {
        boolean isSorted = false;
        int counter = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1 - counter; i++) {
                if(arr[i] > arr[i+1]) {
                    Commons.swap(i, i+1, arr);
                    isSorted = false;
                }
            }
            counter ++;
        }
        return arr;
    }


}
