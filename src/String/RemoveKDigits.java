package String;

import java.util.Stack;

public class RemoveKDigits {

    public static void main(String args[]) {
        String num = "10200";
        int k = 1;

        System.out.println(removeKDigits(num, k));
    }

    private static String removeKDigits(String num, int k) {

        if (k >= num.length())
            return "0";

        Stack<Character> nums = new Stack<>();

        for (int i = 0; i < num.length(); i++) {

            char c = num.charAt(i);
            // we found a peak in the following condition
            if (!nums.isEmpty()  && k > 0 && nums.peek() > c) {
                nums.pop();
                nums.push(num.charAt(i));
                k --;
                continue;
            }
            if (c != 0)
                nums.push(num.charAt(i));
        }


        while (!nums.isEmpty() && k >0) {
            nums.pop();
            k--;
        }
        if (nums.isEmpty())
            return "0";

        StringBuilder ans = new StringBuilder();
        while (!nums.isEmpty())
            ans.append(nums.pop());

        Integer s = Integer.valueOf(ans.reverse().toString());
        return String.valueOf(s);
    }
}
