package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {


    public static void main(String args[]) {
        List<String> answer = new ArrayList<>();
        System.out.println("Binary strings of length n");
        //permutationRepetationAllowed(3, "");

        System.out.println("Decimal strings of length n");
        //permutationDecimalStrings(5, "", answer);
        System.out.println(answer);


//        //Repeatation is not allowed
        System.out.println("Binary strings of length n duplicate not allowed ");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(2);

        permutationRepetationNotAllowed("abc", "");

    }

    private static void permutationRepetationAllowed(int n, String slate) {
        if (n == 0)
            System.out.println(slate);
        else {
                permutationRepetationAllowed(n - 1, slate + "0");
                permutationRepetationAllowed(n - 1, slate + "1");
        }
    }

    // Repeat allowed
    private static void permutationDecimalStrings(int n, String slate, List<String> answer) {
        if (n == 0)
            answer.add(slate);
        else {
            for (int i = 0; i < 4; i++) {
                permutationDecimalStrings(n - 1, slate + i, answer);
                StringBuilder s = new StringBuilder();

            }
        }
    }


    /**
     * Below solutions repeatation is not allowed
     */

    private static void permutationRepetationNotAllowed( String arr,  String slate) {
        if (arr.length() == 0)
            System.out.println(slate);
        else {
            for (int i = 0; i < arr.length(); i++) {
                String temp = slate + arr.charAt(i);
                permutationRepetationNotAllowed( arr.substring(i)+arr.substring(i+1), temp);
            }

        }
    }
}
