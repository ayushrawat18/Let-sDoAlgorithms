package Recursion;

import java.util.HashMap;
import java.util.Map;

public class GetNFibonachi {

    public static void main(String args[]) {
        System.out.println(getNFibo(40));
        System.out.println("Fibonachi nth number using memoization : "+getFibo(40));
    }

    /**
     * Time : 2 Power n
     * Space : O(n) : Recursive function call stack
     * @param n
     * @return
     */
    private static Integer getNFibo(int n) {
        if(n == 1)
            return 0;
        else if(n == 2)
            return 1;

        return getNFibo(n-1) + getNFibo(n-2);
    }


    /*
        Memoization technique is used
        to calculate the fibonachi nth number
        Time : O(n)
        Space : O(n)
     */
    public static int getFibo(int n) {

        Map<Integer, Integer> memoize = new HashMap<>();
        memoize.put(1, 0);
        memoize.put(2, 1);

        return getFibo(n, memoize);


    }


    private static int getFibo(int n, Map<Integer, Integer> memoize) {
        if(memoize.containsKey(n))
            return memoize.get(n);
        else {
            memoize.put(n, getFibo(n-1, memoize) + getFibo(n-2, memoize));
            return memoize.get(n);
        }
    }

    
}
