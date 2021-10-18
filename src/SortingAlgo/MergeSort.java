package SortingAlgo;


import javax.naming.PartialResultException;

/**
 * Merge sort is an example of divide and conquer
 * Divide the array in two halves recursively
 * merge the two halves
 *
 */
public class MergeSort {

    public static void main(String args[]) {
        int arr[] = new int[] {9,1,2,8,3,7,74,5,5};
        _printArray("Before sorting array ", arr);
        mergeSort(arr, 0, arr.length-1);
        _printArray("After sorting array", arr);
    }

    public static void mergeSort (int arr[], int left, int right) {
        if(left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);

        }
    }

    public static void merge(int arr [], int left, int middle, int right) {
        int n1 = middle - left +1 ;
        int n2 = right - middle;

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for (int i=0; i<n1; i++) {
            arr1[i] = arr[left + i];
        }
        for (int i=0; i<n2; i++) {
            arr2[i] = arr[middle + 1 + i];
        }
        int i = 0, j = 0, k =left;
        while (i < n1 && j < n2) {
            if(arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }

    public static void _printArray(String msg , int arr[]) {
        System.out.println(" "+msg+" : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
    }

}
