package String;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RunLengthEncoding {

    public static void main(String args[]) {
        String s = "AAAAAAABBBBBBBCCCCCCCc";
        System.out.println(runLengthEncoding(s));
    }


    public static String runLengthEncoding(String string) {

        int count = 1;
        StringBuilder s = new StringBuilder();

        for(int i=0; i<string.length()-1; i++) {
            if(string.charAt(i) == string.charAt(i+1) && count != 9) {
                count ++;
            } else {
                s.append(count);
                s.append(string.charAt(i));
                count = 1;
            }
        }
        s.append(count);
        s.append(string.charAt(string.length()-1));
        return s.toString();
    }
}



