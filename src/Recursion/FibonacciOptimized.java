package Recursion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FibonacciOptimized {

    public static void main(String[] args) {
        long start1 = System.nanoTime();
        System.out.println(getFibonacci(40));
        System.out.println("Total time taken + " + (System.nanoTime() - start1));


        // more advanced technique of solving recurrsive problem where repeative work is more
        long start2 = System.nanoTime();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 1);
        System.out.println(getFibonacciTopDown(40, map));
        System.out.println("Total time taken + " + (System.nanoTime() - start2));

        long start3 = System.nanoTime();
        System.out.println(getFibonacciBottomUp(40));
        System.out.println("Total time taken + " + (System.nanoTime() - start3));


    }


    /**
     * Recursive implementation of fibonacci number
     * Time : O(2^n)
     * Space : O(n) : because at a time there will be only one skew tree in stack
     */
    private static int getFibonacci(int n) {
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;

        return getFibonacci(n-1) + getFibonacci(n-2);
    }


    /**
     * Recursive implementation of fibonacci number
     * using top down dynamic programming approach
     * Memoization
     */

    private static int getFibonacciTopDown(int n, Map<Integer, Integer> memo) {
        if (memo.containsKey(n))
            return memo.get(n);
        memo.put(n, getFibonacciTopDown(n-1, memo) + getFibonacciTopDown(n-2, memo));
        return memo.get(n);
    }

    /**
     * Iterative implementation of fibonacci number
     * using bottom up dynamic programming approach
     * Memoization using array
     * Bottom up approach : is more important for interviews
     */

    private static int getFibonacciBottomUp(int n) {
       int arr[] = new int[n+1];
       arr[0] = 0;
       arr[1] = 1;

        for (int i = 2; i < n; i++) {
           arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[n-1];
    }

    /**
     * Iterative implementation of fibonacci number
     * using bottom up dynamic programming approach
     * memoization full iteration not needed
     * Bottom up approach : is more important for interviews
     */

    private static int getFibonacciBottomUpAdvanced(int n) {
        int arr[] = new int[3];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            if (i%3 == 0) {
                
            }
        }
        return arr[n-1];
    }


}
