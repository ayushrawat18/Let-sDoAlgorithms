package DynamicProgramming;

public class MaxNonAdajacentSum {

    public static void main(String args[]) {
        int arr[] = {75, 105, 120, 75, 90, 135};
        //[75, 105, 75+120, 120+75, ..]

       System.out.println( findMaxSumNonAdjacent(arr));
    }

    private static int findMaxSumNonAdjacent(int[] arr) {
        int copyArr[] = new int[arr.length];
        copyArr[0] = arr[0];
        copyArr[1] = arr[1];

        for (int i = 2; i < arr.length; i++) {
            copyArr[i] = Math.max(copyArr[i-2] + arr[i], copyArr[i-1]);
        }

        return copyArr[copyArr.length-1];
    }

}
