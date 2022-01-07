package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class EvaluateMathExpression {

    public static void main(String args[]) {
        String str = "2 + 3 * 5 + 1 * 1";

        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(str.charAt(i) == ' ')
                continue;

            if(Character.isDigit(ch))
                operand.push(Character.getNumericValue(ch));
            else {
                if (operator.isEmpty())
                    operator.push(ch);
                else {
                    if(checkOperatorPrecedence(ch, operator))
                        operator.push(ch);
                    else {
                        evaluateExpression(operand, operator);
                        operator.push(ch);
                    }
                }
            }
        }

        System.out.println("Expression evaluated to "+ operand.pop());
    }

    private static void evaluateExpression(Stack<Integer> operand, Stack<Character> operator) {


        int num1 = operand.pop();
        int num2 = operand.pop();
        char op = operator.pop();
        int calulate = 0;

        switch (op) {
            case '+' :
                calulate = num1 + num2;
                break;
            case '-' :
                calulate = num1 - num2;
                break;
            case '*' :
                calulate = num1 * num2;
                break;
            case '/' :
                calulate = num1 / num2;
                break;
        }

        operand.push(calulate);
    }

    private static boolean checkOperatorPrecedence(char ch, Stack<Character> operator) {
        Map<Character, Integer> supporteOp = new HashMap<>();
        supporteOp.put('*', 1);
        supporteOp.put('/', 1);
        supporteOp.put('+', 2);
        supporteOp.put('-', 2);

        if(supporteOp.get(ch) < supporteOp.get(operator.peek()))
            return true;

        return false;
    }
}
