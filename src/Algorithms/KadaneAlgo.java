package Algorithms;

public class KadaneAlgo {

    public static void main(String args[]) {
        int arr[] = new int[]{1,4,5,-90,11,-12,-12};
        
        int cMax = arr[0];
        int max = arr[0];
        int num = 0;
        for (int i=1; i<arr.length; i++) {
            num = arr[i];
            cMax = Math.max(num, num+cMax);
            max = Math.max(cMax, max);
        }

        System.out.println(max);
    }
}
