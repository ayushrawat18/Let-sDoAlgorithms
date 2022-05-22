package Recursion;

import java.util.ArrayList;

public class SubsetSum {

    public static void main(String args[]) {
        int arr[] = {1,2,3,4,-6};
        ArrayList<Integer> slate = new ArrayList<>();
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        findSubsetSum(arr, 0, slate, answer, 0);
        System.out.println(answer);
    }

    /**
     * Time : O(n.2^n)
     * Space : O(n.2^n)
     */
    private static void findSubsetSum(int[] arr, int idx, ArrayList<Integer> slate, ArrayList<ArrayList<Integer>> answer, int k) {

        if (idx == arr.length) {
            if (k == findSum(slate))
                answer.add(new ArrayList<Integer>(slate));
            return;
        } else {
            findSubsetSum(arr, idx+1, slate, answer, k);
            slate.add(arr[idx]);
            findSubsetSum(arr, idx+1, slate, answer, k);
            slate.remove(slate.size()-1);
        }
    }

    private static int findSum(ArrayList<Integer> slate) {
        int sum = 0;
        for (Integer ele : slate) {
            sum = sum + ele;
        }
        return sum;
    }
    
}
