package Array;

public class LongestPeak {


    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
       System.out.println(longestPeak(arr));
    }
    public static int longestPeak(int[] arr) {
        int idx = 0;
        int currentPeak =0;
        int longestPeak = 0;
        boolean isStrictlyIncreasing = false;
        while( idx < arr.length-1) {
            currentPeak = 0;
            while(idx < arr.length-1 && arr[idx] < arr[idx+1] ) {
                currentPeak +=1;
                idx++;
                isStrictlyIncreasing = true;
            }

            while(idx < arr.length-1 && arr[idx] > arr[idx+1] && isStrictlyIncreasing ) {
                currentPeak +=1;
                idx++;
            }

            isStrictlyIncreasing = false;
            if (idx < arr.length-1 && arr[idx] == arr[idx+1] ) {
                currentPeak = 0;
                idx++;
            }


            longestPeak = Math.max(longestPeak, currentPeak);

        }
        return longestPeak+1;
    }
}
