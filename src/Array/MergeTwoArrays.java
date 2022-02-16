package Array;

import commons.Commons;

import java.util.ArrayList;

public class MergeTwoArrays {

    public static void main(String args[]) {
        int a[] = {4};
        int b[] = {1,2,3,5,6};

        // two arrays are merged into another array
        mergeArrays(a, b, 1, 5);

        System.out.println();
        

        //merge two arrays without taking extra array

        int arr[] = {1,2,3,0,0,0};
        int brr[] = {2,5,6};
        mergeArraysWithoutExtraSpace(arr, brr, 3, 3);
    }

    private static void mergeArraysWithoutExtraSpace(int[] arr, int[] brr, int m, int n) {
        int i= m-1, j=n-1, k = n+m-1;

        while (i >= 0 && j >= 0) {
            arr[k--] = arr[i] > brr[j] ? arr[i--] : brr[j--];
        }

        while (j >= 0) {
            arr[k--] = brr[j--];
        }
        Commons.printArray(arr);
    }

    private static void mergeArrays(int[] a, int[] b, int m, int n) {

        int c [] = new int[a.length + b.length];
        int i=0, j=0, k=0;

        while (i < a.length  && j < b.length) {
            if(a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else  {
                c[k] = b[j];
                j++;
                k++;
            }
        }

        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }

        Commons.printArray(c);

    }
}
