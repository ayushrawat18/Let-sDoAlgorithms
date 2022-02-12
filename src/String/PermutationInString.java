package String;

import java.util.*;

public class PermutationInString {

public static void main(String args[]) {

    System.out.println(checkInclusion("adc", "dcda"));
}

    /**
     * Sliding window problem
     * @param s1
     * @param s2
     * @return
     */
    public static boolean checkInclusion(String s1, String s2) {

    int s1Arr[] = new int[128];
    int s2Arr[] = new int[128];
    int curWindowLen = 0;

        for (int i=0; i<s1.length(); i++) {
            s1Arr[s1.charAt(i)] += 1;
        }


        for (int i = 0; i <s2.length() ; i++) {
            s2Arr[s2.charAt(i)] +=1;
            curWindowLen ++;

            if (curWindowLen == s1.length()) {
               if(validateArr(s1Arr, s2Arr))
                    return true;

               curWindowLen --;
               s2Arr[s2.charAt(i-curWindowLen)] -=1;
            }
        }
        return false;
    }

    private static boolean validateArr(int[] s1Arr, int[] s2Arr) {
        for (int i = 0; i < 128; i++) {
            if (s1Arr[i] != s2Arr[i])
                return false;
        }
        return true;
    }
}
