package Array;

import java.util.HashSet;
import java.util.Set;

public class SeriesLightBulbQues {
    public static void main (String args[]) {
        int arr[] = {5,4,3,2,1};
        int result = solution(arr);
        System.out.println(result);
    }

    private static int solution(int[] arr) {

        Set<Integer> bulbs = new HashSet<>();
        int result = 0, nextExpectedBulb = 1;
        for (int i = 0; i < arr.length; i++) {
            bulbs.add(arr[i]);
            if (nextExpectedBulb == arr[i]) {
                result ++;
            } else
                continue;

            while (!bulbs.isEmpty()) {
                if (bulbs.contains(nextExpectedBulb)) {
                    bulbs.remove(nextExpectedBulb);
                    nextExpectedBulb = nextExpectedBulb +1;
                } else
                    break;
            }


        }
        return result;
    }
}
