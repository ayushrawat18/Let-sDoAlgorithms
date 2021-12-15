package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static void main(String args []) {

        String s[] = new String[]{"yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"};

        List<String> anaList = Arrays.asList(s);
        List<List<String>> list = groupAnagrams(anaList);

        System.out.println(list);
    }

    private static List<List<String>> groupAnagrams(List<String> anaList) {

        List<String> sortedWords = new ArrayList<>();
        for (String str : anaList) {
            sortedWords.add(sortWord(str));
        }
        Map<String, List<String>> anagrams = new HashMap<>();

        for (int i = 0; i<anaList.size(); i++) {

            if(anagrams.containsKey(sortedWords.get(i))) {
                anagrams.get(sortedWords.get(i)).add(anaList.get(i));
            } else {
                List <String> l = new ArrayList<>();
                l.add(anaList.get(i));
                anagrams.put(sortedWords.get(i), l);
            }

        }
    return new ArrayList<>(anagrams.values());
    }

    private static String sortWord(String str) {
        char temp[] = str.toCharArray();
        Arrays.sort(temp);
        String s = new String(temp);
        return s;
    }
}
