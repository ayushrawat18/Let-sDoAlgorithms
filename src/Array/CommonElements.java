package Array;

import java.util.ArrayList;
import java.util.List;

public class CommonElements {

    public static void main (String args[]) {
        int a[] = {1,2,3,5,6};
        int b[] = {3,4,5,6,7};
        int c[] = {6, 6,10,11,12,13,33,44};


        List<Integer> commonElements = findCommonElements(a, b, c);
        System.out.println(commonElements);
    }

    private static List<Integer> findCommonElements(int[] a, int[] b, int[] c) {
        int i=0, j=0, k=0;
        List<Integer> ans = new ArrayList<>();
        while (i < a.length && j < b.length && k < c.length) {
            if(a[i] == b[j] && b[j] == c[k])
                ans.add(a[i]);

            if(a[i] < b[j]) {
                i++;
                continue;
            }
            else if (b[j] < c[k]) {
                j++;
                continue;
            }
            else {
                k++;
                continue;
            }
        }
        return ans;
    }
}
