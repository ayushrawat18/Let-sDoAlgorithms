package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeRecursion {

    public static void main(String args[]) {
        System.out.println("Sum to the nth number recursively "+findSum(10));
        System.out.println("Factorial of the number recursively "+findFactorial(10));
        System.out.println("Nth Fibonacci number "+findNFibonacci(11));
        System.out.println("Nth Fibonacci number using memoization technique "+findNFibonacciMem(11));
        //arrays
        int arr[] = new int[]{1,2,3,4,5, 6, 7, 8, 9, 10};
        System.out.println("Find product of numbers in array using recursion "+findProductOfArray(arr));

        String str = "helloikolleh";
        System.out.println("Palindrome check string "+checkPalindrome(str));

        String str2 = "ayu";
        System.out.println("Reverse string recursively "+reverseString(str2));

        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List<Object> subList = new ArrayList<>();
        subList.add(3);
        subList.add(4);
        list.add(subList);

        List<Object> subList2 = new ArrayList<>();
        subList2.add(5);
        subList2.add(6);
        List<Object> subList3 = new ArrayList<>();
        subList3.add(7);
        subList3.add(8);

        subList2.add(subList3);
        list.add(subList2);

        System.out.println("Flatten the list "+flattenList(list));

        String namesArr[] = new String[]{"foo", "bar", "hello", "world"};

        capitalStrings(namesArr, 0);
        System.out.println(" Captialise the strings "+ Arrays.toString(namesArr));


        int[] evenNumArr = new int[] {2,4,6,8, 9};
        System.out.println("Is all numbers even "+checkArrEvens(evenNumArr, 0));

        //{"a":1, "b":2, "c":3, "d": {"e": 9, "f":10}}
        Map<String, Object> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        Map<String, Object> map1 = new HashMap<>();
        map1.put("e",9);
        map1.put("f",10);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("g",9);
        map2.put("h",10);
        map1.put("z", map2);
        map.put("d", map1);
        int sum = 0;
        sum = sumOfMapValues(map, sum);
        System.out.println("Sum is :"+ sum);

    }

    private static int sumOfMapValues(Map<String, Object> map, int sum) {

        for (String key : map.keySet()) {
            if (map.get(key) instanceof HashMap)
                return sumOfMapValues((Map<String, Object>) map.get(key), sum);
            else
                sum = sum + (int) map.get(key);
        }
        return sum;
    }

    private static boolean checkArrEvens(int[] evenNumArr, int startIdx) {

        if (startIdx < evenNumArr.length) {
            boolean isEven = evenNumArr[startIdx] % 2 == 0;
            if (!isEven)
                return false;
            else {
                startIdx++;
                return checkArrEvens(evenNumArr, startIdx);
            }
        }
        return true;
    }

    private static void capitalStrings(String arr[], int startIdx) {

        if (startIdx == arr.length)
            return;
        else {
            String word = arr[startIdx].toUpperCase();
            arr[startIdx] = word;
            startIdx = startIdx + 1;
            capitalStrings(arr, startIdx);
        }
    }

    private static List<Integer> flattenList(List<Object>  list) {
        List<Integer> resultList = new ArrayList<>();
        return flattenList(list, resultList);

    }

    private static List<Integer> flattenList(List<Object> list, List<Integer> resultList) {

            for (int i=0; i<list.size(); i++) {
                if (list.get(i) instanceof ArrayList) {
                    flattenList((List<Object>) list.get(i), resultList);
                } else
                    resultList.add((Integer) list.get(i));
            }

            return resultList;
    }


    private static String reverseString(String str) {

        StringBuilder newStr = new StringBuilder();
        return reverseString(str, str.length()-1);

    }

    private static String reverseString(String str, int endIdx) {

        if (endIdx == 0)
            return str.charAt(0) + "";
        else {
           return str.charAt(endIdx) + reverseString(str, endIdx-1);
        }


    }


    private static boolean checkPalindrome(String str) {
        int startIdx = 0;
        int endIdx = str.length()-1;
       return checkPalindrome(str, startIdx, endIdx);

    }

    private static boolean checkPalindrome(String str, int startIdx, int endIdx) {

        if (startIdx < endIdx) {
            if (str.charAt(startIdx) != str.charAt(endIdx))
                return false;
            else
                return checkPalindrome(str, startIdx + 1, endIdx - 1);
        }
        return true;
    }

    private static int findProductOfArray(int arr[]) {
        return findProductOfArray(arr, arr.length-1);
    }

    private static int findProductOfArray(int[] arr, int idx) {
        if (idx == 0)
            return arr[0];
        else
            return arr[idx]*findProductOfArray(arr, idx-1);
    }

    private static int findNFibonacciMem(int num) {
        Map<Integer, Integer> mem = new HashMap<>();
        mem.put(1, 0);
        mem.put(2, 1);
        return findNFibonacciMem(num, mem);
    }

    private static int findNFibonacciMem(int num, Map<Integer, Integer> mem) {
        if (mem.containsKey(num))
            return mem.get(num);
        else {
            mem.put(num, findNFibonacciMem(num-1) + findNFibonacciMem(num - 2));
            return mem.get(num);
        }
    }

    private static int findNFibonacci(int num) {
        if (num == 1)
            return 0;
        else if (num == 2)
            return 1;
        else
            return findNFibonacci(num-1) + findNFibonacci(num-2);
    }



    private static int findFactorial(int num) {
        if (num == 1)
            return 1;
        else
            return num*findFactorial(num-1);
    }

    private static int findSum(int n) {
        if (n == 0)
            return 0;
        else
            return n + findSum(n-1);
    }


}
