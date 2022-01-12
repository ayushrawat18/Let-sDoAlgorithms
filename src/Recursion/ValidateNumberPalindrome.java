package Recursion;

public class ValidateNumberPalindrome {

    public static void main(String args[]) {
        int num = 1001;
        System.out.println(validateNumberPalindrome(num));
        int reversedNum =0, copyNum = num;
        System.out.println(validateNumberPalindromeRecursion(num, reversedNum, copyNum));
    }


    private static boolean validateNumberPalindromeRecursion(int num , int reversedNum, int copyNum) {

        reversedNum = reversedNum * 10 + num % 10;
        num = num/10;

        if (num != 0)
            return validateNumberPalindromeRecursion(num, reversedNum, copyNum);

        return reversedNum == copyNum;
    }


    /**
     * number = 1001
     * 1
     * @param num
     * @return
     */
    private static boolean validateNumberPalindrome(int num) {
        int reversedNumber = 0;
        int inputNum = num;
       while (num != 0) {
           reversedNumber = (num % 10) + reversedNumber *10;
           num = num/10;
       }
        return inputNum == reversedNumber;
    }


}
