package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueCharactersString {

    public static void main (String args[]) {
        String str = "ayush";
        System.out.println(isUniqueCharacters(str));
        System.out.println(isUniqueChars(str));
        System.out.println(isUniqueCharactersInString(str));
    }
    /*
        Brute force O(n2)
     */
    private static boolean isUniqueCharacters(String str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j))
                    return false;
            }
        }
        return true;
    }

    /*
     Optimized using the Set
        Time : O(n) | Space : O(n)
     */

    private static boolean isUniqueChars(String str) {
        Set<Character> unique = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            if (unique.contains(str.charAt(i)))
                return false;
            else
                unique.add(str.charAt(i));
        }
        return true;
    }
/*
 Elegant solution runs on O(n)
 space : O(1)  or O(c) : c is space of charSet
 */
    private static boolean isUniqueCharactersInString(String str) {

        boolean charSet[] = new boolean[150];
        for (int i = 0; i < str.length(); i++) {
            int charCode = str.charAt(i);
              if(charSet[charCode])
                  return false;
              charSet[charCode] = true;
        }
        return true;
    }
}
