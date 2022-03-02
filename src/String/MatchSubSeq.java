package String;

public class MatchSubSeq {

    public static void main(String args[]) {
        String s = "abc", t = "ahbgdc";
        int idx = 0, matchChar =0;
        for(int i =0; i< s.length(); i++) {

            while (s.charAt(i) != t.charAt(idx)) {
                idx++;
            }

            if(s.charAt(i) == t.charAt(idx))
                matchChar ++;
        }


        System.out.println(matchChar == s.length());
    }
}
