package String;

public class ReverseString {

    public static void main(String args[]) {
        String str = "Hi I am John";
        int lastStrIdx = str.length();
        String result = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            if (str.charAt(i) == ' ' || i == 0) {
                result = result + str.substring(i, lastStrIdx);
                lastStrIdx = i ;
            }
        }

        System.out.println(">>"+result);



        String str2 = "Hi I am John";
        String res = "";
        int lastIdx = str2.length();
        for (int i = str2.length()-1; i >=0 ; i--) {
            if (str2.charAt(i) == ' ') {
                int j = i + 1;
                while (j < lastIdx) {
                    res = res + str2.charAt(j);
                    j++;
                }
                res = res + " ";
                lastIdx = i;
            }
        }


        System.out.println(">>"+res);
    }
}
