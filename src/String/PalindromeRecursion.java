package String;

public class PalindromeRecursion {

    public  static void main(String args[]) {
        String str = "helih";
        System.out.println(checkPalindrome(str, 0));

    }

    public static boolean checkPalindrome(String str1, int index) {

        int j = str1.length()-1-index;
        if (index <= j) {
            if (str1.charAt(index) == str1.charAt(j)) {
               return checkPalindrome(str1, index + 1);
            } else
                return false;

        }
        return true;
    }
}
