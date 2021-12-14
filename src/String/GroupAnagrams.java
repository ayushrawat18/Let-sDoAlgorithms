package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        String theSortedWord = "";
        for (int i = 0; i<anaList.size(); i++) {
            theSortedWord = anaList.get(0);

        }

return null;
    }

    private static String sortWord(String str) {
        char temp[] = str.toCharArray();
        Arrays.sort(temp);
        String s = new String(temp);
        return s;
    }
}
