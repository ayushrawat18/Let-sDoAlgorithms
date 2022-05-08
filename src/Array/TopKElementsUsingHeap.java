package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKElementsUsingHeap {

    public static void main(String args[]) {
        int arr[] = {1,2,2,2,2,2,5,5,5,5};
        findTopKElementsUsingHeap(arr, 2);
    }

    private static ArrayList<Integer> findTopKElementsUsingHeap(int[] arr, int k) {
        Map<Integer, Pair> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                Pair temp = map.get(arr[i]);
                temp.occurence = temp.occurence + 1;
                map.put(arr[i], temp);
            } else {
                map.put(arr[i], new Pair(arr[i], 1));
            }
        }

        PriorityQueue<Pair> heap = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.occurence == o2.occurence)
                    return 0;
                else if (o1.occurence > o2.occurence)
                    return 1;
                else
                    return -1;
            }
        });

        for (Pair p : map.values()) {
            if (heap.size() == k) {
                heap.poll();
            }
            heap.offer(p);
        }

        return (ArrayList<Integer>) Arrays.asList((Integer[]) heap.toArray());
    }

}

