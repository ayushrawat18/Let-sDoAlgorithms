package Stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ValidateBalancedBrackets {

    public static void main(String args[]) {
        String brackets = ")[]}";
        boolean isBracketsCorrect = validateBalancedBrackets(brackets);
        System.out.println(isBracketsCorrect);
    }

    private static boolean validateBalancedBrackets(String brackets) {
        Map<Character, Character> validBrackets = new HashMap<>();
        validBrackets.put('(' ,  ')');
        validBrackets.put('[' ,  ']');
        validBrackets.put('{' ,  '}');

        Set<Character> openingBrackets = new HashSet<>();
        openingBrackets.add('(');
        openingBrackets.add('[');
        openingBrackets.add('{');

        Set<Character> closingBrackets = new HashSet<>();
        closingBrackets.add(')');
        closingBrackets.add(']');
        closingBrackets.add('}');

        Stack<Character> allBrackets = new Stack<>();
        //)[]}
        for (int i = 0; i < brackets.length(); i++) {
            Character ch = brackets.charAt(i);
            if(openingBrackets.contains(ch)) {
                allBrackets.push(ch);
            } else if (closingBrackets.contains(ch)) {
                Character c = allBrackets.peek();
                if(validBrackets.get(c) == ch) {
                 if(allBrackets.size() == 0)
                     return false;

                 allBrackets.pop();
                }
                else
                    return false;
            }
        }

        return allBrackets.isEmpty();
    }
}
