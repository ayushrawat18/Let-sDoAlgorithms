package Array;

import java.util.ArrayList;
import java.util.List;

public class FindRange {

    public static void main(String args[]) {
        int arr[] = {0,1,2,4,5,7};

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            while (i < arr.length - 1 && arr[i] + 1 == arr[i + 1]) {
                i++;
            }

            if (num != arr[i]) {
                ans.add(num + "->"+arr[i]);
            } else
                ans.add(num+"");
        }


        System.out.println(""+ans);
    }
}
