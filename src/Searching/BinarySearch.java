package Searching;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String args[]) {

        int arr[] = new int[] {44,4,3,2,6,8,1,444};
        int element = 444;
        Arrays.sort(arr);
        int elementIndex = binarySearch(arr, 0, arr.length-1, element);

        if (elementIndex == -1)
            System.out.println("Element not found  ");
        else
            System.out.println("Element found at index "+elementIndex);
    }

    public static int binarySearch(int arr[], int startIndex, int lastIndex, int element) {

        if(startIndex <= lastIndex) {

            int mid = (startIndex + lastIndex)/2;
            if (arr[mid] == element)
                return mid;
            else if(element < arr[mid])
                return binarySearch(arr, startIndex, mid, element);
            else
               return binarySearch(arr, mid+1, lastIndex, element);
        }
        return -1;
    }
}
