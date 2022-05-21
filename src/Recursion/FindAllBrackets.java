package Recursion;

import java.util.ArrayList;

public class FindAllBrackets {
    public static void main(String args[]) {
        int n = 4;
        ArrayList<String> answer = new ArrayList<>();
        helper(n, 0, 0, "", answer);
        System.out.println(answer.size());
    }

    private static void helper(int num, int open, int close, String current, ArrayList<String> answer) {
        if (open == num && close == num) {
            answer.add(current);
            return;
        }
        if(open < num) {
            helper(num, open + 1, close, current + "(", answer);
        }
        if(close < open)
            helper(num, open, close+1, current + ")", answer);
    }
}
