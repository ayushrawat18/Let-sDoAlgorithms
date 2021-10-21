package String;

import java.util.Stack;

public class ReverseStringWithoutWords {


    public static void main (String args[]) {

        String originalStr = "I love solving programs";
        System.out.println("Original String : "+originalStr);
        String reverseWordsBySpt = reverseWordsByStack(originalStr);
        System.out.println("Reverse String by spliting : "+reverseWordsBySpt);

    }

    /*
        Input : "I love solving programs"
        Output : "programs solving love I"
     */
    public static String reverseWordsBySpliting(String originalStr) {

        String arr[] = originalStr.split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = arr.length-1; i >= 0; i--) {
            str =str.append(" ");
            str = str.append(arr[i]);
        }

        return str.toString().trim();
    }

    public static String reverseWordsByStack (String str) {

        Stack<Character> s = new Stack<>();
        StringBuilder stb = new StringBuilder();
        for (int i =0; i<str.length(); i++) {
            s.push(str.charAt(i));
        }

        for (int i=0; i<s.size(); i++) {
            stb.append(s.pop());
        }
        return stb.toString();
    }
}
