package Array;

import java.util.HashMap;
import java.util.Map;

public class Test {


    public boolean solution(int[] A) {

        Map<Integer, Integer> counts = new HashMap<>();

        for(int i=0; i<A.length; i++) {
            counts.put(A[i], counts.getOrDefault(A[i], 0)+1);
        }


        int a = 10;
        if (a%2 == 0) {

        }
        for(int count : counts.values()) {
            if(count%2 != 0)
                return false;
        }

        return true;
    }
}
