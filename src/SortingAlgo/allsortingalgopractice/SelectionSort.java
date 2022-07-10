package SortingAlgo.allsortingalgopractice;

import commons.Commons;

import static commons.Commons.swap;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9,1,2,4,8,6,0};

        for (int i = 0; i < arr.length; i++) {
            int j = i+1;
            int small = i;
            while (j < arr.length) {
                if(arr[j] < arr[small]) {
                    small = j;
                }
                j++;
            }
            swap(i, small, arr);
        }


        Commons.printArray(arr);
    }
}
