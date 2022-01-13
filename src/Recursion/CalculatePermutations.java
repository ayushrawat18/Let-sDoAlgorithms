package Recursion;

public class CalculatePermutations {

    public static void main(String args[]) {
        String str = "abcd";
        permuteStr(str, "");
    }

    /**
     * Time : O(n.n!)
     * @param str
     * @param ans
     */
    private static void permuteStr(String str, String ans) {

        if(ans.length() == 3) {
            System.out.print(" "+ans);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i+1);
           // System.out.println("" +ans+ch);
            permuteStr(remaining, ans+ch);
        }
    }

}
