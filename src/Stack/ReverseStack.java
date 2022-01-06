package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st.toString());
        reverseStack(st);

        System.out.println(st.toString());
    }

    private static void reverseStack(Stack<Integer> st) {
        if(st.isEmpty())
            return;
        int temp = st.pop();
        reverseStack(st);
        st.push(temp);
    }
}
