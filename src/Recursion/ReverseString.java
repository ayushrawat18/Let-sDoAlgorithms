package Recursion;

public class ReverseString {
    public static void main (String args[]) {

        String ans =  "";
        reverseString("ayush", 0);
    }


    private static void reverseString(String str, int idx) {

        if (str == null || idx >= str.length()) {
            return;
        }

        reverseString(str, idx + 1);
        System.out.print(str.charAt(idx));
    }
}
