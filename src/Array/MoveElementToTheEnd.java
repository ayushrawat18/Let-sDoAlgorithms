package Array;

import commons.Commons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoveElementToTheEnd {

    public static void main(String args[]) {

        Integer arr[] = new Integer[] {1,2,-1,1,2,1,1,1,0};
        List<Integer> list = Arrays.asList(arr);
        int toMove = 1;
        moveElementToTheEnd(list, toMove);
        Commons.printList(list);

    }

    public static void moveElementToTheEnd (List<Integer> list, int toMove) {

        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            while (list.get(j) == toMove)
                j--;

            if (list.get(i) == toMove) {
                swap(list, i, j);
            }
            i++;
        }


    }

    private static void swap(List<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
