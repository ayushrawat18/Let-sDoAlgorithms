package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String args[]) {
        int arr[] = {1,2,2};

        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> slate = new ArrayList<>();
        generateSubsets(arr, 0, slate, answer);
        System.out.println(answer);
    }

    private static void generateSubsets(int[] arr, int idx, List<Integer> slate, List<List<Integer>> answer) {
        if (idx == arr.length) {
            answer.add(new ArrayList<>(slate));
            return;
        } else {
            int count = 0;
            for (int i = idx; i < arr.length; i++) {
                if (arr[i] != arr[idx])
                    break;
                count++;
            }
            //include

            generateSubsets(arr, idx+count, slate, answer);
            //exclude - multi way exclude
            for (int i = 1; i <= count; i++) {
                slate.add(arr[idx]);
                generateSubsets(arr, idx+count, slate, answer);
            }

            for (int i = 1; i <= count; i++) {
                slate.remove(slate.size()-1);
            }
            
        }
    }


}
