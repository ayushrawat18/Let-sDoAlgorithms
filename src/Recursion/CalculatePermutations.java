package Recursion;

public class CalculatePermutations {

    public static void main(String args[]) {
        String str = "ayu";
        permuteStr(str, "");
    }

    /**
     * Time : O(n.n!)
     * @param str
     * @param ans
     */
    private static void permuteStr(String str, String ans) {

        if (str.length() == 0)
            System.out.println(ans);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i+1);
            System.out.println("" +ans+ch);
            permuteStr(remaining, ans+ch);
        }
    }

}
