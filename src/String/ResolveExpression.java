package String;

public class ResolveExpression {
    public static void main(String args[]) {
        String str = "2*3*7+6+9";
        System.out.println(resolveExpression(str));
    }

    private static int resolveExpression(String str) {


        int operand1 = Character.getNumericValue(str.charAt(0));
        for (int i = 1; i < str.length()-1; i=i+2) {
            char operator = str.charAt(i);
            int operand2 = Character.getNumericValue(str.charAt(i+1));
            if(operator == '*')
                operand1 = operand1 * operand2;
            else if(operator == '+')
                operand1 = operand1 + operand2;
        }
        return operand1;

    }
}
