package String;


import java.util.Stack;

public class ReverseWords {


    public static void main (String args[]) {

       String originalStr = "I love solving programs";
       System.out.println("Original String : "+originalStr);
       String reverseWordsBySpt = reverseWordsBySpliting(originalStr);
       String reverseWordsStck = reverseWordsByStack(originalStr);
       System.out.println("Reverse String by spliting : "+reverseWordsBySpt);
       System.out.println("Reverse String by using stack : "+reverseWordsStck);
    }

    //O(n2)
    public static String reverseWordsBySpliting(String originalStr) {

        String arr[] = originalStr.split(" ");
        StringBuilder newStr = new StringBuilder();

        for (int i=0; i<arr.length; i++) {
            for (int j = arr[i].length()-1; j>=0; j--) {
                newStr = newStr.append(arr[i].charAt(j));
            }
            if(i != arr.length-1)
              newStr.append(" ");
        }
        return newStr.toString();
    }


    public static String reverseWordsByStack(String originalStr) {
        Stack<Character> stack = new Stack<>();
        StringBuilder reverseStr = new StringBuilder();
        for (int i=0; i<originalStr.length(); i++) {
            if(originalStr.charAt(i) == ' ') {
                emptyStack(stack, reverseStr);
                reverseStr.append(" ");
            }else
                stack.push(originalStr.charAt(i));
        }
        emptyStack(stack, reverseStr);
        return reverseStr.toString();
    }

    public static void emptyStack(Stack<Character> stack, StringBuilder str) {
        while (stack.isEmpty() != true) {
            str.append(stack.pop());
        }
    }
}
