package Searching;

public class LinearSearch {


    public static int linearSearch(int arr[], int element) {

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == element)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {

        int arr[] = new int[] {7,8,3,21,4,0};
        int element = 1;

       int elementIndex = linearSearch(arr, element);
       if (elementIndex == -1)
           System.out.println("Element not found  ");
       else
           System.out.println("Element found at index "+elementIndex);



    }
}
