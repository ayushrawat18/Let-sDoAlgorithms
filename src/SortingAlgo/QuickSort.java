package SortingAlgo;

import commons.Commons;

public class QuickSort {

    public static void main(String args[]) {
        int arr[] = new int[]{8,9,1,2,3,5,6,0,2,110};
        quickSort(arr, 0, arr.length-1);

        Commons.printArray(arr);
    }

    private static void quickSort(int[] arr, int startIdx, int endIdx) {
        if (startIdx >= endIdx)
            return;

        int pivot = startIdx;
        int left = startIdx + 1;
        int right = endIdx;

        while (left <= right) {
            if (arr[left] > arr[pivot] && arr[right] < arr[pivot])
                Commons.swap(left, right, arr);
            if (arr[left] <= arr[pivot])
                left +=1;
            if (arr[right] >= arr[pivot])
                right -=1;
        }
        Commons.swap(pivot, right, arr);

        quickSort(arr, startIdx, right-1);
        quickSort(arr, right+1, endIdx);
    }
}
