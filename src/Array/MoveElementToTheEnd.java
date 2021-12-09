package Array;

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
    }

    public static Integer [] moveElementToTheEnd (List<Integer> list, int toMove) {

        int i = 0;
        int j = list.size() - 1;

        while (i < j) {

            //while
        }

        return new Integer[0];
    }
}
