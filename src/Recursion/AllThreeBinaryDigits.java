package Recursion;

public class AllThreeBinaryDigits {

    public static void main(String args[]) {

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
