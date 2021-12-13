package String;

public class LongestPalindromeInString {

    public static void main(String args[]) {
        String str = "abba";
        String subStr = findLongestPalindrome(str);
        System.out.println(subStr);
    }

    public static String findLongestPalindrome(String str) {

        StringBuilder longestPalindrome = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            temp.setLength(0);
            for (int j = i; j < str.length(); j++) {
                temp = temp.append(str.charAt(j));
                if(temp.length() > longestPalindrome.length() && isPlaindrome(temp))  {
                    longestPalindrome = new StringBuilder(temp);
                }
            }
        }
        return longestPalindrome.toString();
    }

    public static boolean isPlaindrome(StringBuilder temp) {
       Palindrome p = new Palindrome();
       return p.checkPalindrome(temp.toString());
    }
}
