package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FindAllBrackets {
    public static void main(String args[]) {
        int n = 4;
        ArrayList<String> answer = new ArrayList<>();
        helper(n, 0, 0, "", answer);
        System.out.println(answer);

    }

    private static void helper(int n, int openBracketsCount, int closeBracketsCount, String result, ArrayList<String> answer) {
        if (result.length() == 2*n) {
            answer.add(result);
            return;
        }

        if (openBracketsCount < n)
            helper(n, openBracketsCount+1, closeBracketsCount, result+"(", answer);

        if (closeBracketsCount < openBracketsCount)
            helper(n, openBracketsCount, closeBracketsCount+1, result+")", answer);
    }


}
