package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        System.out.println(findTotalPower(arr));

    }

    public static int findTotalPower(List<Integer> power) {
        // Write your code here
        int totalSum = 0;
        for(int i =0 ; i < power.size(); i++) {
            List<Integer> sum = new ArrayList<>();
            prepareSum(sum, power, i);
            int curMin = power.get(i);
            for(int j=i; j<power.size(); j++) {
                curMin = Math.min(curMin, power.get(j));
                int currPower = curMin * sum.get(j-i);
                totalSum = totalSum + currPower;
            }
        }

        return totalSum;
    }

    public static void prepareSum(List<Integer> sum, List<Integer> power, int idx) {
        int currentSum = 0;
        for (int i = idx; i < power.size(); i++) {
            currentSum = currentSum + power.get(i);
            sum.add(currentSum);
        }
    }
}


