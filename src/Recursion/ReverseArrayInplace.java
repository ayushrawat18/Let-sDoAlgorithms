package Recursion;

public class ReverseArrayInplace {

    public static void main(String args[]) {
        char[] arr = new char[]{'a', 'y', 'u', 's', 'h'};
        reverseArrayInplace(arr);
        System.out.println(arr);
        char[] arr1 = new char[]{'a', 'y', 'u', 's', 'h'};
        reverseArrayRecursily(arr1, 0, arr1.length-1);
        System.out.println(arr1);


    }

    /**
     * Time is O(n)
     * Space O(1)
     * @param arr
     */
    private static void reverseArrayInplace(char[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start ++;
            end --;
        }
    }

    private static void swap(char[] arr, int start, int end) {
        char temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }

    private static void reverseArrayRecursily(char[] arr, int start, int end) {
        if (start >= end)
            return;

        swap(arr, start, end);
        reverseArrayRecursily(arr, start+1, end-1);
    }
}
