package Recursion;

import com.sun.tools.javac.util.StringUtils;

import java.util.ArrayList;

public class AllThreeBinaryDigits {

    public static void main(String args[]) {

        ArrayList<Character> pChar = new ArrayList<>();
        String.valueOf(pChar);
        //bs("", 4);
        back("", 3);
    }

    private static void bs(String res, int n) {
        if (n == 0)
            System.out.println(res);
        else {
            bs(res + "0", n - 1);
            bs(res + "1", n - 1);
        }
    }


    private static void back(String res, int k) {
        if (res.length() == 3) {
            System.out.println(res);
            return;
        }
        else {
            for (int i = 0; i < 4; i++) {
                back(res + i, k - 1);
            }


        }
    }


}
