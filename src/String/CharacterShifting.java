package String;

public class CharacterShifting {

    public static void main(String args[]) {
        String str = "abc";

        System.out.println(charShift(str, 2));
    }

    public static String charShift(String str, int key) {

        int asciCode = 0;
        String newStr = new String();
        for (int i = 0; i < str.length(); i++) {
            asciCode = (int) str.charAt(i) + key;
            if(asciCode > 122)
                asciCode = asciCode - 122 + 96;

            newStr = newStr + (char) asciCode;
        }

        return newStr;
    }
}
