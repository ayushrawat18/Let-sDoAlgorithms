package Array;

import commons.Commons;

public class SwapAdjacent {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5};
        swapAdajacent(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    private static void swapAdajacent(int[] arr) {
        for (int i = 1; i < arr.length; i=i+2) {
            Commons.swap(i, i-1, arr);
        }
    }
}
