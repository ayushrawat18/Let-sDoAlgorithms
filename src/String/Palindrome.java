package String;

public class Palindrome {

    public  static void main(String args[]) {
        String str = "worlrow";
        System.out.println(checkPalindrome(str));
        System.out.println(checkPalindrome(str, 0));

    }



    public static boolean checkPalindrome(String str) {

        int i = 0;
        int j = str.length()-1;

        while (i < j) {
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }

    public static boolean checkPalindrome(String str1, int index) {

        int j = str1.length() - 1 - index;

        if(index < j) {
            if (str1.charAt(index) != str1.charAt(j))
                return false;

            checkPalindrome(str1, index + 1);
        }
        return true;

    }
}
