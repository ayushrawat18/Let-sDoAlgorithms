package String;

import java.util.HashMap;
import java.util.Map;

public class MinimumCharsReq {

    public static void main(String args[]) {

        String arr[] = new String[]{"this", "that"};
        System.out.println(minimumCharactersForWords(arr));

    }
    public static char[] minimumCharactersForWords(String[] words) {

        Map<Character, Integer> count = new HashMap<>();

        String fStr = "";
        for(int i=0; i < words.length; i++) {
            String str = words[i];
            int j = str.length()-1;
            Map<Character, Integer> temp = new HashMap<>();
            while(j>=0) {
                temp.put(str.charAt(j), temp.getOrDefault(str.charAt(j), 0)+1);
                j--;
            }
            prepareMaxCount(count, temp);

        }

        for(Character c : count.keySet()) {
            int freq = count.get(c);
            while(freq > 0) {
                fStr = fStr + c;
                freq --;
            }
        }

        return fStr.toCharArray();
    }


    public static void
    prepareMaxCount(Map<Character, Integer> count , Map<Character, Integer> temp) {

        for(Character c : temp.keySet()) {
            if(count.containsKey(c) && temp.get(c) > count.get(c)) {
                count.put(c, temp.get(c));
            } else if (!count.containsKey(c)) {
                count.put(c, temp.get(c));
            }
        }
    }
}
