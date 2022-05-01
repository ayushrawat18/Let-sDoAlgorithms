package SortingAlgo.SortingInDetails;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class HeapSort {
    /**
     * Priority queue on add operation build the min-heap by default
     * building the heap takes
     * Heapify O(n)
     * Insert : O(log n)
     * Deletion O(log n)
     * @param args
     */
    public static void main(String args[]) {
        int arr[] = {3,4,2,3,0,-1,90};

        ArrayList<ArrayList<Integer>> arrsl = new ArrayList<>();
        arrsl.get(0).get(0);
        //Default min heap is implemented
        Queue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }

        while(q.size() != 0) {
            System.out.print(" "+q.poll());
        }
    }
}
