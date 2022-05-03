package SortingAlgo.SortingInDetails;

import commons.Commons;

import java.util.Random;

public class QuickSort {

    public static void main(String args[]) {
        int arr[] = {4, 0, -1, 3, -90, 40, 90};
        quickSortHelper(arr, 0, arr.length-1);
        Commons.printArray(arr);
    }

    private static void quickSortHelper(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int pivot = new Random().nextInt((end-start)) + start ;

        //lomoto's partition - move pivot to extreme left from where partition has started
        swap(start, pivot, arr);
        int smaller = start;

        for (int bigger = start+1; bigger <= end; bigger++) {
            if(arr[bigger] < arr[start]) {
                smaller++;
                swap(bigger, smaller, arr);
            }
        }
        swap(start, smaller, arr);

        quickSortHelper(arr, start, smaller-1);
        quickSortHelper(arr, smaller+1, end);
    }

    private static void swap(int start, int pivot, int[] arr) {
        int temp = arr[pivot];
        arr[pivot] = arr[start];
        arr[start] = temp;
    }
}
