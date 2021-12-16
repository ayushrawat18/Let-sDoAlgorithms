package String;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ReverseStringWithoutWords {


    public static void main (String args[]) {

        String originalStr = "I love solving programs";
        System.out.println("Original String : "+originalStr);
        String reverseWordsBySpt = reverseWordsSol(originalStr);
        System.out.println("Reverse String by spliting :"+reverseWordsBySpt);

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

    public static String reverseWords(String str) {

        Stack<Character> q = new Stack<>();
        String newStr = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            if(str.charAt(i) == ' ') {
                while (q.size() > 0) {
                    newStr= newStr + q.pop();
                }
                newStr = newStr + " ";
            } else {
                q.add(str.charAt(i));
            }
        }

        while (q.size() > 0) {
            newStr = newStr + q.pop();
        }
        return newStr;
    }


    public static String reverseWordsSol(String str) {

        int wordStartIndex = 0;
        String finalStr = "";
        List<String> l = new ArrayList<>();
        boolean last = false;
        for (int i = 0; i < str.length(); i++) {
            last = false;
            if(str.charAt(i) == ' ') {
                l.add(str.substring(wordStartIndex, i));
                wordStartIndex = i;
                last = true;
            }
        }

        if (!last)
            l.add((str.substring(wordStartIndex, str.length()-1)));

        for (int i= l.size()-1; i>=0; i--) {
            finalStr = finalStr  + l.get(i);
        }

        return finalStr;

    }
}
