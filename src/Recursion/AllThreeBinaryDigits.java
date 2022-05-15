package Recursion;

import com.sun.tools.javac.util.StringUtils;

import java.util.ArrayList;

public class AllThreeBinaryDigits {

    public static void main(String args[]) {

        ArrayList<Character> pChar = new ArrayList<>();
        String.valueOf(pChar);
        bs("", 2);
    }

    private static void bs(String res, int n) {
        if (n == 0)
            System.out.println(res);
        else {
            bs(res + "h", n - 1);
            bs(res + "6", n - 1);
        }
    }



}
