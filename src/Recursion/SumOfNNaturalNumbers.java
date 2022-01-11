package Recursion;

public class SumOfNNaturalNumbers {

    public static void main (String args[]) {
        System.out.println(findSum(10));
        System.out.println(findSum(10, 0));
        System.out.println(" Printing numbers in reverse order ");
        printNumberReverse(10);
        String str = "heldeleh";
        System.out.println(checkPalindrome(str, 0, str.length()-1));

    }

    private static int findSum(int num) {
        if (num == 0)
            return 0;
        else {
            return num + findSum(num - 1);
        }
    }

    private static int findSum(int num, int sum) {
        if (num == 0) {
            return 0;
        } else {
            sum =  num + findSum(num-1, sum);
            return sum;
        }
    }

    private static void printNumberReverse(int n) {
        if(n==0)
            return;

        System.out.print("  "+n);
        printNumberReverse(n-1);

    }


    private static boolean checkPalindrome(String str, int startIdx, int endIdx) {
        try {
             checkPalindrome(str, startIdx + 1, endIdx - 1);
        }catch (Exception e) {

        }


        return false;
    }



}
