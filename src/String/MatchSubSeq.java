package String;

public class MatchSubSeq {

    public static void main(String args[]) {

        String s = "aaaaaa", t = "bbaaaa";
        int idx = 0, matchChar =0;
        for(int i =0; i< s.length(); i++) {

            while (idx < t.length() && s.charAt(i) != t.charAt(idx)) {
                idx++;
            }

            if(idx < t.length() && s.charAt(i) == t.charAt(idx)) {
                matchChar++;
                idx ++;
            }
        }


        System.out.println(matchChar == s.length());
    }
}
