package Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayMerger {


    public static void main(String args[]) {

        List<int[]> arr = new ArrayList<>();
        arr.add(new int[]{1,2});
        arr.add(new int[]{2,5});
        arr.add(new int[]{6,7});
        arr.add(new int[]{8,10});
        arr.add(new int[]{9,11});

       List<int[]> arrF =  mergeArray(arr);
        int temp[] = new int[2];
        for (int i = 0; i <arrF.size(); i++) {
            temp = arrF.get(i);
            System.out.println("["+temp[0]+", "+temp[1]+" ]");
        }

    }

    public static List<int[]> mergeArray(List<int[]> arr) {

        int start[] = arr.get(0);
        int next [] = new int[2];
        int current[] = null;
        List<int[]> arrF = new ArrayList<>();

        for (int i = 0; i < arr.size()-1; i++) {
            next = arr.get(i+1);

            if(next[0] <= start[1]) {
                current = merge(start , next);
                start = current;
                next = null;
            } else {
                arrF.add(start);
                current = null;
                start = next;
            }
        }

        if(current != null)
            arrF.add(current);
        if (next != null)
            arrF.add(next);

        return arrF;
    }

    public static int[] merge(int[] start, int[] next) {

        return new int[]{start[0], next[1]};
    }

}
