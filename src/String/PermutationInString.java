package String;

import java.util.*;

public class PermutationInString {

public static void main(String args[]) {

    System.out.println(checkInclusion("ab", "eidboaoo"));
}
    public static boolean checkInclusion(String s1, String s2) {

        Map<Character, Integer> count  = new HashMap<>();
        for(int i=0; i<s2.length(); i++) {
            count.put(s2.charAt(i), count.getOrDefault(s2.charAt(i), 0)+1);
        }

        for(int i=0; i<s1.length(); i++) {
            Character s = s1.charAt(i);
            if(count.containsKey(s) && count.get(s) > 0) {
                count.put(s, count.get(s)-1);
            } else {
                return false;
            }
        }
        return true;
    }
}
