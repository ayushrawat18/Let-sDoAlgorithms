package Array;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {


    public boolean solution(int[] A) {

        Map<Integer, Integer> counts = new HashMap<>();
        List<Integer> a = new ArrayList<>();

        for(int i=0; i<A.length; i++) {
            counts.put(A[i], counts.getOrDefault(A[i], 0)+1);
        }

        for(int count : counts.values()) {
            if(count%2 != 0)
                return false;
        }

        return true;
    }


    public static void main(String[] args) {
        Queue<Integer> nodeQ = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2)
                    return -1;
                else if (o1 < o2)
                    return 1;
                else
                    return 0;
            }
        });


        nodeQ.add(1);
        nodeQ.add(2);
        nodeQ.add(3);
        nodeQ.add(4);
        nodeQ.add(5);
        
        System.out.println(nodeQ.peek());
    }
}
