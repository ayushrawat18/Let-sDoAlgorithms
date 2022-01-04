package String;

public class MoveSpacesToEnd {
    public static void main(String args[]) {
        String str = "hel     lo world ";
        System.out.println(moveSpacesToEnd(str));
    }

    public static String moveSpacesToEnd(String str) {

         char ch[] = str.toCharArray();
         int startIdx = 0, endIdx = str.length()-1;

         while (startIdx < endIdx) {
             while (ch[endIdx] == ' ') {
                 endIdx --;
             }
             if(ch[startIdx] == ' ') {
                 swap(startIdx, endIdx, ch);
             }
             startIdx ++;
         }
         return String.valueOf(ch);

    }

    private static void swap(int startIdx, int endIdx, char[] ch) {
        char temp = ch[startIdx];
        ch[startIdx] = ch[endIdx];
        ch[endIdx] = temp;
    }
}
