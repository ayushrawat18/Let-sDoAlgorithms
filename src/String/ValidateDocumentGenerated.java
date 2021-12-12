package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ValidateDocumentGenerated {

    public static void main(String args[]) {

           String characters =  "ayyu";
           String document =  "yayu";

        HashSet<Character> s = new HashSet<>();
        s.toArray();

        System.out.println(validateDocument(characters, document));

    }

    public static boolean validateDocument(String chr, String doc ) {

        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < chr.length(); i++) {
            charCount.put(chr.charAt(i), charCount.getOrDefault(chr.charAt(i),0) + 1);
        }

        for (int i = 0; i < doc.length(); i++) {

            if(charCount.containsKey(doc.charAt(i)) && charCount.get(doc.charAt(i)) > 0 ) {

                charCount.put(doc.charAt(i), charCount.get(doc.charAt(i))-1);
            }
            else
                return false;

        }
        return true;

    }

}
